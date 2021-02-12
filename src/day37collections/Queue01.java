package day37collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Queue<String>q1= new PriorityQueue<>();
		
	q1.add("milk");
	q1.add("cheese");
	q1.add("Water");
	q1.add("oil");
	q1.peek();
	System.out.println(q1);
	q1.poll();
	System.out.println(q1);

	q1.offer("coke");
	System.out.println(q1);
	
	
	Queue<String>q2= new LinkedList<>();
	q2.add("bread");
	q2.add("sugar");
	q2.add("rice");
	q2.add("bean");
	q2.add("salt");
	System.out.println(q2);
	//q2.remove();
	q2.poll();
	
	System.out.println(q2);
	q2.clear();
	q2.remove();
	System.out.println(q2);
	}

}
