package day08ternary;

import java.util.Scanner;

public class Odev04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	Scanner scan= new Scanner(System.in);
	System.out.println("ilk tam sayi girin");
	int a =scan.nextInt();
	System.out.println("ikinci tam sayi girin");
	int b= scan.nextInt(); 
	
	
	System.out.println( a> b ? a : b  > a  ?  b: "esit");
	
	
	
	
	
	scan.close();
	

	
	
	
	}

}
