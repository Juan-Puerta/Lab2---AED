package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Book;
import model.HashTable;

class TestHashTable {

	private HashTable<Integer, String> theHashTableInteger;
	private HashTable<String, String> theHashTableString;
	private HashTable<Book, Integer> theHashTableBook;
	
	private void stageOne() {
		theHashTableInteger = new HashTable<Integer, String>();
		theHashTableInteger.insert(1, "1");
		theHashTableInteger.insert(2, "2");
		theHashTableInteger.insert(3, "3");
		theHashTableInteger.insert(4, "4");
		theHashTableInteger.insert(5, "5");
	}
	
	private void stageTwo() {
		theHashTableString = new HashTable<String, String>();
		theHashTableString.insert("Hola", "Hola");
		theHashTableString.insert("Soy", "Soy");
	}
	
	private void stageThree() {
		theHashTableBook = new HashTable<Book, Integer>();
		Book l1 = new Book(12000);
		Book l2 = new Book(80000);
		Book l3 = new Book(50000);
		theHashTableBook.insert(l1, l1.getValue());
		theHashTableBook.insert(l2, l2.getValue());
		theHashTableBook.insert(l3, l3.getValue());
	}

	@Test
	public void testInsertStageOne() {
		stageOne();
		theHashTableInteger.insert(6, "6");
		assertEquals(6, (int)theHashTableInteger.search("6"));
	}
	
	@Test
	public void testDeleteStageOne() {
		stageOne();
		assertEquals(2, (int)theHashTableInteger.delete("2"));
	}
	
	@Test
	public void testSearchStageOne() {
		stageOne();
		assertEquals(3, (int)theHashTableInteger.search("3"));
	}
	
	@Test
	public void testInsertStageTwo() {
		stageTwo();
		theHashTableString.insert("Juan", "Juan");
		assertEquals("Juan", theHashTableString.search("Juan"));
	}
	
	@Test
	public void testDeleteStageTwo() {
		stageTwo();
		assertEquals("Soy", theHashTableString.delete("Soy"));
		assertNull(theHashTableString.delete("Soy"));
	}
	
	@Test
	public void testSearchStageTwo() {
		stageTwo();
		assertEquals("Hola", theHashTableString.search("Hola"));
	}
	
	@Test
	public void testInsertStageThree() {
		stageThree();
		Book l4 = new Book(100000);
		theHashTableBook.insert(l4, l4.getValue());
		assertEquals(12000, theHashTableBook.search(12000).getValue());
	}
	
	@Test
	public void testDeleteStageThree() {
		stageThree();
		assertEquals(80000, theHashTableBook.delete(80000).getValue());
	}
	
	@Test
	public void testSearchStageThree() {
		stageThree();
		assertEquals(12000, theHashTableBook.delete(12000).getValue());
	}
	
}
