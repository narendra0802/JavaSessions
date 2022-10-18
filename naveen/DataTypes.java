package naveen;

public class DataTypes {

	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println("Narendra");
		System.out.println("----------------------");
		int i=74,j=36;
		System.out.println(i+j);
		System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
		System.out.println("Hello Selenium "+'t');
		int a=100,b=200,c=3400;
		System.out.println("your total amount is : "+(a+b+c));
		byte b3 = 065;
		System.out.println(b3);
		int a1=125,b1=78,c1=57,j1;
		if(a1<b1) {
			if(b1<c1) {
				System.out.println("The greatest: "+c1);
			}
			else { 
				System.out.println("The greatest: "+b1);
			}
		}
		else if(a1<c1) {
			System.out.println("The greatest: "+ c1);
		} 
		else {
			System.out.println("The greatest: "+ a1);
		}
	
		int p1=35,n1=-11;
		if(n1>0)
		{
			System.out.println("Number is positive");
	
		}else {
			System.out.println("Number is Negative");
		}
		
		
	}

}
