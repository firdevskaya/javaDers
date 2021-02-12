package day39maps;

import java.util.HashMap;
import java.util.Hashtable;



		

public class HashTable01 {
    /*
        1)HashMap ve TreeMap synchronized ve thread-safe degildir.
          Map'ler arasindan synchronized ve thread-safe olan bir map'e ihtiyac vardir.
          Bu yuzden HashTable olusturulmustur.
        2)HashTable ne key icin ne de value icin "null" kullanmaz.
        3)HashTable elemanlari rastgele siralar.
    */
    public static void main(String[] args) {
        Hashtable<Integer, String> ht1 = new Hashtable<Integer, String>();
        ht1.put(101,"Ali");
        ht1.put(105,"Veli");
        ht1.put(104,"Ayhan");
        ht1.put(103,"Aladdin");
        ht1.put(102,"Ramazan");
        System.out.println(ht1);//{105=Ali, 104=Ali, 103=Ali, 102=Ali, 101=Ali}
        //ht1.put(null, "Beyhan");//NullPointerException verir
        //ht1.put(106,null);//NullPointerException verir
        HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
        hm1.put(106,"Ramazan");
        hm1.put(107,"Remziye");
        ht1.putAll(hm1);
        System.out.println(ht1);//{107=Remziye, 106=Ramazan, 105=Veli, 104=Ayhan, 103=Aladdin, 102=Ramazan, 101=Ali}
 
    }


	
	}


