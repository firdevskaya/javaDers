package day22listsforeachloop;

public class Odevsoru4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	
		
        /*
		 For-each loop Soru 4:
		 Bir String olu�turunuz, bu String�deki character�leri yukar�dan a�a��ya
        for-each loop kullanarak yazd�r�n�z.
        �pucu: split()

	*/
	
	String str="hello world";
	String kelime[]=str.replace(" ", "").split("");
		
	
		
	for (String w : kelime) {
		System.out.println(w);

	
	
	
	
	}

}
