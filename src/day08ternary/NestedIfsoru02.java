package day08ternary;

import java.util.Scanner;

public class NestedIfsoru02 {

	public static void main(String[] args) {
		

		
		//Kullan�c�dan bir harf girmesini isteyin.
		//Girdi�i k���k harf ise harfin �a� olup olmad���n� kontrol edin. Harf �a� ise ekrana �Ilk k���k harf� yazd�r�n.
		//�a� de�il ise ekrana �Ilk k���k harf de�il� yazd�r�n.
		//Girdi�i b�y�k harf ise harfin �Z� olup olmad���n� kontrol edin. Harf �Z� ise ekrana �Son b�y�k harf� yazd�r�n.
		//�Z� de�il ise ekrana �Son b�y�k harf de�il� yazd�r�n.
	
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir harf giriniz");
		char h = scan.next().charAt(0);
		
		if(h>='a' && h<='z') {
			if(h=='a') {
				System.out.println("Ilk kucuk harf");
			} else {
				System.out.println("Ilk k���k harf de�il");
			}
		} else if(h>='A' && h<='Z') {
			if(h=='Z') {
				System.out.println("Son b�y�k harf");
			} else {
				System.out.println("Son b�y�k harf de�il");
			}
		} else {
			System.out.println("Lutfen harf giriniz");
		}
		
		
		scan.close();

}

}





