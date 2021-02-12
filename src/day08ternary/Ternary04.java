package day08ternary;

import java.util.Scanner;

public class Ternary04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	//	Kullanıcıdan alacağı ürün miktarını ve ürünün birim fiyatını alın. Eğer urun miktarı 1000 den fazla ise
	//	Kullanıcıya %10 indirim yapın ve ödemesi gereken toplam parayı ekrana yazdırın. Diğer durumlarda
	//	ödemesi gereken toplam parayı herhangi bir indirim yapmadan ekrana yazdırın.
	
	
	
		Scanner scan=new Scanner (System.in);
		System.out.println("urun miktar girin");
	int m=scan.nextInt();
	System.out.println("urun birim fiyat");
	double f=scan.nextDouble();
	
	
	double result =m>1000 ?f*0.9*m: f*m;
	System.out.println(result);
	
	
	}

}
