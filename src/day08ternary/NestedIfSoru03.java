package day08ternary;

import java.util.Scanner;

public class NestedIfSoru03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	Kullanýcýdan password girmesini isteyin.
		//Girdiði password 5’e bölünüyorsa son rakamýný kontrol edin. Son rakamý 0 ise ekrana “5’e bölünen çift sayý” yazdýrýn.
		//Son rakamý 0 deðil ise “5’e bölünen tek sayý” yazdýrýn.
		//Girdiði password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdýrýn.
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir password giriniz");
		int pwd = scan.nextInt();
		
		if(pwd%5==0) {
			if(pwd%10==0) {
				System.out.println("5'e bolunen cift sayi");
			} else {
				System.out.println("5’e bölünen tek sayý");
			}
		} else {
			System.out.println("Tekrar deneyin!");
		}
		scan.close();

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
