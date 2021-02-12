package day38collectionsmaps;

import java.util.Deque;
import java.util.LinkedList;

public class Deque01 {

	public static void main(String[] args) {
	
Deque<String>dq1= new LinkedList<>();
	dq1.add("Ali");
	dq1.add("Veli");
	dq1.add("Aydin");
	dq1.add("Merve");
	dq1.add("Kadriye");
	System.out.println(dq1);

	dq1.getLast();
	System.out.println(dq1.getLast());
	System.out.println(dq1.peekLast());
	System.out.println(dq1.pollFirst());
	System.out.println(dq1);
	System.out.println(dq1.pollLast());
	System.out.println(dq1);

	
	
	
	//dq1.clear();
	//System.out.println(dq1.getFirst());
	//System.out.println(dq1);
	
	
	
	
	}
}
