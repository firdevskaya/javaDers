package day08ternary;

import java.util.Scanner;

public class Odev0101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan= new Scanner(System.in);
	
	System.out.println("tam sayi girin");
	
	int s= scan.nextInt();
	String result= s%2==0 ? "cýft": "tek";
	System.out.println(result);
	
	
	scan.close();
	
	
	
	
	
	
	
	
	
	
	
	}

}
