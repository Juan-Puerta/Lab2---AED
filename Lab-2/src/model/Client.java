package model;

public class Client implements Comparable<Client> {
	
	
	private String id;
	private int purchaseAmount;
	private Stack<Book, String> purchase;
	private int time;
	
	public Client(String id, int purchaseAmount) {
	
		this.id = id;
		this.purchase = new Stack<Book, String>() ;
		this.purchaseAmount = purchaseAmount;
		this.time = time;
	}


	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public int getPurchaseAmount() {
		return purchaseAmount;
	}



	public void setPurchaseAmount(int purchaseAmount) {
		this.purchaseAmount = purchaseAmount;
	}



	public Stack<Book, String> getPurchase() {
		return purchase;
	}



	public void setPurchase(Stack<Book, String> purchase) {
		this.purchase = purchase;
	}


	public int getTime() {
		return time;
	}


	public void setTime(int time) {
		this.time = time;
	}


	@Override
	public int compareTo(Client arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
