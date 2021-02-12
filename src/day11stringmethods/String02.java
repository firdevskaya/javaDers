package day11stringmethods;

import java.util.Scanner;

public class String02 {

	public static void main(String[] args) {
		

	Scanner scan= new Scanner ( System.in);
	System.out.println("lutfen password girin");
	
	String  sifre= scan.next();
	if(sifre.charAt(0)>='A'&& sifre.charAt(0)<='Z'&&(sifre.length()-1>='0'
			&& sifre.length()-1<='9')&&
	sifre.length()>5){
		System.out.println("basarili");
	} else {
		System.out.println("tekrar deneyin");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
