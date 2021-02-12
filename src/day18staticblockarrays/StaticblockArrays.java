package day18staticblockarrays;

public class StaticblockArrays {

	static double pi;
	static String s ;
	
	static {
		pi=3.14;
	System.out.println(pi);	
		
	}
	
	public static void main(String[] args) {
	alandaire(10);
	
	}	

	public static void alandaire(double r) {
	
	System.out.println("daireninn alani:"+ pi*r*r );
	
	
	}	

	static {
		
		s="Ali" +pi;
	
	System.out.println(s);
	}
	
	
	
	
	}



