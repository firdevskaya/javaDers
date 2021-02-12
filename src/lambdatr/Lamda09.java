package lambdatr;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Lamda09 {

	public static void main(String[] args) throws IOException {
		//FileForLambda dosyasini okuyunuz.(Console'a yazdiriniz)
		Files.lines(Paths.get("src/lambdatr/FileForLambda")).forEach(System.out::println);
		
		//FileForLambda dosyasini buyuk harflerle okuyunuz.(Console'a buyuk harflerle yazdiriniz)
		Files.lines(Paths.get("src/lambdatr/FileForLambda")).map(String::toUpperCase).forEach(System.out::println);
		
		//FileForLambda dosyasindaki ilk satiri kucuk harflerle okuyunuz.(Console'a kucuk harflerle yazdiriniz)
		//1.Yol
		Files.lines(Paths.get("src/lambdatr/FileForLambda")).limit(1).map(String::toLowerCase).forEach(System.out::println);
		//2.Yol
		System.out.println(Files.lines(Paths.get("src/lambdatr/FileForLambda")).map(String::toLowerCase).findFirst());
		
		//FileForLambda dosyasinda "Lambda" kelimesinin kac satirda gectigini ekrana yazdiran programi yaziniz
		System.out.println(Files.lines(Paths.get("src/lambdatr/FileForLambda")).filter(t->t.contains("Lambda")).count());
		
		//FileForLambda dosyasinda "Lambda" kelimesinin kac kere gectigini buyuk harf kucuk harf onemsemeden 
		//ekrana yazdiran programi yaziniz
		
		System.out.println(Files.
	             lines(Paths.get("src/lambdatr/FileForLambda")).
	             map(t->t.split(" ")).
	             flatMap(Arrays::stream).
	             distinct().
	             collect(Collectors.toList()));
		
		System.out.println("-------------------------------------");
		// dosyadaki tum kelimeleri naturel order göre sırala 
		System.out.println(Files.
	             lines(Paths.get("src/lambdatr/FileForLambda")).
	             map(t->t.toLowerCase().split(" ")).
	             flatMap(Arrays::stream).sorted().
	        
	             collect(Collectors.toList()));
		System.out.println("-------------------------------");
	System.out.println(	Files.
        lines(Paths.get("src/lambdatr/FileForLambda")).
        map(t->t.toLowerCase().split("")).
        flatMap(Arrays::stream).filter(t->t.equals("lambda")).count());
   
  //     

	System.out.println(	Files.
	        lines(Paths.get("src/lambdatr/FileForLambda")).
	        map(t->t.toLowerCase().split("")).
	        flatMap(Arrays::stream).filter(t->t.contains("m")).count());
	
	// dosyada kac farklı harf  kullanıldıgını 
	
	
	
	
	
	System.out.println(Files.
			lines(Paths.get("src/lambdatr/FileForLambda")).
			map(t->t.replaceAll("\\W", "").split("")).
			flatMap(Arrays::stream).distinct().count());
	
	System.out.println(Files.lines(Paths.get("src/lambdatr/FileForLambda")).
			map(t->t.split(" ")).
			flatMap(Arrays::stream).
			distinct().
			count());
	
	
	
	
}}