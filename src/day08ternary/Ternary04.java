package day08ternary;

import java.util.Scanner;

public class Ternary04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	//	Kullan�c�dan alaca�� �r�n miktar�n� ve �r�n�n birim fiyat�n� al�n. E�er urun miktar� 1000 den fazla ise
	//	Kullan�c�ya %10 indirim yap�n ve �demesi gereken toplam paray� ekrana yazd�r�n. Di�er durumlarda
	//	�demesi gereken toplam paray� herhangi bir indirim yapmadan ekrana yazd�r�n.
	
	
	
		Scanner scan=new Scanner (System.in);
		System.out.println("urun miktar girin");
	int m=scan.nextInt();
	System.out.println("urun birim fiyat");
	double f=scan.nextDouble();
	
	
	double result =m>1000 ?f*0.9*m: f*m;
	System.out.println(result);
	
	
	}

}
