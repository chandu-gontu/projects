package com.excptn;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex3 {

	public static void main(String[] args) {
		
		
		try (FileReader f=new FileReader("c:\\xyuiz.txt");){
			
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		} 
		
	}

}
