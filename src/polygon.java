package src;

public class polygon {

	public static void main(String[] args) {
		int area=solution(5);
		System.out.println(area);

	}

	static int solution(int n) {
	    
	    
	     int middleRow=(2*n)-1;
	     int area=middleRow;
	     int temp=middleRow-2;
	    while(temp>2){
	        area+=+2*(temp);
	        System.out.println("Functionarea "+area);
	        temp-=2;
	        System.out.println("Fucntionttemp "+temp);
	     }
	   
	     return area+2*temp;

	}

}
