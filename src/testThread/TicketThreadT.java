package testThread;

public class TicketThreadT extends Thread {
	private int num = 5;

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
		TicketThreadT th1 = new TicketThreadT();
		// �߳�һ
		th1.setName("��Ʊ��һ");
		TicketThreadT th2 = new TicketThreadT();
		// �̶߳�
		th2.setName("��Ʊ�ڶ�");
		TicketThreadT th3 = new TicketThreadT();
		// �߳���
		th3.setName("��Ʊ����");
		// �ֱ����������߳�
		th1.start();
		th2.start();
		th3.start();
	}
}
