package leetCode;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner inputObj=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int input=inputObj.nextInt();
		System.out.println("Given Input: " + input);
		 int lengthOfInteger = lengthOfInteger(input);
		 //System.out.println("lengthOfInteger:"+lengthOfInteger);
		 int[] inputSplittedIntegers=new int[lengthOfInteger];
		for(byte j=0;j<lengthOfInteger;j++) {
			inputSplittedIntegers[j]=input%10;
			input=input/10;				
		}
		
		int reverseOfInputNumber=reverseTheNumber(inputSplittedIntegers,lengthOfInteger);
		System.out.println("ReverseNumber of given Input: "+reverseOfInputNumber);
		
		if(input==reverseOfInputNumber) {
			System.out.println("The given input is Palindrome");
		}
		else {
			System.out.println("The given input is not a Palindrome");
		}

	}
	
	public static int lengthOfInteger(int input) {
		int l=0;
		while(input!=0) {
			input=input/10;
			l++;
		}	
		return l;	
	}
	
	public static int reverseTheNumber(int[] temp,int l) {
		int revNumber=0;
		for(byte k=0;k<l;k++) {
			revNumber=revNumber*10+temp[k];
		}
				
		return revNumber;
	}

}
