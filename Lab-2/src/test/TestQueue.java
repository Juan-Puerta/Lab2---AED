package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Book;
import model.Queue;
import model.Stack;

class TestQueue {

	private Queue<Integer, String> theQueueInteger;
	private Queue<String, String> theQueueString;
	private Queue<Book, Integer> theQueueBook;
	
	public void stageOne() {
		theQueueInteger = new Queue<Integer, String>();
		theQueueInteger.enqueue(1);
		theQueueInteger.enqueue(2);
		theQueueInteger.enqueue(3);
		theQueueInteger.enqueue(4);
		theQueueInteger.enqueue(5);
	}
	
	public void stageTwo() {
		theQueueString = new Queue<String, String>();
		theQueueString.enqueue("Hola");
		theQueueString.enqueue("Soy");
	}
	
	public void stageThree() {
		theQueueBook = new Queue<Book, Integer>();
		Book l1 = new Book(12000);
		Book l2 = new Book(80000);
		Book l3 = new Book(50000);
		theQueueBook.enqueue(l1);
		theQueueBook.enqueue(l2);
		theQueueBook.enqueue(l3);
	}

	@Test
	public void testEnqueueStageOne() {
		stageOne();
		theQueueInteger.enqueue(6);
		assertEquals(6, (int)theQueueInteger.back());
	}
	
	
	@Test 
	public void testEnqueueStageTwo() {
		stageTwo();
		theQueueString.enqueue("Juan");
		assertEquals("Juan", theQueueString.back());
	}
	
	@Test
	public void testDequeueStageOne() {
		stageOne();
		assertEquals(1,(int)theQueueInteger.dequeue());
		assertEquals(2,(int)theQueueInteger.front());
	}
	
	@Test
	public void testDequeueStageTwo() {
		stageTwo();
		assertEquals("Hola",theQueueString.dequeue());
		assertEquals("Soy",theQueueString.front());
	}
	
	@Test
	public void testFrontStageOne() {
		stageOne();
		assertEquals(1,(int)theQueueInteger.front());
	}
	
	@Test
	public void testFrontStageTwo() {
		stageTwo();
		assertEquals("Hola",theQueueString.front());
	}
	
	@Test
	public void testEnqueueStageThree() {
		stageThree();
		Book l4 = new Book(100000);
		theQueueBook.enqueue(l4);
		assertEquals(100000, theQueueBook.back().getValue());
		assertEquals(4,theQueueBook.size());
	}
	
	@Test
	public void testDequeueStageThree() {
		stageThree();
		assertEquals(12000, theQueueBook.dequeue().getValue());
		assertEquals(2, theQueueBook.size());
	}
	
	
	@Test 
	public void testFrontStageThree() {
		stageThree();
		assertEquals(12000, theQueueBook.front().getValue());
		assertEquals(3, theQueueBook.size());
	}
	
	
}
