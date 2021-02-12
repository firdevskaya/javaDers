package day25stringbuilder;

import java.util.Scanner;

public class Sb02 {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
	
	StringBuilder sb1= new StringBuilder();
	System.out.println(sb1.capacity()
	);
	
	sb1.length();
	
	System.out.println(sb1.length());
	sb1.append("java");
	System.out.println(sb1.append("java"));
	sb1.append(" guzeldir");
	sb1.append(".ama").append("calismak gerekir");
	
	System.out.println(sb1.capacity());
	
	StringBuilder sb2= new StringBuilder (11);
	sb2.length();
   sb2.capacity();
	System.out.println( sb2.capacity ());
sb2.append("AliAliAli");
System.out.println(sb2.capacity());
	


StringBuilder sb3= new StringBuilder ();
	System.out.println(sb3.capacity());
	
	
	System.out.println();
	StringBuilder sb4= new StringBuilder ("javajavajavajavajava");
	System.out.println(sb4.capacity());
	StringBuilder sb5= new StringBuilder ("javajavajavajavajava");
	System.out.println(sb5.capacity());
// fazladan olan capacityi azaltma
	sb4.trimToSize();
	System.out.println(sb4.capacity());
	
	// istenen bir karakter char at
	
	
	sb4.charAt(5);
	
	System.out.println(sb4.charAt(5));
	

	System.out.println(sb4.substring(4, 11));
	System.out.println(sb4.substring(5));
	System.out.println(sb4.deleteCharAt(5));
		
	System.out.println(sb4);
	// herhangi bir karakter silme delete
	System.out.println(sb4.delete(4, 7));
	System.out.println(sb4);
	

	
	
	System.out.println(sb4.insert(4, "x"));
	
	
	sb4.setCharAt(4, ' ');
	
	System.out.println(sb4);
	sb4.replace(9, 13, " ");
	
	System.out.println(sb4);
	
	
	// bir string olusturun string clastan olustur. bu string i loop kullanark tersten yazdirin
	
	//  Scanner scan=new Scanner(System.in);
     // String kelime; 
   //   System.out.println("bir kelime gir");
   //   kelime=scan.next().toUpperCase(); 
   
    //  for(int i=kelime.length()-1;i>=0;i--)
    //  {
   //       System.out.print(kelime.charAt(i));
   //   }
	
	StringBuilder sb= new StringBuilder("hastane");
	sb.reverse();
	
	System.out.println();
	
	String s01= "java";
	StringBuilder sb01= new StringBuilder("java");
	
	//System.out.println(s01==sb01);
	
	// farkli data tipleri farkli data tiiyle karþilastirilirsa cte verir
	
	System.out.println	(s01.equals(sb01.toString()));
	
	
	
	}

	
}
