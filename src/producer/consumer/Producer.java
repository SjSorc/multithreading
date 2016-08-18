package producer.consumer;

public class Producer extends Thread{
	
	private SharedResource sharedResource;
	private int start;
	private int end;
	
	public Producer(SharedResource sharedResource, int start, int end){
		this.sharedResource = sharedResource;
		this.start = start;
		this.end = end;
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
			
			Thread.sleep(1000 * 1);
			
			System.out.println("Producer: producing => " + element);
			this.sharedResource.addElement(element);
		
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
