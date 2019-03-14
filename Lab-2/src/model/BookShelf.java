package model;

public class BookShelf {

	private HashTable<Shelf, String> shelfs;
	private String id;
	
	public BookShelf(String id) {
		super();
		this.shelfs = new HashTable<Shelf, String>();
		this.id = id;
	}

	public HashTable<Shelf, String> getShelfs() {
		return shelfs;
	}

	public void setShelfs(HashTable<Shelf, String> shelfs) {
		this.shelfs = shelfs;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
	
	
}
