package ThreadCommucation;

/**
 * ͨ��ʵ��Runnable�ӿ�ʵ���̵߳Ĺ������
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

/* ʵ��Runnable�ӿ� */
class IMythread implements Runnable {
	int index = 0;

	public synchronized void run() {
		while (true)
			System.out.println(Thread.currentThread().getName()
					+ "is running and the index is " + index++);
	}
}