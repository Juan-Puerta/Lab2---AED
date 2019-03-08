package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Queue;
import model.Stack;

class TestQueue {

	private Queue<Integer, String> theQueueInteger;
	private Queue<String, String> theQueueString;
	
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
	
	
}
