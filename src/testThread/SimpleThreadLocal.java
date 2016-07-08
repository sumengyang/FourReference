package testThread;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SimpleThreadLocal<T> {
	private Map<Thread, T> valueMap = Collections.synchronizedMap(new HashMap<Thread, T>());

	public void set(T newValue) {
		valueMap.put(Thread.currentThread(), newValue);// ��Ϊ�̶߳���,ֵΪ���̵߳ı�������
	}

	public T get() {
		Thread currentThread = Thread.currentThread();
		T o = valueMap.get(currentThread);// ���ر��̶߳�Ӧ�ı���
		if (o == null && !valueMap.containsKey(currentThread)) {
			// �����Map�в�����,�ŵ�Map�б�������
			o = initialValue();
			valueMap.put(currentThread, o);
		}
		return o;
	}

	public void remove() {
		valueMap.remove(Thread.currentThread());
	}

	protected T initialValue() {
		return null;
	}
}