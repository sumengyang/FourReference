package testThread;

public class TicketThreadR implements Runnable {
	private int num = 50;

	// �ܹ�Ʊ���趨Ϊ5��
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			if (this.num > 0) {
				// ��ӡ��Ʊ��Ϣ
				System.out.println(Thread.currentThread().getName() + "��Ʊ: "
						+ this.num--);
			}
		}
	}

	public static void main(String[] args) {
		TicketThreadR ticketThread = new TicketThreadR();
		Thread th1 = new Thread(ticketThread);
		// �߳�һ

		th1.setName("��Ʊ��һ");
		Thread th2 = new Thread(ticketThread);
		// �̶߳�
		th2.setName("��Ʊ�ڶ�");
		Thread th3 = new Thread(ticketThread);
		// �߳���
		th3.setName("��Ʊ����");
		th1.start();
		th2.start();
		th3.start();
	}
}
