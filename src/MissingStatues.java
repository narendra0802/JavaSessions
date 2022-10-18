package src;

import java.util.Arrays;

public class MissingStatues {

	public static void main(String[] args) {
		int[] statues= {6,2,3,8,10,27};
		Arrays.sort(statues);
		//System.out.println(statues);
		int ms=solution(statues);
		System.out.println("missing Status "+ms);

	}
	
	static int solution(int[] statues) {

		int arraylength=statues.length;
		int count=0;
		int missingstatues=0;

		for(int i=0;i<arraylength-1;i++){
		    if(statues[i]+1!=statues[i+1]) {
		        missingstatues=statues[i+1]-statues[i];
		        count+=(missingstatues-1);
		        //System.out.println("Iteration "+i+ count);
		    }  
		}
		return count;

}
}
