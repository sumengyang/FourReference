package ThreadCommucation;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class CommunicateWhitPiping {
	public static void main(String[] args) {
		/**
		 * �����ܵ������
		 */
		PipedOutputStream pos = new PipedOutputStream();
		/**
		 * �����ܵ�������
		 */
		PipedInputStream pis = new PipedInputStream();
		try {
			/**
			 * ���ܵ�����������������ӣ��˹���Ҳ��ͨ�����صĹ��캯����ʵ��
			 */
			pos.connect(pis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		/**
		 * �����������߳�
		 */
		Producer p = new Producer(pos);
		/**
		 * �����������߳�
		 */
		Consumer c = new Consumer(pis);
		/**
		 * �����߳�
		 */
		p.start();
		c.start();
	}
}

/**
 * �������߳�(��һ���ܵ������������)
 * 
 */
class Producer extends Thread {
	private PipedOutputStream pos;

	public Producer(PipedOutputStream pos) {
		this.pos = pos;
	}

	public void run() {
		int i = 8;
		try {
			pos.write(i);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

/**
 * �������߳�(��һ���ܵ������������)
 * 
 */
class Consumer extends Thread {
	private PipedInputStream pis;

	public Consumer(PipedInputStream pis) {
		this.pis = pis;
	}

	public void run() {
		try {
			System.out.println(pis.read());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}