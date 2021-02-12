package day32exceptions;

public class E03 {

	public static void main(String[] args) {
	
	int arr[]= { 11,12,13,14};	
		try {
System.out.println(arr[4]);
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}

}
