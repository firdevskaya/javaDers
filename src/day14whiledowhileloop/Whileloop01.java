package day14whiledowhileloop;

import java.util.Scanner;

public class Whileloop01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Kullanicidan isim ve soy ismini alin.
		// Kullanicinin ilk isminin ilk harfinden soy isminin son harfine kadar olan butun harfleri
		// buyuk harf olarak ekrana ayni satirda aralarina bosluk birakarak yaziniz.
		
		
		
		Scanner scan= new Scanner (System.in);
	
	System.out.println(" lutfen isim giriniz");
	char ilkHarf = scan.nextLine().toUpperCase().charAt(0);
	System.out.println("lutfen soyad giriniz");
	String soyad = scan.nextLine().toUpperCase();
	char sonHarf = soyad.charAt(soyad.length()-1);
	
	while (ilkHarf<= sonHarf ) {
		System.out.println(ilkHarf + " ");
	
	ilkHarf++;
	
	
	}
	
	
	
	
	
	}

	
	
	
	
}
