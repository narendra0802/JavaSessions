package leetCode;

import java.util.Scanner;

public class IntegerPalindrome {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the input number: ");
		int inputNumber=in.nextInt();		
        if(inputNumber==reverseOfInput(inputNumber)){
            System.out.println("The given input is Palindrome");
        }
        else{
            System.out.println("The givne input is not a Palindrome");
        }  
    }
    
    public static int reverseOfInput(int x) {
        int rev=0;
       while(x>0){
           rev=(rev*10)+(x%10);
           x=x/10;
       } 
       System.out.println("Reverse of given Input:"+rev);
        return rev;
        
    }
}
