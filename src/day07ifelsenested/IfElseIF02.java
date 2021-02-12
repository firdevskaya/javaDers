package day07ifelsenested;

import java.util.Scanner;

public class IfElseIF02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	Scanner scan= new Scanner(System.in);
	System.out.println("kullanicidan uc sayi aliniz");
	int k1= scan.nextInt();
	 
	int k2= scan.nextInt();
	int k3= scan.nextInt();
	if(k1==k2&& k2==k3) {
		
	System.out.println("eskenar ucgen");	
	}else if (k1==k2 ||( k2==k3)|| k1==k3){
		System.out.println("ikizkenar");
		
	}else if (k1!=k2 && k2!=k3 && k1!=k3) {
		System.out.println("cesitkenar");
		
	}
	
	
	
	
	
	
	
	
	}
	
	
	
	

}
