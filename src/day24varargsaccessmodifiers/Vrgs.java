package day24varargsaccessmodifiers;

public class Vrgs {

	public static void main(String[] args) {
		

	add(3,5);
	add(3,5,7);
	add();
	add(3,5,7,10,11);
	concat("anne","baba");
	yazdir("isim:","A","L","i");
	
	
	}
	
	
		
	
	
	//public static void add (int a,int b) {
		//System.out.println(a+b);
	//}
	
	//	public static void add (int a,int b,int c) {
			//System.out.println(a+b+c);
	
	//
	//}
	
	
		public static void add (int ... a) {
			
	
			int sum=0;
			for (int i : a) {
				sum=sum+i;
				
			}
			System.out.println(sum
					);
		}

		
		
		public static void concat (String ... b) {	
		
			
			
System.out.println();
String  top ="";
for (String w : b) {
	top=top+w;
	
	System.out.println(top);
}	
		}

public static void yazdir(String c,String...s) {	
System.out.println(c);
for (String w : s) {
	
	System.out.println(w+ " ");
}	
	
	
}		
		}	

