import java.util.Arrays;
import java.util.Scanner;

public class soru01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Kullanýcýya kaç elemanlý bir array gireceðini sorun.
		 Kullanýcýdan array’in elemanlarýný girmesini isteyin.
        a) Bu array’in tum elemanlarýný ekrana yazdýrýn.
        b) Bu arayýn son elemanýný ilk eleman yapýn ve tum elemanlarýný ekrana yazdýrýn.
        Mesela; array {1, 2, 3} ise ekrana {3, 1, 2} seklinde yazdýrýn.
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Array'in length'ini giriniz");
		int length = scan.nextInt();
		
		int arr[] = new int[length];
		
		int i = 0;
		
		do {			
			System.out.println("Lutfen array'in index'i " + i + " olan elemanini giriniz");			
			arr[i] = scan.nextInt();
			i++;			
		}while(i<length);
		
		System.out.println(Arrays.toString(arr));
		
		int newArr[] = new int[length];
		
		newArr[0] = arr[arr.length-1];
		
		for(int k=1; k<arr.length; k++) {	
			newArr[k] = arr[k-1];
		}
		
		System.out.println(Arrays.toString(newArr));
		
		scan.close();

	
	
	
	}
}
