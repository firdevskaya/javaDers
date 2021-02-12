package lambdatr;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Lambdaodev {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(9);
		list.add(-13);
		list.add(4);
		list.add(6);
		list.add(2);
		list.add(4);
		list.add(-12);
		list.add(15);		
		 enBuyukbUL(list);
	System.out.println("____");
	 enBuyukBul2(list);
	
	}	
		
	public static void enBuyukbUL (List<Integer> list) {
	Optional<Integer> max1 = list.stream().reduce(Integer::max);
	System.out.println(max1);
	}
		
	public static void enBuyukBul2(List<Integer>list) {
		Optional<Integer> max2 = list.stream().reduce(Integer::max);
	System.out.println(max2);
	}
	public static void buyuk3(List<Integer> list) {
		int max = list.stream().reduce(Integer.MIN_VALUE, (x,y)-> x>y ? x : y);
		System.out.println(max);	
	}
	public static int buyuk4(int x,int y) {
		return x>y? x:y;
		
	}
}
