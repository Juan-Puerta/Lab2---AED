package model;

public class Library {

	private int amountBookShelfs;
	private int amountBoxes;
	private BookShelf[] theBookShelfs;
	private PriorityQueue<Client> theClients;
	

	public Library(int amountBoxes, int amountBookShelfs) {
		
		this.amountBookShelfs = amountBookShelfs;
		this.amountBoxes = amountBoxes;
		this.theClients = new PriorityQueue<Client>(100);
		this.theBookShelfs = new BookShelf[amountBookShelfs];
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

	public PriorityQueue<Client> getTheClients() {
		return theClients;
	}

	public void setTheClients(PriorityQueue<Client> theClients) {
		this.theClients = theClients;
	}

	public BookShelf[] getTheBookShelfs() {
		return theBookShelfs;
	}

	public void setTheBookShelfs(BookShelf[] theBookShelfs) {
		this.theBookShelfs = theBookShelfs;
	}
	
	
}
