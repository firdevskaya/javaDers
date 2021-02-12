package day08ternary;

import java.util.Scanner;

public class NestedIfsoru02 {

	public static void main(String[] args) {
		

		
		//Kullanýcýdan bir harf girmesini isteyin.
		//Girdiði küçük harf ise harfin “a” olup olmadýðýný kontrol edin. Harf “a” ise ekrana “Ilk küçük harf” yazdýrýn.
		//“a” deðil ise ekrana “Ilk küçük harf deðil” yazdýrýn.
		//Girdiði büyük harf ise harfin “Z” olup olmadýðýný kontrol edin. Harf “Z” ise ekrana “Son büyük harf” yazdýrýn.
		//“Z” deðil ise ekrana “Son büyük harf deðil” yazdýrýn.
	
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir harf giriniz");
		char h = scan.next().charAt(0);
		
		if(h>='a' && h<='z') {
			if(h=='a') {
				System.out.println("Ilk kucuk harf");
			} else {
				System.out.println("Ilk küçük harf deðil");
			}
		} else if(h>='A' && h<='Z') {
			if(h=='Z') {
				System.out.println("Son büyük harf");
			} else {
				System.out.println("Son büyük harf deðil");
			}
		} else {
			System.out.println("Lutfen harf giriniz");
		}
		
		
		scan.close();

}

}





