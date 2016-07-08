package fourreference;

public class Singleton {
	// ��������ʲô��ͬ��
	private static Singleton instance = null;
	private static final Object object = new Object();

	// ����Ϊ˽�еĹ��캯��
	private Singleton() {
	}

	// ��̬��������
	public static Singleton getInstance() {
		// ������������������Ľ�
		if (instance == null) {
			synchronized (object) {
				if (instance == null)
					instance = new Singleton();
			}
		}
		return instance;
	}
}