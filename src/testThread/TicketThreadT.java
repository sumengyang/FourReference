package testThread;

public class TicketThreadT extends Thread {
	private int num = 5;

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
		TicketThreadT th1 = new TicketThreadT();
		// 线程一
		th1.setName("售票口一");
		TicketThreadT th2 = new TicketThreadT();
		// 线程二
		th2.setName("售票口二");
		TicketThreadT th3 = new TicketThreadT();
		// 线程三
		th3.setName("售票口三");
		// 分别启动三个线程
		th1.start();
		th2.start();
		th3.start();
	}
}
