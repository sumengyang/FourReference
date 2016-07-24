package testThread;

public class MainThread extends Thread {
	@Override
	public void run() {
		Thread sonthread = new a();
		sonthread.start();
	}

	public static void main(String[] args) throws InterruptedException {
		Thread fatherThread = new MainThread();
		fatherThread.start();
		Thread.sleep(5000);
		fatherThread.interrupt();
		Thread.sleep(2000);
		System.out.println("fatherThread.isAlive()?  " + fatherThread.isAlive());
	}
}

class a extends Thread {
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("我还活着");
		}
	}
}