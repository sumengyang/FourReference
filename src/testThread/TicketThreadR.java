package testThread;

public class TicketThreadR implements Runnable {
	private int num = 50;

	// 总共票数设定为5张
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			if (this.num > 0) {
				// 打印买票信息
				System.out.println(Thread.currentThread().getName() + "买票: "
						+ this.num--);
			}
		}
	}

	public static void main(String[] args) {
		TicketThreadR ticketThread = new TicketThreadR();
		Thread th1 = new Thread(ticketThread);
		// 线程一

		th1.setName("售票口一");
		Thread th2 = new Thread(ticketThread);
		// 线程二
		th2.setName("售票口二");
		Thread th3 = new Thread(ticketThread);
		// 线程三
		th3.setName("售票口三");
		th1.start();
		th2.start();
		th3.start();
	}
}
