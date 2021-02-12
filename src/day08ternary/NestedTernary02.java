package day08ternary;

import java.util.Scanner;

public class NestedTernary02 {

	public static void main(String[] args) {
		


		Scanner scan=new Scanner (System.in);
		System.out.println("yil giriniz");
	
	int yil =scan.nextInt();
String result=	yil%100==0 ? (yil%400==0) ? "artik yil" :"artik yil" :(yil%4==0 ? "artik yil" :"artik yild");
	
	
	System.out.println(result);
	
	
	scan.close();
	
	}

}
