package day08ternary;

import java.util.Scanner;

public class NestedIfSoru01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Kullan�c�dan cinsiyetini girmesini isteyin.
		//Erkek ise ya��n� kontrol edin. Ya�� 18 den k���k ise ekrana �Erkek �ocuk� yazd�r�n.
		//Ya�� 18 den b�y�k e�it ise ekrana �Adam� yazd�r�n.
		//Kadin ise yasini kontrol edin. Ya�� 18 den k���k ise ekrana �K�z �ocuk� yazd�r�n.
	//	Ya�� 18 den b�y�k e�it ise ekrana �Kad�n� yazd�r�n.
	
	
	Scanner scan= new Scanner(System.in);
	System.out.println("cinsiyet girin");
	
	String c= scan.next();
	
	System.out.println("yasgirin");
	int y=scan.nextInt();
	if(c.equalsIgnoreCase("erkek")) {	
	if (y<18) {
	System.out.println("erkek cocuk");
		}else {
			System.out.println("adam");
		}
	}else if (c.equalsIgnoreCase("kadin")) {
		if (y<18) {
			System.out.println("kiz cocuk");
		}else {
			System.out.println("kadin");
		}
	}else {
		System.out.println("cins deg�l");
	}
	
	
scan.close();
	
	
	
	
	
	
	
	
	}

}
