package day22listsforeachloop;

import java.util.ArrayList;
import java.util.List;

public class Odevsorulari1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	
	
	
		 /*For-each loop Soru 2:
		 Bir integer list olu�turunuz ve bu list�deki tum say�lar�n karesinin toplam�n�
        For-each loop kullanarak bulunuz. Sonucu ekrana yazd�r�n�z.
		 */
	
	
	List<Integer>list=new ArrayList<>();
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(5);
	list.add(6);
	
	int toplam=0;
	 for (Integer w : list) {
		toplam+=w*w;
		
		
		
		
		
	System.out.println(toplam);
		}


	}
}
