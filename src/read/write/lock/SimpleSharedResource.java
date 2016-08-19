package read.write.lock;

import java.util.*;

public class SimpleSharedResource implements SharedResource {

	private Queue<Integer> queue;
	private Object readLock = new Object();
	private Object writeLock = new Object();

	public SimpleSharedResource() {
		this.queue = new LinkedList<Integer>();
	}

	@Override
	public void addElement(Integer element) {
		try {
			synchronized (this.writeLock) {
				Thread.sleep(1000 * 2);
				this.queue.add(element);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	@Override
	public Integer getElement() {
		synchronized (this.readLock) {
			try {
				Thread.sleep(1000 * 2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return this.queue.poll();
		}
	}

	@Override
	public boolean isEmpty() {
		return this.queue.isEmpty();
	}
}
