package day34interface;

public interface Icdonanim {
	/* 1)Java "interface"ler icindeki tum methodlarin
abstract method olmasi gerektigini bilir. 
Bu yuzden siz method uretirken abstract yazsaniz da olur 
yazmasaniz da olur.
"public abstract void koltuk();" ile "public void koltuk();"
tamamaiyla aynidir.
2)Interface'lerdeki hersey otomatik olarak "public" dir. Bu yuzden access
modifier'i public olarak yazsaniz da olur yazmasaniz da olur.  
"public abstract void koltuk();" ve "public void koltuk();" ve "void koltuk();"
tamamiyla aynidir.
3)Normalde access modifier yazmayinca access modifier "default" olur ama
interface'lerde access modifier her zaman "public" oldugundan access modifier'i
yazmasaniz da o public'dir.*/

	   
	
	int FÝYAT = 20000;
	public static final String MARKA = "Honda ";
	
	public  abstract  void koltuk();
	
	public void direksiyon ();
	void ayna();
}
