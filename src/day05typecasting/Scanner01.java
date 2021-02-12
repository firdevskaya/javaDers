package day05typecasting;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		
  Scanner scan= new Scanner(System.in) ;
  System.out.println("ucgenin kenar uzunluklarini girin");
  byte k1= scan.nextByte();
  byte k2 = scan.nextByte();
  byte k3 = scan.nextByte();
   
  int cevre= k1+k2+k3;
  System.out.println("ucgen cevre:" + cevre );
		
		
	scan.close();	
		
	}

}
