package model;

public class User<T> {
	
	private T name;
	private T time;
	private int numBook;
	
	public User() {
		name = null;
		time = null;
		numBook = 0;
	}

	public T getName() {
		return name;
	}

	public void setName(T name) {
		this.name = name;
	}

	public T getTime() {
		return time;
	}

	public void setTime(T time) {
		this.time = time;
	}

	public int getNumBook() {
		return numBook;
	}

	public void setNumBook(int numBook) {
		this.numBook = numBook;
	}
	
	

}
