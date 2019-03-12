package model;

public class Book {

	private int value;
	private String isbn;
	private int amount;
	
	public Book(int value, String isbn, int amount) {
		super();
		this.value = value;
		this.isbn = isbn;
		this.amount = amount;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
		
	
}
