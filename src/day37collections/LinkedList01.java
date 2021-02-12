package day37collections;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> a1 =  new LinkedList<>();
		a1.add("Ali");
		a1.add("Veli");
		a1.add("Can");
		a1.add("Ayse");
		Scanner scan= new Scanner (System.in);
		System.out.println("bir isim giriniz");
	   String str= scan.next();
	
	 
		if(a1.remove(str)) {
			System.out.println("Bu isim  vardi ve silindi");
		}else {
			System.out.println("Bu isim  yok bu yuzden silinmedi");
		}
		System.out.println(a1);
		

		}
		
	}


