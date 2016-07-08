package fourreference;

public class Singleton {
	// 和上面有什么不同？
	private static Singleton instance = null;
	private static final Object object = new Object();

	// 设置为私有的构造函数
	private Singleton() {
	}

	// 静态工厂方法
	public static Singleton getInstance() {
		// 这个方法比上面有所改进
		if (instance == null) {
			synchronized (object) {
				if (instance == null)
					instance = new Singleton();
			}
		}
		return instance;
	}
}