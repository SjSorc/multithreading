package producer.consumer;

public class Producer extends Thread{
	
	private SharedResource sharedResource;
	private int start;
	private int end;
	private int executionTime;
	
	public Producer(SharedResource sharedResource, int start, int end, int executionTime){
		this.sharedResource = sharedResource;
		this.start = start;
		this.end = end;
		this.executionTime = executionTime;
	}
	
	@Override
	public void run(){
		while(this.end > this.start){
			this.produce(this.end);
			this.end--;
		}
	}
	/**
	 * takes 1 sec to produce
	 * @param element
	 */
	public void produce(Integer element){
		try {
			
			Thread.sleep(1000 * this.executionTime);
			
			System.out.println("Producer: producing => " + element);
			this.sharedResource.addElement(element);
		
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
