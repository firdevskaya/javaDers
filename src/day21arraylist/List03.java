package day21arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List03 {

	public static void main(String[] args) {
	
   List <Integer>ls1=new ArrayList<>();

	ls1.add(5)	;
	ls1.add(6)	;
	ls1.add(7)	;
	ls1.add(34)	;
	ls1.add(54)	;
	ls1.add(15)	;
	
	System.out.println(ls1);
	List <Integer>ls2= new ArrayList<>();
	ls2.add(14);
	ls2.add(7);
	ls2.add(6);
	ls2.add(1);
	ls2.add(11);
	ls2.add(18);
	
	
		System.out.println(ls2);		
	ls2.add(2, 7);
	System.out.println(ls2
			);	
	System.out.println(ls1.size());
	System.out.println(ls2.size());
	
	
	System.out.println(ls2.isEmpty());	
	System.out.println(ls1.remove(5));
	System.out.println(ls2.remove(2));
	System.out.println(ls1.remove(4));

	
     


	
	}

}
