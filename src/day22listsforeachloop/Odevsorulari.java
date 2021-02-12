package day22listsforeachloop;

import java.util.ArrayList;
import java.util.List;

public class Odevsorulari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	
	
	       /* For-each loop Soru 1:
        Bir integer array oluþturunuz ve bu array’deki tum sayýlarýn çarpýmýný
         For-each loop kullanarak bulunuz. Sonucu ekrana yazdýrýnýz.*/

	
	
	int arr[]= {2,3,4,5,7,8,9};
	
	int carpim=1;
for (int i : arr) {
		carpim=carpim*i;
		System.out.println(carpim);
	}
	
	}
}