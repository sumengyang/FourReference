package testThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorTest {

	public static void main(String[] args) {
		// cachedThreadPool();
		// fixedThreadPool();
		// System.out.println(Runtime.getRuntime().availableProcessors());

		// scheduledThreadPool();
		// scheduledPeriodThreadPool();
		singleThreadPool();
	}

	public static void cachedThreadPool() {
		ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
		for (int i = 0; i < 100; i++) {
			final int index = i;
			try {
				Thread.sleep(index * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			cachedThreadPool.execute(new Runnable() {
				public void run() {
					System.out
							.println(Thread.currentThread().getName() + index);
				}
			});
		}
	}

	public static void fixedThreadPool() {
		ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
		for (int i = 0; i < 10; i++) {
			final int index = i;
			fixedThreadPool.execute(new Runnable() {
				public void run() {
					try {
						System.out.println(Thread.currentThread().getName()
								+ " " + index);
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
		}
	}

	public static void scheduledThreadPool() {
		ScheduledExecutorService scheduledThreadPool = Executors
				.newScheduledThreadPool(5);
		scheduledThreadPool.schedule(new Runnable() {
			public void run() {
				System.out.println("delay 3 seconds");
			}
		}, 3, TimeUnit.SECONDS);
	}

	public static void scheduledPeriodThreadPool() {
		ScheduledExecutorService scheduledThreadPool = Executors
				.newScheduledThreadPool(5);
		scheduledThreadPool.scheduleAtFixedRate(new Runnable() {
			public void run() {
				System.out
						.println("delay 1 second, and execute every 3 seconds");
			}
		}, 1, 3, TimeUnit.SECONDS);
	}

	public static void singleThreadPool() {
		ExecutorService fixedThreadPool = Executors.newSingleThreadExecutor();
		for (int i = 0; i < 100; i++) {
			final int index = i;
			fixedThreadPool.execute(new Runnable() {
				public void run() {
					try {
						System.out.println(Thread.currentThread().getName()
								+ " " + index);
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
		}
	}
}
