package model;

public class Client implements Comparable<Client> {
	
	
	private String id;
	private int purchaseAmount;
	private Stack<Book, String> purchase;
	private int time;
	private String theBought;
	
	public Client(String id, int time) {
	
		this.id = id;
		this.purchase = new Stack<Book, String>() ;
		this.purchaseAmount = 0;
		this.time = time;
		this.theBought = "";
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
		this.purchaseAmount += purchaseAmount;
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
		this.time += time;
	}

	

	public String getTheBought() {
		return theBought;
	}


	public void setTheBought(String theBought) {
		this.theBought += theBought+" ";
	}


	@Override
	public int compareTo(Client theClient) {
		// TODO Auto-generated method stub
		  if (time > theClient.getTime()) {
	            return 1;
	        } else if (time < theClient.getTime()) {
	            return -1;
	        } else {
	            return 0;
	        }
	}
	
	
	public void buyBook() {
		Book aux = null;
			if(purchase.size()!=0) {
				aux = purchase.pop();
				theBought += aux.getIsbn()+" ";
				purchaseAmount += aux.getValue();
			}
		
	}

}
