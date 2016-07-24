package testThread;

public class DaemonThread {
	public static void main(String[] args) {
		 Thread daemonThread = new Thread(new ThreadDemo());
		 daemonThread.setName("测试thread");
		 // 设置为守护进程
		 daemonThread.setDaemon(true);
		 daemonThread.start();
		 System.out.println("isDaemon = " + daemonThread.isDaemon());
		 Thread t = new Thread(new ThreadDemo());
		 t.start();
	}
}

class ThreadDemo implements Runnable {
	public void run() {
		while (true) {
			for (int i = 1; i <= 100; i++) {
				System.out.println(Thread.currentThread().getName() + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

