package day37collections;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String>hs1= new HashSet<>();
		
		hs1.add("Ali");
		hs1.add("Veli");
		hs1.add("Canan");
		hs1.add("Beyhan");
		hs1.add("Ayhan");
		hs1.add("Seyhan");
		hs1.add("Ceyhan");
		hs1.add("Ramazan");
		hs1.add("Daghan");

	System.out.println(hs1);
	TreeSet<String>ts1=new TreeSet<>(hs1);
	System.out.println(ts1);
	
	}

}
