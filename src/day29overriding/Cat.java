package day29overriding;

public class Cat extends Animal {
	@Override
public void   ses () {
	System.out.println("kediler miyavlar");



}

	@Override
	public  int add() {
	return 1+2;
		
	}

	@Override
	public Integer  multiply() {
		return  1*2;
		
	}

@Override 
	public Animal create() {
		return new Cat();
	
	
	}


	
}

