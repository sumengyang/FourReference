package ThreadCommucation;

/**
 * ͨ���ڲ���ʵ���̵߳Ĺ������
 * 
 */
public class Innersharethread {
	public static void main(String[] args) {
		Mythread mythread = new Mythread();
		mythread.getThread().start();
		mythread.getThread().start();
		mythread.getThread().start();
		mythread.getThread().start();
	}
}

class Mythread {
	int index = 0;

	private class InnerThread extends Thread {
		public synchronized void run() {
			while (true) {
				System.out.println(Thread.currentThread().getName()
						+ "is running and index is " + index++);
			}
		}
	}

	public Thread getThread() {
		return new InnerThread();
	}
}