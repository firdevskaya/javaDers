package dayday27inheritance;

public class RunnerClas {

	public static void main(String[] args) {
		
	Animal a1= new Animal();
	
	a1.hareket();
	a1.yeme();
	a1.icme();
	System.out.println("================");

Mammal m1= new Mammal();
m1.sutleBesle();
m1.icme();	
m1.yeme();
m1.hareket();	
m1.dogum();	

Cat c1= new Cat();
c1.dogum();	
c1.hareket();
c1.icme();
c1.miyav();
c1.sutleBesle();
c1.yeme();
Dog d1 = new Dog();



d1.dogum();	
d1.hareket();
d1.hav();	
d1.icme();	
d1.yeme();	

Fish f1 = new Fish();
f1.hareket();
f1.icme();
f1.yeme();
f1.yumurtlar();

	
	
	}

}
