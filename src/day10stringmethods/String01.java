package day10stringmethods;

public class String01 {

	public static void main(String[] args) {
		
String s1= "testi al kendini gor";
s1.endsWith("r");
System.out.println(s1.endsWith("r"));

System.out.println(s1.endsWith("gor"));	
	
	System.out.println(s1.endsWith(""));
	System.out.println(s1.endsWith("testi al kendini gor"));
	
	String s2 ="cabuk ogrenilen cabuk unutulur";
	
	s2.indexOf('r',8);
	System.out.println(s2.indexOf('r',8));
	s2.indexOf("buk", 5);
	System.out.println(s2.indexOf("buk", 5)); 
	String s3 ="tekrar et tekrar unutma";
	
	
	s3.isEmpty();
	System.out.println(s3.isEmpty());
	s3.lastIndexOf("rar");
	System.out.println(s3.lastIndexOf("rar"));
	s3.lastIndexOf('r',16);
	System.out.println(s3.lastIndexOf('r',16));
	
	
	s3.length();
	System.out.println(s3.length());
	
	
	s3.replace('e', 'E');
	System.out.println(s3.replace('e', 'E'));
	
	System.out.println(s3.replace("krar", "miz"
			));
	System.out.println(s3.replace("a", ""));
	
	System.out.println(s3.replace("", "|"
			+ ""));
	
	String s4="C"
			+ "ode1 yazilarak2 ogrenilir3"
			+ "";
//	\\d==> tum rakamlar 
	// W==> a->z  A->Z 0->9
	s4.replaceAll("\\d", "*");
	System.out.println(s4.replaceAll("\\d" , "*"));
	System.out.println(s4.replaceAll ("\\D", "*"));
	System.out.println(s4.replaceAll
			("\\w" , "*"));
 System.out.println(s4.replaceAll("\\W"
		 , "*"));
	
	
	
	s4.startsWith("C");
	System.out.println(s4.startsWith("C")
			);
	
	System.out.println(s4.startsWith("Code"));
	//4.KARAKTERÝ E MÝ?
	System.out.println(s4.startsWith("e",3));
	
	
	
	
	
	}
	

	
}
