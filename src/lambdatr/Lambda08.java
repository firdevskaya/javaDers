package lambdatr;

import java.math.BigInteger;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Lambda08 {

	public static void main(String[] args) {
	
		System.out.println(sum2(20));
		System.out.println( sum4(10));
		System.out.println(sumilkxcift2(20));
		System.out.println( sumilktek1(20));
		
		System.out.println(sumxkuvvetistenendeger2(2,5));
		System.out.println(fakt(5));
		
	}
	// 1. den 10 kadar tam sayýlarý toplayan bir program yazýnýz 	
	
	public static int sum2 ( int x) {
	return IntStream.range(1, x+1).sum();
	
}

	public static int sum3 ( int x) {
	return IntStream.rangeClosed(1, x).sum();
	
}



	public static int sum4 ( int x) {
	return IntStream.range(1, x+1).filter(t->t%2==0).sum();
	}
// ilk  x pozýtýf cift tam  sayýyý toplayan program yazýnýz 
//1. yol
	public static int sumilkxcift1 ( int x) {
		return IntStream.rangeClosed(1, 2*x).filter(t->t%2==0).sum();
		}
// 2. yol 
	public static int sumilkxcift2(int x) {
		return IntStream.iterate(2, t->t+2).limit(x).sum();
	}
	// teksayýlar 1. yol
	public static int sumilktek1(int x) {
		return IntStream.iterate(1, t->t+2).limit(x).sum();
	
	}
	// 2. yol teksayýlar
	public static int sumilkxtek  ( int x) {
		return IntStream.rangeClosed(1, 2*x-1).filter(t->t%2!=0).sum();
	
	}	

// 2. nýn ilk 5 kuvvatini ekrana yazdýran program 
	public static void sumxkuvvet(int x){
		 IntStream.iterate(2, t->t*2).limit(x);;
	}

// istenilen bir sayýnýn iilk x kuvvetini ekrana yazdýran program 
	public static void sumxkuvvetistenendeger(int a,int x){
		 IntStream.iterate(a, t->t*a).limit(x);
	}

	public static int  sumxkuvvetistenendeger2(int a,int x){
 	 return IntStream.iterate(a, t->t*a).limit(x).reduce(0,(m,n)->n);
	}
// faktoriyel hesaplama
public static OptionalInt  fakt(int x) {
	return IntStream.rangeClosed(1,x).reduce(Math::multiplyExact);
}

// buyuk sayýlarla calýsabýlmek 
public static BigInteger factorialBigInteger(int x) {
	return IntStream.rangeClosed(1, x).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE,BigInteger::multiply);
}

}


