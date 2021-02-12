package day38collectionsmaps;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapProje {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String id = "";
		
		HashMap<String, String> person = new HashMap<>();
 	
		do {
		
			System.out.println("Kimlik numarasini giriniz.");
			System.out.println("Bilgi girisini durdurmak icin 'Q' tusuna basiniz");
			id = scan.next();
			if(id.equals("Q")) {
				break;
			}
			
			System.out.println("Ilk isminizi giriniz");
			String name1 = scan.next(); 
			
			System.out.println("Soy isminizi giriniz");
			String name2 = scan.next();
			
			System.out.println("Adresinizi giriniz");
			String address = scan.next();
			
			System.out.println("Telefon numaranizi 5 haneli olarak giriniz");
			int telNo = scan.nextInt();
			
			person.put(id, name1 + " " + name2 + "/ " + address + "/ " + telNo);

	}while(!id.equals("Q"));
		
		System.out.println(person);





}
}