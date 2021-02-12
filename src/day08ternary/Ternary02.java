package day08ternary;

import java.util.Scanner;

public class Ternary02 {

	public static void main(String[] args) {
		
	//	Kullanýcýdan bir tamsayý alýn eðer tamsayý 0 dan kucuk ise ekrana “Negatif” yazdýrýn.
	//	Diðer durumlarda ekrana “Negatif degil” yazdýrýn.
	
	
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int s = scan.nextInt();
		
		String result = s<0 ? "Negatif" : "Negatif deðil";
		System.out.println(result);
		
		scan.close();
	}
}
