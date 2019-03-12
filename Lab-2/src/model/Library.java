package model;

import java.util.ArrayList;

public class Library {

	private String name;
	private String id;
	private String adress;
	
	private BookShelf[] shelves;
	private ArrayList<Client> clients = new ArrayList<>();

	public Library(String name, String id, String adress, BookShelf[] shelves, ArrayList<Client> clients) {
		super();
		this.name = name;
		this.id = id;
		this.adress = adress;
		this.shelves = shelves;
		this.clients = clients;
		
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public BookShelf[] getShelves() {
		return shelves;
	}

	public void setShelves(BookShelf[] shelves) {
		this.shelves = shelves;
	}


	public ArrayList<Client> getClients() {
		return clients;
	}


	public void setClients(ArrayList<Client> clients) {
		this.clients = clients;
	}
	
	
	
	
}
