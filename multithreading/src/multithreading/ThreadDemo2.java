package multithreading;

public class ThreadDemo2 {
	class RedThread extends Thread {
		@Override
		public void run() {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Red-" + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	class YellowThread implements Runnable {
		@Override
		public void run() {
			for (int i = 1; i <= 5; i++) {
				System.out.println("yellow-" + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}


	public class ThreadDemo {
		public static void main(String[] args) throws InterruptedException {
			YellowThread y = new YellowThread();
			Thread t = new Thread(y);
			t.start();
			t.join();

			RedThread j = new RedThread();
			j.start();//
			j.join();
			for (int i = 1; i <= 5; i++) {
				System.out.println("Green-" + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	

	

