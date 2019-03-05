package interfaces;

public interface IQueue<T> {

	void enqueue(T object);
	T dequeue();
	T front();
	int size();
	T back();
	
}
