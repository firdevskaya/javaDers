package day22listsforeachloop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Soru2 {

	public static void main(String[] args) {
		
Scanner scan= new Scanner ( System.in);
System.out.println(" tam isim giriniz");
	
	String name = scan.nextLine().replace(" ", "").toUpperCase();
	List<Character>harfler= new ArrayList<>();
	for (int i = 0; i < name.length(); i++) {
		harfler.add(name.charAt(i));
	
	System.out.println(harfler);
Collections.sort(harfler);
	System.out.println(harfler);
	
	
	}
	
	
	
	
	
	
	}

}
