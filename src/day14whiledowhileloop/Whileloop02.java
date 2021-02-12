package day14whiledowhileloop;

import java.util.Scanner;

public class Whileloop02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*
		
	3 basamakli sayilardan 4 ve 6 ya tam bolunebilrn tam sayileri buyukten ku
	kucuge ekrana yaziniz	
	*/	
		
	

}
}	/*
3 basamakli 4 ve 6 ya tam bolunebilen tamsayilari buyukten kucuge ekrana yaziniz
Bu sayilarin kac tane oldugunu da ekrana yazdiriniz
*/

int i = 999;

int counter = 0;//flag

while(i>=100) {
	
	if(i%4==0 && i%6==0) {
		System.out.print(i + " ");
		counter++;
	}
	
	i--;
}
System.out.println();
System.out.println("4 ve 6 ya bolunen 3 basamakli " + counter + " tane sayi var.");
