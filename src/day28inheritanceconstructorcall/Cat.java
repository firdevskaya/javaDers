package day28inheritanceconstructorcall;

public class Cat  extends Mammal{
	public int c=2;
	public int d=5;
	public Cat() {
		
		System.out.println("Parametresiz Cat");
		
	}
	public Cat(String s) {
	this();
		System.out.println("Parametreli Cat");
	}

}
