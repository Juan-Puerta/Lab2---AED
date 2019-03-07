package interfaces;

public interface IHashTable<T, K> {

	void insert(T object, K key);
	T delete(K key);
	T search(K key);
	
}
