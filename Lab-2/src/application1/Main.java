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

//	private static String nombre;
//	private static Library library;
//	private static Scanner sc;
	
	public static void main(String args[]) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int mountBox = Integer.parseInt(br.readLine());
		int mountShelving = Integer.parseInt(br.readLine());
		
		
		Library theLibrary = new Library(mountBox, mountShelving);
		
		for(int i = 0; i < mountShelving; i++) {
			
			String[] infoBookShelf = br.readLine().split(" ");
			BookShelf theBookShelf = new BookShelf(infoBookShelf[0]);
			
			for(int j = 0; j < Integer.parseInt(infoBookShelf[1]); j++) {
				String[] infoShelf = br.readLine().split(" ");
				Shelf theShelf = new Shelf(infoShelf[0], Integer.parseInt(infoShelf[2]));
				Book theBook = new Book(Integer.parseInt(infoShelf[1]), infoShelf[0]);
				theShelf.getQueueBooks().enqueue(theBook);
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
//		System.out.println(theLibrary.getTheBookShelfs()[1].getShelfs().search("112").getQueueBooks().front().getValue());
		int amountClients = Integer.parseInt(br.readLine());
		for(int i = 0; i < amountClients; i++) {
			String[] infoClient = br.readLine().split(" ");
			Client theClient = new Client(infoClient[0], i+infoClient.length);
			for(int j = 1; j < infoClient.length; j++) {
				theClient.getPurchase().push(theLibrary.searchBook(infoClient[j]));
			}
			theLibrary.getTheClients().insert(theClient);
		}
		
		System.out.println(theLibrary.attend(theLibrary.getTheClients()));
		
		
//		library = new Library(3, 3);
//		banner();
	}
	
//	private void banner() {
//		System.out.println("================================================================");
//		System.out.println("================================================================");
//		System.out.println("	 BIENVENIDO AL BANNER DE LA BIBLIOTECA VALLECAUCANA");
//		System.out.println("================================================================");
//		System.out.println("================================================================");
//		System.out.println("INGRESE SU NOMBRE: ");
//		nombre = sc.nextLine();	
//		boolean salir = false;
//	       int opcion; 	        
//	       while(!salir){
//	    	   System.out.println("================================================================");
//	   		   System.out.println("================================================================");
//	           System.out.println("		1. Agregar un libro");
//	           System.out.println("		2. Buscar un libro");
//	           System.out.println("		3. Pagar");
//	           System.out.println("		4. Salir");
//	           System.out.println("================================================================");
//	   		   System.out.println("================================================================");
//	           System.out.println("ESCRIBE UNA DE LAS OPCIONES");
//	           opcion = sc.nextInt();
//	            
//	           switch(opcion){
//	               case 1:
//	                  agregar();
//	                   break;
//	               case 2:
//	                   buscar();
//	                   break;
//	                case 3:
//	                   pagar();
//	                   break;
//	                case 4:
//	                   salir=true;
//	                   System.out.println("Gracias por su visita");
//	                   break;
//	                default:
//	                   System.out.println("Solo números entre 1 y 4");
//	           }
//	            
//	       }
//	        
//	}
//
//	private void pagar() {
//		//aqui se pagaria
//	}
//
//	private void agregar() {
//		System.out.println("INGRESE EL VALOR DEL LIBRO: ");
//		int value = sc.nextInt();
//		System.out.println("INGRESE EL ISBN DEL LIBRO: ");
//		String isbn = sc.nextLine();
//		System.out.println("INGRESE LA CANTIDAD DE LIBROS A AGREGAR: ");
//		int quantify = sc.nextInt();
//		//crea el libro y lo agrega a un estanteria
//		
//	}
//	
//	private void buscar() {
//		System.out.println("INGRESE EL ISBN DEL LIBRO A BUSCAR: ");
//		String isbn = sc.nextLine();
//		//busca en las estanterias el libro
//	}


//	public static void main(String[] args) {
//		Main main = new Main();
//	}

}
