package model;

public class Book {

	private int value;
	private String isbn;
	
	public Book(int value, String isbn) {
		this.isbn = isbn;
		this.value = value;
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
	
	
	
}
