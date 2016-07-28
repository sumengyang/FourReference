package ThreadCommucation;

/**
 * 通过实现Runnable接口实现线程的共享变量
 */
public class Interfacaesharethread {
	public static void main(String[] args) {
		IMythread mythread = new IMythread();
		new Thread(mythread).start();
		new Thread(mythread).start();
		new Thread(mythread).start();
		new Thread(mythread).start();
	}
}

/* 实现Runnable接口 */
class IMythread implements Runnable {
	int index = 0;

	public synchronized void run() {
		while (true)
			System.out.println(Thread.currentThread().getName()
					+ "is running and the index is " + index++);
	}
}