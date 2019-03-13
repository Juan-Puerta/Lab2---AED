package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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

	public static void main (String[] args) throws NumberFormatException, IOException {
	
		Library theLibrary = new Library(3,3);
		theLibrary.books.insert(new Book(17000, "331", 3), "331");
		theLibrary.books.insert(new Book(60000, "465", 3), "465");
		theLibrary.books.insert(new Book(80000, "612", 3), "612");
		theLibrary.books.insert(new Book(70000, "971", 3), "971");
		theLibrary.books.insert(new Book(30000, "441", 3), "441");
		theLibrary.books.insert(new Book(22000, "112", 3), "112");
		theLibrary.books.insert(new Book(28000, "229", 3), "229");
		theLibrary.books.insert(new Book(38000, "281", 3), "281");
		theLibrary.books.insert(new Book(43000, "333", 3), "333");
		theLibrary.books.insert(new Book(40000, "767", 3), "767");
		theLibrary.books.insert(new Book(65000, "287", 3), "287");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numClientes = Integer.parseInt(br.readLine());
		
//		Client theClient = new Client("Puerta", 1);
//		theClient.getPurchase().push(theLibrary.books.search("333"));
//		System.out.println(theClient.getPurchase().peek().getIsbn());
		
		for(int i = 0; i < numClientes; i++) {
			String[] infoClient = br.readLine().split(" ");
			Client theClient = new Client(infoClient[0], i+1);
			for(int j = 1; j < infoClient.length; j++) {
				theClient.getPurchase().push(theLibrary.books.search(infoClient[j]));
			}
			theClient.setTime(theClient.getPurchase().size());
//			System.out.println(theClient.getPurchase().size());
			theLibrary.clients.add(theClient);
		}
		
		
		
	}
	

	
}
