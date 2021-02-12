import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String s= "calis bakalim zor mu? ";
	String words1 []= s.split("");
	System.out.println(Arrays.toString(words1));
	
	 System.out.println("karakter"	+ ": " + words1.length );
	String words3[]= s.replace(" ","").split("");
		System.out.println("bosluk haric karakter :" + words3.length);
	//
	

	String words4[]= s.split("");
	int counter =0;
	for (int i=0; i<words4.length; i++ ) {
		if ( words4[i].equals("a")) {
	counter++;
		
		
		}
	
	
	}
	   System.out.println(counter
			   );
	
	
	// bir String de kullanilan tüm harflerin sayisini gösteren kod yaziniz 
	
	//ornek aladin
	
	//A=1
	//B=4
	//C=1
	   int count1 =0;
	   String str = "alaiddin";
	   String arr []	= str.split("")  ;
	   for (int i = 0; i < arr.length; i++) {
		System.out.println(Arrays.toString(arr));
	
	if(arr[i].equals(arr[i+1])){
		count1++;
	}
	   System.out.println(counter);
	   
	   }
	   
	   
	   
	   
	
	}
}
