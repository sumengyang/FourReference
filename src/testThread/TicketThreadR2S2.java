package testThread;

import java.util.HashSet;
import java.util.Set;

public class TicketThreadR2S2 implements Runnable {
	private int num = 5; // 总共票数设定为5张

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			sale();
		}
	}
Set set = new HashSet();
	private synchronized void sale() {
		try {
			Thread.sleep(200); // 休息200毫秒
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (this.num > 0) {
			// 打印买票信息
			System.out.println(Thread.currentThread().getName() + "买票: "
					+ this.num--);
		}
	}

	public static void main(String[] args) {
		TicketThreadR2S2 ticketThread = new TicketThreadR2S2();
		Thread th1 = new Thread(ticketThread); // 线程一
		th1.setName("售票口一");
		Thread th2 = new Thread(ticketThread); // 线程二
		th2.setName("售票口二");
		Thread th3 = new Thread(ticketThread); // 线程三
		th3.setName("售票口三");
		th1.start();
		th2.start();
		th3.start();
	}
}
