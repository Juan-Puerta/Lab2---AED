package model;

public class Book {

	private String name;
	private String authorName;
	private String isbn;
	private int day;
	private int month;
	private int year;
	private boolean nationality;
	private int pages;
	private int value;
	
	public Book(String name, String authorName, String isbn, int day, int month, int year, boolean nationality,
			int pages, int value) {
		super();
		this.name = name;
		this.authorName = authorName;
		this.isbn = isbn;
		this.day = day;
		this.month = month;
		this.year = year;
		this.nationality = nationality;
		this.pages = pages;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isNationality() {
		return nationality;
	}

	public void setNationality(boolean nationality) {
		this.nationality = nationality;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	
	
	
	
	
}
