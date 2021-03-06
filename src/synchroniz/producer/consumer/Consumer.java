package synchroniz.producer.consumer;

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
		while (!this.sharedResource.isEmpty()) {
			this.consume();
		}
	}

	/**
	 * Consumer will take 1 seconds to consume
	 * 
	 */
	public void consume() {
		Integer element = this.sharedResource.getElement();
		System.out.println("Consumer: consuming => " + element);

	}

}
