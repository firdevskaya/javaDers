package day31exception;

public class E05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String s= "123";
int S=	Integer.parseInt(s);
	System.out.println(S+5);
	
	
	
	String t= "1a2b";
	try {
		
	
 int it= 	Integer.parseInt(t);
 System.out.println(it+5);
	}catch(NumberFormatException e ) {
		System.out.println("olmaz ");
	}
	}
	
	}


