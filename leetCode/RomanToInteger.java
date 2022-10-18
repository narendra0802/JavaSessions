package leetCode;

import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.IntStream;

public class RomanToInteger {
	public static void main(String[] args) {
		HashMap<Character,Integer> sample =new HashMap<Character,Integer>();
		sample.put('I',1);
		sample.put('V',5);
		sample.put('X',10);
		sample.put('L',50);
		sample.put('C',100);
		sample.put('D',500);
		sample.put('M',1000);
		@SuppressWarnings("resource")
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the input in Roman number: ");
		String inputRoman = in.next();
		if(convertToInteger(inputRoman,sample)>0) {
			System.out.println("Conversion of Input RomanNumber is: "+convertToInteger(inputRoman,sample));	
		}
	}

	private static int convertToInteger(String inputRoman,HashMap<Character, Integer> sample) {
		int number=0;
		String input = inputRoman.toUpperCase();
		for(byte b=0;b<input.length();b++) {
			
			if(b==(input.length()-1)||input.length()==1){
				number=number+sample.get(input.charAt(b));
			}
			else if(sample.get(input.charAt(b))>=sample.get(input.charAt(b+1))) {
				number=number+sample.get(input.charAt(b));				
			}
			else {
				number=number-sample.get(input.charAt(b));
			}	
		}
		return number;



	}

}
