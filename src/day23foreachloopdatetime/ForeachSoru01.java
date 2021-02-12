package day23foreachloopdatetime;

public class ForeachSoru01 {

	public static void main(String[] args) {
	/*asagýda verilen multidiamndional arayin elemlarin carpimini bulun	

	*/
	
	int arr[][]={ {2,3},{4},{5,6,7}}
	;
	int carp=1;
	
	for (int[] w : arr) {
		for(int x : w) {
			carp*=x;
	System.out.println(carp +" ");
	}
	
		
		
		
	}
	
	}

}
