package day08ternary;

import java.util.Scanner;

public class NestedIfSoru03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	Kullan�c�dan password girmesini isteyin.
		//Girdi�i password 5�e b�l�n�yorsa son rakam�n� kontrol edin. Son rakam� 0 ise ekrana �5�e b�l�nen �ift say�� yazd�r�n.
		//Son rakam� 0 de�il ise �5�e b�l�nen tek say�� yazd�r�n.
		//Girdi�i password 5�e b�l�nm�yorsa ekrana �Tekrar deneyin� yazd�r�n.
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir password giriniz");
		int pwd = scan.nextInt();
		
		if(pwd%5==0) {
			if(pwd%10==0) {
				System.out.println("5'e bolunen cift sayi");
			} else {
				System.out.println("5�e b�l�nen tek say�");
			}
		} else {
			System.out.println("Tekrar deneyin!");
		}
		scan.close();

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
