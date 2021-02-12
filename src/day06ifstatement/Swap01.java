package day06ifstatement;

import java.util.Scanner;

public class Swap01 {

	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner (System.in);
		System.out.println("iki sayi giriniz");
		double a= scan.nextDouble();

		double b= scan.nextDouble();
		System.out.println("a: " +a);
		System.out.println("b:" +b);
        double temp=0;
        temp =a ;      //temp 12  a= 12 b=25
	    a=b;             //temp =12 a= 25 b=25
	    b=temp ;       //a =25 b=12
	    
	System.out.println("a:" + a);
	System.out.println("b:"+ b );
	
	//2 yol : ucuncu bir variable kullanma
	
	a= a+b ;
    b= a-b ;
    a = a-b;
    System.out.println("a:" +a);
    System.out.println("b:" + b);
	
	}
	
	
	
	

}
