package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Client;

import model.PriorityQueue;

class TestPriorityQueue {
	
	private PriorityQueue<Integer> priorityQueueInteger;
	private PriorityQueue<String> priorityQueueString;
	private PriorityQueue<Client> priorityQueueClient;

	
	public void stageOne() {
		priorityQueueInteger = new PriorityQueue<Integer>(100);
		priorityQueueInteger.insert(1);
		priorityQueueInteger.insert(2);
		priorityQueueInteger.insert(3);
		priorityQueueInteger.insert(4);
		priorityQueueInteger.insert(5);
	}
	
	public void stageTwo() {
		priorityQueueString = new PriorityQueue<String>(100);
		priorityQueueString.insert("Dado");
		priorityQueueString.insert("Elefante");
		priorityQueueString.insert("Yuca");
	}
	
	public void stageThree() {
		priorityQueueClient = new PriorityQueue<Client>(100);
		Client cl1 = new Client("Juan",2);
		Client cl2 = new Client("Ana",5);
		priorityQueueClient.insert(cl1);
		priorityQueueClient.insert(cl2);
		
	}
	
	
	@Test
	public void testInsertStageOne() {
		stageOne();
		priorityQueueInteger.insert(0);
		assertEquals(0, (int)priorityQueueInteger.minimum());
	}
	
	@Test
	public void testInsertStageTwo() {
		stageTwo();
		priorityQueueString.insert("Ada");
		assertEquals("Ada", priorityQueueString.minimum());
	}
	
	@Test
	public void testInsertStageThree() {
		stageThree();
		Client cl3 = new Client("Carlos",1);
		priorityQueueClient.insert(cl3);
		assertEquals(cl3, priorityQueueClient.minimum());
	}
	
	
	@Test
	public void testExtractMinStageOne() {
		stageOne();
		assertEquals(1, (int)priorityQueueInteger.extractMin());
	}
	
	@Test
	public void testExtractMinStageTwo() {
		stageTwo();
		assertEquals("Dado", priorityQueueString.extractMin());
	}
	
	@Test
	public void testExtractMinStageThree() {
		stageThree();
		assertEquals("Juan", priorityQueueClient.extractMin().getId());
	}
	
	
	
	@Test
	public void testMinumumStageOne() {
		stageOne();
		assertEquals(1, (int)priorityQueueInteger.minimum());
	}
	
	@Test
	public void testMinimumStageTwo() {
		stageTwo();
		assertEquals("Dado", priorityQueueString.minimum());
	}
	
	@Test
	public void testMinimumStageThree() {
		stageThree();
		assertEquals("Juan", priorityQueueClient.minimum().getId());
	}
	

}
