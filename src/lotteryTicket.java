package src;

import java.util.ArrayList;
import java.util.List;

public class lotteryTicket {
	
public static boolean solution(int n) {
	    List<Integer> digitsofInput = new ArrayList<Integer>();
	    while(n>=10){  
	        digitsofInput.add(n%10);
	        n=n/10;        
	    }
	    digitsofInput.add(n);
	    System.out.println("Input Digits: "+digitsofInput.toString());
	    
	    int lengthOfInput =digitsofInput.size();
	    int sumOfFirstHalf=0;
	    int sumOfSecondHalf=0;
	    for(int i=0;i<lengthOfInput/2;i++){
	        sumOfSecondHalf+=digitsofInput.get(i);
	        
	    }
	    for(int i=lengthOfInput-1;i>=lengthOfInput/2;i--){
	        sumOfFirstHalf+=digitsofInput.get(i);        
	    }
	   System.out.println("FirstHalf: "+sumOfFirstHalf);
	   System.out.println("SecondHalf: "+sumOfSecondHalf);
	  return sumOfFirstHalf==sumOfSecondHalf;  

	}

	public static void main(String[] args) {
		
		boolean lucky = lotteryTicket.solution(134008);
		
		System.out.println("Status of luck: "+lucky);
		
	}

}
