package day26encapsulation;

public class E01 {


	
	
	


	/*
	 1)Encapsulation kisaca "data hiding(saklamak)" demektir.
	 2)Basarili bir Encapsulation asagidaki ozellikllere sahip olmali:
	   a)Nasil kullanilacagi belli olmali.(Direksiyon gibi)
	   b)Kod'un karmasikligi kullanimin karmasikligina sebep olmamali. Yani cok karmasik
	     kodlardan olusan bir yapi basit bir sekilde kullanilabilmeli.
	   c)Bir bolumun bozulmasi baska bolumlerin bozulmasina sebep olmamali.
	   
	3)Encapsulation nasil yapilir?
	  a)Access modifier'lari "private" olarak kullaniniz.
	  b)getter ve setter methodlari ile "encapsulated" data'lara ulasip onlari okuyabilir(getter) ve 
	    degistirebiliriz(setter).  
	    
	4)Encapsulation'in faydalari:
	  a)Esneklik(flexibility). Normalde asagidaki ornekte "age" variable'inin degeri 25 dir. Ama
	    diger class'larda setAge() methodunu kullanarak age variable'inin degerini istedigimiz gibi degistirip
	    kullanabiliriz.         
	*/
	
	private int age = 25;
	private String name = "Ali";

     //getter() olusturmak
	public int getAge() {
		return age;
	}
	
	



}

	
	

	
	
	
	


