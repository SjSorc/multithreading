package producer.consumer;

import java.util.*;

public class SimpleSharedResource implements SharedResource{
	
	private Queue<Integer> queue;
	
	public SimpleSharedResource(){
		this.queue = new LinkedList<Integer>();
	}
	
	@Override
	public void addElement(Integer element){
		this.queue.add(element);
	}
	
	@Override
	public Integer getElement(){
		return this.queue.poll();
	}
	
	@Override
	public boolean isEmpty(){
		return this.queue.isEmpty();
	}
}
