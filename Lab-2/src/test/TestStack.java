package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Book;
import model.Stack;

class TestStack {
	
	private Stack<Integer, String> theStackInteger;
	private Stack<String, String> theStackString;
	private Stack<Book, Integer> theStackBook;
	
	public void stageOne() {
		theStackInteger = new Stack<Integer, String>();
		theStackInteger.push(1);
		theStackInteger.push(2);
		theStackInteger.push(3);
		theStackInteger.push(4);
		theStackInteger.push(5);
	}

	
	public void stageTwo() {
		theStackString = new Stack<String, String>();
		theStackString.push("Hola");
		theStackString.push("Soy");
	}
	
	
	public void stageThree() {
		theStackBook = new Stack<Book, Integer>();
		Book l1 = new Book(12000);
		Book l2 = new Book(80000);
		Book l3 = new Book(50000);
		theStackBook.push(l1);
		theStackBook.push(l2);
		theStackBook.push(l3);
	}
	
	
	@Test
	public void testPushStageOne() {
		stageOne();
		theStackInteger.push(6);
		assertEquals(6, (int)theStackInteger.peek());
		
	}
	
	@Test
	public void testPushStageTwo() {
		stageTwo();
		theStackString.push("Juan");
		assertEquals("Juan",theStackString.peek());
		
	}
	
	@Test
	public void testPopStageOne() {
		stageOne();
		assertEquals(5, (int)theStackInteger.pop());
		assertEquals(4, (int)theStackInteger.peek());
	}
	
	@Test
	public void testPopStageTwo() {
		stageTwo();
		assertEquals("Soy",theStackString.pop());
		assertEquals("Hola",theStackString.peek());
	}
	
	@Test
	public void testPeekStageOne() {
		stageOne();
		assertEquals(5, (int)theStackInteger.peek());	
	}
	
	@Test
	public void testPeekStageTwo() {
		stageTwo();
		assertEquals("Soy", theStackString.peek());	
	}
	
	@Test
	public void testPushStageThree() {
		stageThree();
		Book l4 = new Book(100000);
		theStackBook.push(l4);
		assertEquals(100000, theStackBook.peek().getValue());
		assertEquals(4,theStackBook.size());
	}
	
	@Test
	public void testPopStageThree() {
		stageThree();
		assertEquals(50000, theStackBook.pop().getValue());
		assertEquals(2, theStackBook.size());
	}
	
	
	@Test 
	public void testPeekStageThree() {
		stageThree();
		assertEquals(50000, theStackBook.peek().getValue());
		assertEquals(3, theStackBook.size());
	}
	
}
