package lambdatr;

import java.util.ArrayList;
import java.util.List;

public class Lambdatekrar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		List<String> list = new ArrayList<>();
        list.add("Ali");
        list.add("Mark");
        list.add("Jackson");
        list.add("Amanda");
        list.add("Jackson");
        list.add("Jackson");
        list.add("Tucker");
        list.add("Christ");
        yaz1(list);
    	
	}
	  //List elemanlarinin tamamini buyuk harfli olarak, alfabetik sirada ve tekrarli
	//elemanlari sadece bir kere console'a yaz
	//Lambda Expression

	public static void yaz1(List<String> list) {
		list.stream().map(t->t.toUpperCase()).sorted().distinct().forEach(System.out::println);
	}


}


