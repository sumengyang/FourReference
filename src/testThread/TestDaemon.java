package testThread;

public class TestDaemon extends Thread {
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("我还活着");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Thread t = new TestDaemon();
		t.start();
		Thread.sleep(5000);
		System.out.println("Main End");
	}
}