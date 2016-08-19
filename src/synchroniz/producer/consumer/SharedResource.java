package synchroniz.producer.consumer;

public interface SharedResource{
	
	void addElement(Integer element);
	Integer getElement();
	boolean isEmpty();
}
