package day06ifstatement;

import java.util.Scanner;

public class IfStatement01 {

	public static void main(String[] args) {
		  
		
		//if it rains I will cancel picnic
	Scanner scan= new Scanner(System.in);
	System.out.println("iki sayi giriniz");
	double a= scan.nextDouble();
	double b= scan.nextDouble();
		if(a>b){
			System.out.println("ilk sayi buyuk");
		}
		
		if (a<b) {
		System.out.println("ikinc� sayi buyuk");
	}

	scan.close();
	
	
	
	
	
	
	}
}
