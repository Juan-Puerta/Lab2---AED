package model;

import interfaces.IStack;

public class Stack<T, K> implements IStack<T> {

	private int size;
	private Node<T, K> root;
	private Node<T, K> last;
	
	public Stack() {
		// TODO Auto-generated constructor stub
		size = 0;
		root = null;
		last = null;
	}
	
	@Override
	public void push(T object) {
		// TODO Auto-generated method stub
		Node<T, K> theNodo = new Node<T, K>(object);
		if(root == null) {
			root = theNodo;
			last = theNodo;
		}else {
			Node<T, K> aux = root;
			while(aux.getNext() != null) {
				aux = aux.getNext();
			}
			aux.setNext(theNodo);
			last = theNodo;
		}
		size++;
	}

	@Override
	public T pop() {
		// TODO Auto-generated method stub
		if(root == null) {
			return null;
		}else {
			if(size > 1) {
				Node<T, K> aux = root;
				while(aux.getNext() != last && aux.getNext() != null) {
					aux = aux.getNext();
				}
				Node<T, K> deleted = aux.getNext();
				last = aux;
				aux.setNext(null);
				size--;
				return deleted.getDate();
			}else {
				Node<T, K> deleted = root;
				root = null;
				last = null;
				size--;
				return deleted.getDate();
			}
		}
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		return last.getDate();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.size;
	}

}
