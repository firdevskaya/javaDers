package day08ternary;

import java.util.Scanner;

public class NestedIfSoru01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Kullanýcýdan cinsiyetini girmesini isteyin.
		//Erkek ise yaþýný kontrol edin. Yaþý 18 den küçük ise ekrana “Erkek çocuk” yazdýrýn.
		//Yaþý 18 den büyük eþit ise ekrana “Adam” yazdýrýn.
		//Kadin ise yasini kontrol edin. Yaþý 18 den küçük ise ekrana “Kýz çocuk” yazdýrýn.
	//	Yaþý 18 den büyük eþit ise ekrana “Kadýn” yazdýrýn.
	
	
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
		System.out.println("cins degýl");
	}
	
	
scan.close();
	
	
	
	
	
	
	
	
	}

}
