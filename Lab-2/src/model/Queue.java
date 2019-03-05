package model;

import interfaces.IQueue;

public class Queue<T> implements IQueue<T> {

	private int size;
	private Node<T> root;
	private Node<T> last;
	
	public Queue() {
		size = 0;
		root = null;
		last = null;
	}
	
	@Override
	public void enqueue(T object) {
		// TODO Auto-generated method stub
		Node<T> theNodo = new Node<T>(object);
		if(root == null) {
			root = theNodo;
			last = theNodo;
		}else {
			Node<T> aux = root;
			while(aux.getNext() != null) {
				aux = aux.getNext();
			}
			aux.setNext(theNodo);
			last = theNodo;
		}
		size++;
	}

	@Override
	public T dequeue() {
		// TODO Auto-generated method stub
		if(root == null) {
			return null;
		}else {
			Node<T> deleted = root;
			root = deleted.getNext();
			size--;
			return deleted.getDate();
		}
	}

	@Override
	public T front() {
		// TODO Auto-generated method stub
		if(root == null) {
			return null;
		}else {
			return root.getDate();
		}
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.size;
	}

	@Override
	public T back() {
		// TODO Auto-generated method stub
		return this.last.getDate();
	}

}
