package naveen;

import java.util.Scanner;

public class PrimeNumberCheck {

	public boolean isPrime(int i) {
		boolean b = false;
		if(i==1 || i==0) {
			b=false;
		}
		else {
			for(int j=2;j<i;j++) {
				if(i%2==0) {
					b=false;
					break;
				}
				b=true;
			}
		}

		return b;

	}

	public static long getFactorialof(int input) {
		long l = 1;
		if(input==0) {
			l=0;
		}else {
			while(input>1) {
				l*=input;
				input--;
			}
		}		
		return l;
	}

	public static void main(String[] args) {
		PrimeNumberCheck p=new PrimeNumberCheck();
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the input integer");
		int input=obj.nextInt();
		boolean output=p.isPrime(input);
		if(output) {
			System.out.println(input+" is a prime number");	
		}
		else {
			System.out.println(input+" is a composite number");	
		}
		long factorialOfGivenInput=PrimeNumberCheck.getFactorialof(input);
		System.out.println("Factorial of value "+input+" is:"+factorialOfGivenInput);


	}

}
