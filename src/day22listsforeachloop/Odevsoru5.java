package day22listsforeachloop;

import java.util.ArrayList;
import java.util.List;

public class Odevsoru5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	
	
	
		
		
	//	�dev1) Elemanlar�A, C, E, ve F olan bir String ArrayList olu�turup ekrana yazd�r�n�z.
//2) �ndexsiz add() methodunu kullanarak, B�yi ekleyiniz.
//�ndex�li add() methodunu kullanarak,
//L�yi 1 numaral� index�e ekleyiniz. ArrayList�i ekrana yazd�r�n�z, list ��yle olmal�; 
//A, L, C, E, F, B
		//.3) set() methodu kullanarak, E�yi D yap�n�z. 
//ArrayList�i ekrana yazd�r�n�z, list ��yle olmal�; A, L, C, D, "fF, B
		
	
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
	
	

