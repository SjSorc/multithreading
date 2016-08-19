package wait.producer.consumer;

public class Run {

	public static void main(String[] args) {

		/**
		 * Here producers produce every 1 second and consumer consumes every 2
		 * seconds
		 * 
		 * Q. What if the Producers try to insert at the same time?
		 */

		SharedResource resource = new SimpleSharedResource();

		Producer p1 = new Producer(resource, 1, 5);
		Producer p2 = new Producer(resource, 94, 105);

		Consumer c = new Consumer(resource);

		p1.start();
		p2.start();

		try {
			Thread.sleep(1000 * 2);
			c.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
