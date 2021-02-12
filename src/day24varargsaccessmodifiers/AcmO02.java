package day24varargsaccessmodifiers;

import day23foreachloopdatetime.AcMo03;

public class AcmO02 {

	public static void main(String[] args) {
		

		AcMo01 obj1= new AcMo01 ();
	System.out.println(obj1.publicAge);
	System.out.println(obj1.protectedAge);
	System.out.println(obj1.defaultAge);
	
	AcMo03  obj3= new AcMo03 ();
	System.out.println(obj3.publicName);
	
	}

}
