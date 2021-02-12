package day08ternary;

import java.util.Scanner;

public class Odev05 {

	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner( System.in);
		System.out.println("bir sayi girin");
		int a= scan.nextInt();
		int result= a<0  ? a*(-1): a;
				
		System.out.println(result);
		
		scan.close();

	}

}
