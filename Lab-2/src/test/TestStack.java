package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Stack;

class TestStack {
	
	private Stack<Integer, String> theStackInteger;
	private Stack<String, String> theStackString;
	
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
	
	
}
