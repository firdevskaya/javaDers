package day04scanner;

import java.util.Scanner;

public class Benimscannödevim {

	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		System.out.println("Karenin  kenarýný giriniz");
		double kenar = Scan .nextDouble();
		
		System.out.println("Alan:"+(kenar*kenar));		
		System.out.println("Cevre+"+(kenar*4));
		Scan.close();
		
		
		//kullanicidan alinan bir sayinin kupunu hesaplayýn 
		Scanner scan =new Scanner(System.in);
		System.out.println("sayi:");
		 
		double sayi = Scan.nextDouble();
		System.out.println("kup:"+(kenar*kenar*kenar));
		Scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
