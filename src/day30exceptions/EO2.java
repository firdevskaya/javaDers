package day30exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class EO2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//FileInputStream}
	
	
		FileInputStream fis = new FileInputStream("src/day30exceptions/textfiletr" );
	
		int k ;
		while((k=fis.read())!=-1) {
			System.out.print
			((char)k);
		}
}
}