package day31exception;

import java.util.Scanner;

public class E07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner scan= new Scanner (System.in);

	System.out.println("yas girin");
	int age = scan.nextInt();
	if (age<0) {
		throw new IllegalArgumentException();
		
	}else {
		System.out.println(age);
	}
	}

	
	
	
	
	
}
