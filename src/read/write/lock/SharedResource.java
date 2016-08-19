package read.write.lock;

public interface SharedResource{
	
	void addElement(Integer element);
	Integer getElement();
	boolean isEmpty();
}
