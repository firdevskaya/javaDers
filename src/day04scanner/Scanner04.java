package day04scanner;

import java.util.Scanner;

public class Scanner04 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner (System.in);
		
		System.out.println("Dikd�rtgenin k�sa kenar�n� giriniz");
		double kisa =scan.nextDouble();
		System.out.println("Dikd�rtgenin uzun kenar�n� girin");
		double uzun =scan.nextDouble();
		System.out.println(kisa*uzun);
		System.out.println("cevre="+(2*kisa+2*uzun));
		
		
		
		
		
		
		

	}

}
