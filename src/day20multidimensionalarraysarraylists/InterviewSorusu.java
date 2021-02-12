package day20multidimensionalarraysarraylists;

import java.util.Arrays;
import java.util.Scanner;

import javax.net.ssl.SSLContext;

public class InterviewSorusu {

	public static void main(String[] args) {
		/*	//Bir String'de kullanilan tum harflerin sayisini gosteren kodu yaziniz.
		//Ornegin; Alaaddin ==> A=1, l=1, a=3, d=2, i=1, n=1*/
		
		
	Scanner scan= new Scanner (System.in);
	
		System.out.println("bir string giriniz");
		String s= scan.nextLine();
		
		String ch []=s.split("");
		System.out.println(Arrays.toString(ch));
		Arrays.sort(ch);
		
		//counter oluþtur 
		int counter =0;
		for (int i = 1; i < ch.length; i++) {
			if (ch[i-1].equals(ch[i])){
				counter++;
				
				
			}else {
				System.out.println(counter+1);
			counter=0;
			
			
			}
			if( i==ch.length-1) {
				System.out.println(counter+1);
			}
			
		}
		
		
		
		

	}

}
