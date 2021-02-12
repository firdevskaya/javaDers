package day17constructorsstatickeyword;

public class Insan {
	
	
	int age ;
	String name;
	int height;
	boolean isHonest;
	String job;
	String gender ;
	
	public  Insan( ) {
		this("nurse","erkek");
		System.out.println("parametresiz");
		
	}

	
	public Insan( String name ) {
		this();
		System.out.println("name parametreli");
		
	}
	  public Insan(String job,String gender) {  
		  
		  System.out.println("job ve gender parametreli");
	  }
	
	public static void main(String[] args) {
		Insan i1= new Insan( "Ahmet");

	
	
	
		
		
		
		
		
		
		
	
	
	
	
	
	}

}
