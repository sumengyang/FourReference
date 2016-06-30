package testThread;

public class SimpleThread extends Thread {
	public SimpleThread(String str) {
		super(str);
	}

	public void run() {// 复写父类的run()方法
		for (int i = 0; i < 20; i++) {
			System.out.println(i + " " + getName());
			try {
//				sleep(0);
				sleep((int) (Math.random() * 1000));// 线程休眠，把控制权交出去
			} catch (InterruptedException e) {
			}
		}
		System.out.println("DONE! " + getName()+"\t" + currentThread().getName());
	}

	public static void main(String args[]) {
		new SimpleThread("First").start();
		new SimpleThread("Second").start();
	}
}