package day18staticblockarrays;

import java.util.Arrays;

public class Arrays01 {

	int x=12 ;
	
	
	
	
	public static void main(String[] args) {
	int a[]	=new int [4];

	System.out.println(Arrays.toString(a));
	
	// arraya eleman eklemek
	
	
	a[0]=8;
	System.out.println(Arrays.toString(a));
	a[3]=8;
	System.out.println(Arrays.toString(a));
	
	a[2]=15;
	
	
	System.out.println(Arrays.toString(a));
	a [1]=23;
	System.out.println(Arrays.toString(a));
	//arrayda  eleman oldugunu bulma 
	// Stringlerde kullandiðimiz lenght()
	//arraylerde kullandiðimiz lenght 
	//yani parantez yok
	System.out.println(a.length
			);
	
	//
	
	String b[]= new String [3];
	System.out.println(Arrays.toString(b));
	 b[0]="Ali";
	System.out.println();		 
	
	b[1]="ayse";
	System.out.println();
	
	b [2]= "kelam";
	System.out.println();
	
	
// bir arraya specific eleman yazdirmak istersek 
	
	
	
	
	for (int i = 0; i < b.length; i++) {
		System.out.println(b[i]);
	


		
}
	
	
	
	
	
	
	
	
	
	
		
	
	}	
	
}
