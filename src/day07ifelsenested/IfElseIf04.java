package day07ifelsenested;

import java.util.Scanner;

public class IfElseIf04 {

	public static void main(String[] args) {
		
	
	
	
		
Scanner scan= new Scanner (System.in);
System.out.println("bir yil giriniz");




 int yil= scan.nextInt();
 if(yil<=0) {
	 System.out.println("negtif sayi girmeyin");
 }
 
 else if(yil%1000==0)	{
	System.out.println("milenyum");
}else if (yil%100==0) {
	System.out.println("yuzyil");
}else if(yil%10==0) {
	
}else {
	System.out.println("hicbiri");
}

	
	}

}
