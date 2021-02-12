package projectvendingmachine;

import java.util.Scanner;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Products product= new Products();
	Methods methods= new Methods();
	System.out.println("merhaba musteri");
    double money =	methods.money();
	System.out.println("hesabýnýzda "+ money + " dollar var ");
   product.setPrice(methods.select(product)); 
     money=	methods.balance(product.getPrice(), money, product);
	methods.purchase(product.getPrice(), money, product);
	
	}

	
	
	
	
	}
	

