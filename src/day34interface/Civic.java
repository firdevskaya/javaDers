package day34interface;

public class Civic extends Honda implements Icdonanim ,Lastik{

	

	

	@Override
	public void hareket() {
		System.out.println("hizli ve ekonomik");
		
		
	}

	@Override
	public void koltuk() {
	System.out.println("ortopedik oltuklari var");
		
	}

	@Override
	public void direksiyon() {
		System.out.println("deri hidrolik direksiyon");
		
	}

	@Override
	public void ayna() {
		System.out.println("otomatik kararma ozelligi var");
	}

	@Override
	public void far() {
		System.out.println("led far");
		
	}

	@Override
	public void kaporta() {
		System.out.println("paslanmaz celik");
		
	}

	@Override
	public void garanti() {
		System.out.println("1000");
	}

	@Override
	public void jant() {
		System.out.println("celik jant ");
		
	}


}