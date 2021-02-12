package day22listsforeachloop;

public class Odevsoru4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	
		
        /*
		 For-each loop Soru 4:
		 Bir String oluþturunuz, bu String’deki character’leri yukarýdan aþaðýya
        for-each loop kullanarak yazdýrýnýz.
        Ýpucu: split()

	*/
	
	String str="hello world";
	String kelime[]=str.replace(" ", "").split("");
		
	
		
	for (String w : kelime) {
		System.out.println(w);

	
	
	
	
	}

}
