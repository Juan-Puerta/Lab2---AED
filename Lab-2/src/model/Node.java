package model;

public class Node<T, K> {

	private T date;
	private Node<T, K> next;
	private K key;
	
	public Node(T date) {
		this.date = date;
		this.next = null;
		this.key = null;
	}

	public Node<T, K> getNext() {
		return next;
	}

	public void setNext(Node<T, K> next) {
		this.next = next;
	}

	public T getDate() {
		return date;
	}

	public void setDate(T date) {
		this.date = date;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}
	
}
