package testThread;

import java.util.HashSet;
import java.util.Set;

public class TicketThreadR2S2 implements Runnable {
	private int num = 5; // �ܹ�Ʊ���趨Ϊ5��

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			sale();
		}
	}
Set set = new HashSet();
	private synchronized void sale() {
		try {
			Thread.sleep(200); // ��Ϣ200����
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (this.num > 0) {
			// ��ӡ��Ʊ��Ϣ
			System.out.println(Thread.currentThread().getName() + "��Ʊ: "
					+ this.num--);
		}
	}

	public static void main(String[] args) {
		TicketThreadR2S2 ticketThread = new TicketThreadR2S2();
		Thread th1 = new Thread(ticketThread); // �߳�һ
		th1.setName("��Ʊ��һ");
		Thread th2 = new Thread(ticketThread); // �̶߳�
		th2.setName("��Ʊ�ڶ�");
		Thread th3 = new Thread(ticketThread); // �߳���
		th3.setName("��Ʊ����");
		th1.start();
		th2.start();
		th3.start();
	}
}
