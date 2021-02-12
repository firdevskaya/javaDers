package projecthashmap;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapProje {

	public static void main(String[] args) {
		/*
		 saveInfo() method olusturun:
		 1)Kullanicidan bircok kimlik numarasi(4 haneli), isim, adres ve telefon alin.
		 2)Kimlik numarasini key olarak, diger bilgileri value olarak bir map'e depolayin.
		 3)Ayni kimlik numarasi ile bilgi girilmesine engel olun.
		 
		 getInfo() method olusturun:
		 1)Kimlik numarasini girerek kullanicinin bilgilerine ulasin.
		 2)Olmayan kimlik numarasi girilirse kullaniciya hata mesaji verin.
		 3)Map bos ise uygun mesaj versin.
		 
		 removeInfo() method olusturun:
		 1)Kimlik numarasini girerek data silin.
		 2)Girilen kimlik numarasi yoksa kullaniciya hata mesaji verin.
		 3)Collection bos ise kullaniciya hata mesaji verin.
		 
		 selectOption() method olusturun:
		 1)Yukaridaki 3 methodu programi sonlandirana kadar secme hakki verin
		*/
		HashMap<String, String> hm = new HashMap<>();
		selectOption(hm);
	}
	
	public static void saveInfo(HashMap<String, String> hm) {
		
		Scanner scan = new Scanner(System.in);
		String id = "";
		
		do {
			System.out.println("Kimlik numaranizi giriniz");
			System.out.println("Girisi durdurmak icin 'Q' tusuna basiniz");
			id = scan.next();
			
			//Kullanicidan kimlik numarasi al, tekrarliya izin verme
			if(id.equalsIgnoreCase("Q")) {
				break;
			}else {
				while(hm.containsKey(id)){
					System.out.println(id + " kayitlarda var, lutfen gecerli bir id giriniz");
					id = scan.next();
				}
			}
			//next() den sonra nextLine() kullanirsdaniz nu kodu araya yaziniz
			scan.nextLine();
			
			//Kullanicidan isim aliniz
			System.out.println("Tam isminizi giriniz");
			String isim = scan.nextLine();
			
			//Kullanicidan adres aliniz
			System.out.println("Adresinizi giriniz");
			String adres = scan.nextLine();
			
			//Kullanicidan telefon numarasini aliniz
			System.out.println("Telefonunuzu giriniz");
			String tel = scan.nextLine();
			
			//isim, adres ve tel bilgileri birlestirildi
			String ogrenci = "\nIsim: " + isim + "\nAdres: " + adres + "\nTelefon: " + tel + "\n";
			
			//HashMap'e key ve value'lari ekledik
			hm.put(id, ogrenci);
			
		}while(true);
		
		System.out.println(hm);
	}
	
	public static void getInfo(HashMap<String, String> hm) {
		
		Scanner scan = new Scanner(System.in);
		String id = "";
		
		do {
			System.out.println("Ogrenci bilgisini almak icin id giriniz");
			System.out.println("Bilgi almayi durudurmak icin 'Q' tusuna basiniz");
			id = scan.next();
			
			if(id.equalsIgnoreCase("Q")) {
				break;
			}else if(hm.isEmpty()) {
				System.out.println("Herhangi bir data yok");
				break;
			}else if(!hm.containsKey(id)) {
				System.out.println(id + " gecerli bir id degil. Lutfen gecerli bir id giriniz.");
			}else {
				String ogrenciInfo = hm.get(id);
				System.out.println(id + " asagidaki bilgileri icerir:"  + ogrenciInfo);
			}	
			
		}while(true);

	}
	
	public static void removeInfo(HashMap<String, String> hm) {
		
		Scanner scan = new Scanner(System.in);
		String id = "";
		
		do {
			System.out.println("Kayit silmek icin kimlik numarasi giriniz");
			System.out.println("Silme islemini durdurmak icin 'Q' tusuna bakiniz");
			id = scan.next();
			
			if(id.equalsIgnoreCase("Q")) {
				break;
			}else if(hm.isEmpty()) {
				System.out.println("Herhangi bir data yok.");
			}else if(!hm.containsKey(id)) {
				System.out.println(id + " gecerli bir id degil. Lutfen gecerli bir id giriniz.");
			}else {
				String silinenData = hm.remove(id);
				System.out.println("Silinen ogrenci: \n" + silinenData);
			}
			
		}while(true);
		
		System.out.println(hm);

	}
	
	public static void selectOption(HashMap<String, String> hm) {
		
		Scanner scan = new Scanner(System.in);
		String option = "";
		
		do {
			System.out.println("Kullanmak istediginiz methodu seciniz(1-2-3)");
			System.out.println("1: Ogrenci Ekle\n2: Ogrenci Bilgisi Alma\n3: Ogrenci Kaydi Silme");
			System.out.println("Secim yapmayi sonlandirmak icin 'Q' tusuna basiniz");
			option = scan.next();
			if(option.equalsIgnoreCase("Q")) {
				break;
			}
			switch(option) {
				case "1":
					saveInfo(hm);
					break;
				case "2":
					getInfo(hm);
					break;
				case "3":
					removeInfo(hm);
					break;
				default:
					System.out.println("Yanlis method sectiniz tekrar deneyiniz");	
			}
			
		}while(true);
		
	}

}










