package day28inheritanceconstructorcall;

public class Animal {
	​
	public Animal(int i) {
		// TODO Auto-generated constructor stub
	}

	public class Mammal extends Animal {
		
		public int m = 1;
		public int c = 4;

	public Mammal() {
			this('Y');
			System.out.println("Parametresiz Mammal");
		}
		public Mammal(char c) {
			super(17);
			System.out.println("Parametreli Mammal");
		}

}
}