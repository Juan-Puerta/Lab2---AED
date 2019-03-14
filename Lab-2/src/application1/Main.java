package application1;

import java.awt.PageAttributes;
import java.awt.print.Book;
import java.util.Scanner;

import model.Library;

public class Main {

	private static String nombre;
	private static Library library;
	private static Scanner sc;
	
	public Main() {
		sc = new Scanner(System.in);
		library = new Library(3, 3);
		bienvenida();
		banner();
	}
	
	private void banner() {
		System.out.println("================================================================");
		System.out.println("================================================================");
		System.out.println("	   BIENVENIDO AL BANNER DE LA BIBLIOTECA VALLECAUCANA");
		System.out.println("================================================================");
		System.out.println("================================================================");
		boolean salir = false;
	       int opcion; 	        
	       while(!salir){
	            
	           System.out.println("1. Agregar un libro");
	           System.out.println("2. Buscar un libro");
	           System.out.println("3. Pagar");
	           System.out.println("4. Salir");
	            
	           System.out.println("Escribe una de las opciones");
	           opcion = sc.nextInt();
	            
	           switch(opcion){
	               case 1:
	                  agregar();
	                   break;
	               case 2:
	                   buscar();
	                   break;
	                case 3:
	                   pagar();
	                   break;
	                case 4:
	                   salir=true;
	                   break;
	                default:
	                   System.out.println("Solo números entre 1 y 4");
	           }
	            
	       }
	        
	}

	private void pagar() {
		// TODO Auto-generated method stub
		
	}

	private void agregar() {
		System.out.println("INGRESE EL VALOR DEL LIBRO: ");
		int value = sc.nextInt();
		System.out.println("INGRESE EL ISBN DEL LIBRO: ");
		String isbn = sc.nextLine();
		System.out.println("INGRESE LA CANTIDAD DE LIBROS A AGREGAR: ");
		int quantify = sc.nextInt();
		
	}
	
	private void buscar() {
		System.out.println("INGRESE EL ISBN DEL LIBRO A BUSCAR: ");
		String isbn = sc.nextLine();
	}

	private void bienvenida() {
		
		System.out.println("INGRESE SU NOMBRE: ");
		nombre = sc.nextLine();	
	}

	public static void main(String[] args) {
		Main main = new Main();
	}

}
