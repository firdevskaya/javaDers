package day05typecasting;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("4 basamakli bir sayi giriniz"); 
		int s = scan.nextInt();
		int sonrakam = s%10;
		int ilkrakam= s/1000;
		System.out.println("ilk rakam ve son rakam toplami:" + (sonrakam+ilkrakam));
		
		
		scan.close();

	}

}
