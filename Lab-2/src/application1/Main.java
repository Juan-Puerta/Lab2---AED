package application1;

import java.awt.PageAttributes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import model.Book;
import model.BookShelf;
import model.Client;
import model.Library;
import model.Shelf;

public class Main {
	
	public static void main(String args[]) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int mountTest = Integer.parseInt(br.readLine());
		for(int t = 0; t < mountTest; t++) {
			int mountBox = Integer.parseInt(br.readLine());
			int mountShelving = Integer.parseInt(br.readLine());
			
			
			Library theLibrary = new Library(mountBox, mountShelving);
			
			for(int i = 0; i < mountShelving; i++) {
				
				String[] infoBookShelf = br.readLine().split(" ");
				BookShelf theBookShelf = new BookShelf(infoBookShelf[0]);
				
				for(int j = 0; j < Integer.parseInt(infoBookShelf[1]); j++) {
					String[] infoShelf = br.readLine().split(" ");
					Shelf theShelf = new Shelf(infoShelf[0], Integer.parseInt(infoShelf[2]));
					for(int a = 0; a < Integer.parseInt(infoShelf[2]); a++) {
						Book theBook = new Book(Integer.parseInt(infoShelf[1]), infoShelf[0]);
						theShelf.getQueueBooks().enqueue(theBook);
					}
					theBookShelf.getShelfs().insert(theShelf, theShelf.getIsbn());
				}
				
				boolean insert = false;
				for(int j = 0; j < theLibrary.getTheBookShelfs().length && !insert; j++) {
					if(theLibrary.getTheBookShelfs()[j] == null) {
						theLibrary.getTheBookShelfs()[j] = theBookShelf;
						insert = true;
					}
				}	
			}
			int amountClients = Integer.parseInt(br.readLine());
			for(int i = 0; i < amountClients; i++) {
				String[] infoClient = br.readLine().split(" ");
				Client theClient = new Client(infoClient[0], i+infoClient.length);
				for(int j = 1; j < infoClient.length; j++) {
					Book aux = theLibrary.searchBook(infoClient[j]);
					if(aux != null) {
						theClient.getPurchase().push(aux);
					}
				}
				theLibrary.getTheClients().insert(theClient);
	
			}
			
			System.out.println(theLibrary.attend(theLibrary.getTheClients()));
		}
	}
}
