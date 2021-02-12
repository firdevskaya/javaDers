package day33abstractclass;

public  abstract class Honda {
	/* 1)Bazen child class'lar parent class'daki methodlarin body'lerini
hepdegistirerek kullanirlar. Bu tip durumlarda parent class'daki
methoda body koymak manasiz olur cunku parent class'daki method
body hic kullanilmaz.Bu manasizligi gidermek icin Java bize 
body'szi method uretme imkani verir. Body'siz methodlara
abstarcta method denir.*/
	/*2)Parent class’daki body’siz methodlari(abstract method)  
	  child class’lar override etmek zorundadirlar. 
	  Biz bir application olustururken child class’lari parent class’daki bazi methodlari override
	  etmek zorunda birakmak istersek o methodlari abstract method yapariz.
	*/
	
	private abstract void motor() ;
	
		
	public void deri () {
		System.out.println("koltuklar deri olsun");
	}

	
}
