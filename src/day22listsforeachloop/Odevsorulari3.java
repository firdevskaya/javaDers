package day22listsforeachloop;

public class Odevsorulari3 {

	public static void main(String[] args) {
		
	

		/*
		  For-each loop Soru 3:
		Ýki String array oluþturunuz ve bu array’lerdeki ortak elemanlarý
         For-each loop kullanarak bulunuz. Sonucu ekrana yazdýrýnýz.
          Ortak eleman yoksa ekrana “Ortak eleman yok” yazdýrýnýz
*/
String str[]= {"a","b","c","d","e"};
String str1[]= {"c","d","h","s","k"};
int count =0;
for (String w : str) {
	for (String i : str1) {
		
	if (w.equals(i)) {
		
	
	System.out.println(i);
	count++;
	
	}
	
	}
	
	
	}


	if (count==0) {
		System.out.println("ortak eleman yok");
	}
	}

}
