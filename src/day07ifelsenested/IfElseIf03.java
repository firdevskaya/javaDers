package day07ifelsenested;

import java.util.Scanner;

public class IfElseIf03 {

	public static void main(String[] args) {
		
Scanner scan= new Scanner (System.in);
System.out.println("bir not giriniz");
 double not= scan.nextDouble();
   if(not<0) {
	System.out.println("sana not gir dedik");   
   }if(not<50 ) {
		System.out.println("d");
	}else if(not<50) {
		System.out.println("c");
	}else if(not<80) {
		System.out.println("b");
	}else if(not<=100) {
		System.out.println("a");
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	}


