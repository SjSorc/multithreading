package synchroniz.producer.consumer;

import java.util.*;

public class SimpleSharedResource implements SharedResource {

	private Queue<Integer> queue;

	public SimpleSharedResource() {
		this.queue = new LinkedList<Integer>();
	}

	@Override
	public synchronized void addElement(Integer element) {
		try {
			Thread.sleep(1000 * 2);
			this.queue.add(element);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	@Override
	public synchronized Integer getElement() {
		try {
			Thread.sleep(1000 * 2);			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return this.queue.poll();
	}

	@Override
	public boolean isEmpty() {
		return this.queue.isEmpty();
	}
}
