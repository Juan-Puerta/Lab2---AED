package model;

public class Library {

	private int amountBookShelfs;
	private int amountBoxes;
	private BookShelf[] theBookShelfs;
	private PriorityQueue<Client> theClients;
	private Client[] boxes;
	

	public Library(int amountBoxes, int amountBookShelfs) {
		
		this.amountBookShelfs = amountBookShelfs;
		this.amountBoxes = amountBoxes;
		this.theClients = new PriorityQueue<Client>(100);
		this.theBookShelfs = new BookShelf[amountBookShelfs];
		this.boxes = new Client[amountBoxes];
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
	
	public Book searchBook(String isbn) {
		Book theBook = null;
		boolean found = false; 
		for(int i = 0; i<theBookShelfs.length && !found; i++) {
			if(theBookShelfs[i].getShelfs().search(isbn)!=null) {
				theBook = theBookShelfs[i].getShelfs().search(isbn).getQueueBooks().dequeue();
				found = true;
			}
		}
		
		return theBook;
	}
	
	
	public String attend(PriorityQueue<Client> readyClients) {
		String theClientsReady = "";
		int people = 0;

			for(int i=0; i<boxes.length && readyClients.isEmpty() != true; i++) {
				boxes[i] = readyClients.extractMin();
//				System.out.println(boxes[i].getId());
				people++;
//				boxes[i].buyBook();
//				if(boxes[i].getPurchase().size()==0) {
//					theClientsReady += boxes[i].getId() + " "+boxes[i].getPurchaseAmount()+"\n"+ boxes[i].getTheBought()+" ";
//				}
//				System.out.println(boxes[i].getPurchase().peek().getIsbn());
//				System.out.println(boxes[i].getPurchase().peek().getValue());
			}
//	System.out.println(people);
			boolean finished = false;
//			System.out.println(amountBoxes);
			for(int i=0; i<amountBoxes && !finished ;i++) {
				if(boxes[i] != null) {
					boxes[i].buyBook();
//					System.out.println(boxes[i].getId());
				}
//				System.out.println("///////////////////////////////////////////////");
//				System.out.println(boxes[i].getPurchaseAmount());
//				System.out.println(boxes[i].getTheBought());
				if(boxes[i] != null) {
					if(boxes[i].getPurchase().size()==0) {
//						System.out.println(boxes[i].getId());
						theClientsReady += boxes[i].getId() + " "+boxes[i].getPurchaseAmount()+"\n"+ boxes[i].getTheBought()+"\n";
						boxes[i] = null;
						people--;
					}
				}
				if(readyClients.isEmpty() == false && boxes[i] == null) {
					boxes[i] = readyClients.extractMin();
					people++;
				}
				if(readyClients.isEmpty() == true && people == 0) {
					finished = true;
				}
				if(i == boxes.length-1) {
					i = -1;
//					System.out.println(boxes.length-1);
				}
//				System.out.println(people);
			}

		
		return theClientsReady;
		
	}
	
	
}
