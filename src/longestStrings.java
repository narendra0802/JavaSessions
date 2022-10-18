package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class longestStrings {
	
	public static String[] solution(String[] inputArray) {
	    int inputLength=inputArray.length;
	    int[] lengthOfInputString=new int[inputLength];
	   List<String> longestStrings=new ArrayList<String>();    
	    for(int i=0;i<inputLength;i++)
	    {
	        lengthOfInputString[i]=inputArray[i].length();
	    }
	    Arrays.sort(lengthOfInputString);
	    int longestStringlength=lengthOfInputString[inputLength-1];
	    
	    for(int i=0;i<inputLength;i++){
	        if(longestStringlength==inputArray[i].length()){
	            longestStrings.add(inputArray[i]);
	        }
	    }
	    String[] finalOutput=new String[longestStrings.size()];
	    for(int i=0;i<longestStrings.size();i++){
	        finalOutput[i]=longestStrings.get(i);
	    }
	    return finalOutput;

	}

	public static void main(String[] args) {
		String[] inputMatrix={"abc","ab","a","vcdf","fdce"};
		String[] finalResult = longestStrings.solution(inputMatrix);
		System.out.println("Longest Strings are: "+Arrays.toString(finalResult));

	}

}
