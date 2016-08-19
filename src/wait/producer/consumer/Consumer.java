package wait.producer.consumer;

public class Consumer extends Thread {

	private SharedResource sharedResource;

	public Consumer(SharedResource sharedResource) {
		this.sharedResource = sharedResource;
	}

	/**
	 * keep on eating till its empty
	 */
	@Override
	public void run() {

		while (true) {
			if (!this.sharedResource.isEmpty()) {
				this.consume();
			} else {
				try {
					this.sharedResource.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	}

	/**
	 * Consumer will take 1 seconds to consume
	 * 
	 */
	public void consume() {
		try {
			Thread.sleep(1000 * 1);
			Integer element = this.sharedResource.getElement();
			System.out.println("Consumer: consuming => " + element);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
