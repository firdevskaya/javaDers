package lambdatr;

import java.util.ArrayList;
import java.util.List;

public class Lamdarewiew1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
	    list.add(12);
	    list.add(9);
	    list.add(13);
	    list.add(4);
	    list.add(6);
	    list.add(2);
	    list.add(4);
	    list.add(12);
	    list.add(15);
	    // tum tek sayý
	list.stream().filter(t->t%2==1).forEach(System.out::println);	
	// 6 ile 14 arasýndaki sayýnýn karesi 
	
		list.stream().filter(t->t>6 && t<14).map(t->t*t).forEach(System.out::println);
		
	System.out.println(	list.stream().filter(t->t%2!=0).map(Math::sqrt).reduce(Double::sum));


	
	
	
	}

}
