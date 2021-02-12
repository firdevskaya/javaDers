package day22listsforeachloop;

import java.util.ArrayList;
import java.util.List;

public class Odevsoru5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	
	
	
		
		
	//	Ödev1) ElemanlarýA, C, E, ve F olan bir String ArrayList oluþturup ekrana yazdýrýnýz.
//2) Ýndexsiz add() methodunu kullanarak, B’yi ekleyiniz.
//Ýndex’li add() methodunu kullanarak,
//L’yi 1 numaralý index’e ekleyiniz. ArrayList’i ekrana yazdýrýnýz, list þöyle olmalý; 
//A, L, C, E, F, B
		//.3) set() methodu kullanarak, E’yi D yapýnýz. 
//ArrayList’i ekrana yazdýrýnýz, list þöyle olmalý; A, L, C, D, "fF, B
		
	
		List<Integer> list = new ArrayList<>();

		list.add(21);

		list.add(22);

		list.add(23);

	
		
		

int count = 0; 

for(int w : list) {

		count++;

		if(count==2) {

			continue;

		}

		System.out.print(w + " ");
				}
				
	
	}
	}
	
	

