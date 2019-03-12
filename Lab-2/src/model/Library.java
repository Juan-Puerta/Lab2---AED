package model;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Library {

	private int amountBookShelfs;
	private int amountBoxes;
	private HashTable<Book, String> books;
	private Queue<Client> clients;
	

	public Library(int amountBoxes, int amountBookShelfs) {
		
		this.amountBookShelfs = amountBookShelfs;
		this.amountBoxes = amountBoxes;
		this.clients = new PriorityQueue<Client>();
		this.books = new HashTable<Book, String>();
	}

	public int getAmountBookShelfs() {
		return amountBookShelfs;
	}

	public void setAmountBookShelfs(int amountBookShelfs) {
		this.amountBookShelfs = amountBookShelfs;
	}

	public int getAmountBoxes() {
		return amountBoxes;
	}

	public void setAmountBoxes(int amountBoxes) {
		this.amountBoxes = amountBoxes;
	}

	public HashTable<Book, String> getBooks() {
		return books;
	}

	public void setBooks(HashTable<Book, String> books) {
		this.books = books;
	}

	public Queue<Client> getClients() {
		return clients;
	}

	public void setClients(Queue<Client> clients) {
		this.clients = clients;
	}

//	public static void main (String[] args) {
//		Library laLibrary = new Library(3, 3);
//		Book elBook = new Book(10000, "123", 6);
//		laLibrary.getBooks().insert(elBook, elBook.getIsbn());
//		System.out.println(laLibrary.getBooks().search("123").getValue());
//		
//	}
	

	
}
