package heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Student implements Comparable<Student>{

	private String code;
	private String firstname;
	private String lastname;
	
	public Student(String code, String firstname, String lastname) {
		this.code = code;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	public String getCode(){
		return this.code;
	}
	
	public String getFirstname(){
		return this.firstname;
	}
	
	public String getLastname(){
		return this.lastname;
	}
	
	public String toString() {
        return "Student [code=" + code + ", First name=" + firstname + ", Last Name=" + lastname + "]";
    }
	
	public int compareTo(Student st) {
		return this.getCode().compareTo(st.getCode());
	}
	
	public static void main(String[] args){
		
		/* MinPriorityQueue with students */
		MinPriorityQueue<Student> pQueueA = new MinPriorityQueue(15);
		pQueueA.insert(new Student("A04598", "Andres", "Gomez"));
		pQueueA.insert(new Student("A02217", "Juliana", "Perez"));
		pQueueA.insert(new Student("A01098", "Diana", "Mendez"));

		/* PriorityQueue with students */
		PriorityQueue<Student> pQueue = new PriorityQueue<>();
		pQueue.offer(new Student("A04598", "Andres", "Gomez"));
		pQueue.offer(new Student("A02217", "Juliana", "Perez"));
		pQueue.offer(new Student("A01098", "Diana", "Mendez"));
		
		/* Printing PriorityQueue ordered by code */
		System.out.println("Priority Queue from Java Ordered by code");
		
		while(!pQueue.isEmpty()) {
			System.out.println(pQueue.poll());
		}
		
		/* Printing MinPriorityQueue ordered by code */
		System.out.println("\nPriority Queue using minHeap Ordered by code");
		
		while(!pQueueA.isEmpty()) {
			System.out.println(pQueueA.extractMin());
		}
		
		
		/* Printing PriorityQueue ordered by Last Name */
		System.out.println("\nPriority Queue Ordered by Last Name");
		
		PriorityQueue<Student> pQueue1 = new PriorityQueue<>(Comparator.comparing(Student::getLastname));
		pQueue1.offer(new Student("A04598", "Andres", "Gomez"));
		pQueue1.offer(new Student("A02217", "Juliana", "Perez"));
		pQueue1.offer(new Student("A01098", "Diana", "Mendez"));
		
		
		
		while(!pQueue1.isEmpty()) {
			System.out.println(pQueue1.poll());
		}
	}
	
}


