package day07ifelsenested;

import java.util.Scanner;

public class Ifsoru01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Scanner scan=new Scanner(System.in);
	System.out.println("bir gun ismi giriniz");
	String day= scan.next();
	
	
	if (day.equalsIgnoreCase("cuma")) {
	System.out.println("muslumanlar icin kutsal gun");	
	}
	
	if (day.equalsIgnoreCase("cumartesi")) {
	System.out.println("yahudi icin icin kutsal gun");	
	}
	
	
	if (day.equalsIgnoreCase("pazar")) {
	System.out.println("hristiyan  icin kutsal gun");	
	
	}
	
	

}
}

