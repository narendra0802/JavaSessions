package naveen;

public class loops {

	public static void main(String[] args) {
		byte i=1;
		while(i<=5) {
			System.out.println("I am Batman");
			i++;
		}
	System.out.println("------------------------");	
		i=1;
		while(i<=9) {
			System.out.println("I am Batman "+i);
			i++;			
		}
	System.out.println("------------------------");			
		i=10;
		while(i>=1) {
			System.out.println(i);
			i--;
		}
	System.out.println("------------------------");
		i=1;
		while(i<=100) {
			if(i%2==1)
			System.out.println("Odd Number: "+i);
			i++;
		}
	System.out.println("------------------------");
		char c = 'A';
		while(c<='Z') {
			System.out.println("ASCII Value of "+c+":"+ (int) c);
			c++;
		}
		
	System.out.println("------------------------");
		c='a';
		while(c<='z') {
			System.out.println("ASCII Value of "+c+":"+ (int) c);
			c++;
		}
		
	System.out.println("------------------------");
		c='0';
		while(c<='9') {
			System.out.println("ASCII Value of "+c+":"+ (int) c);
			c++;
		}
	System.out.println("------------------------");
		double f=1.0;
		while(f<=10.0) {
			System.out.println(f);
			f++;
		}
	System.out.println("------------------------");
		i=1;
		while(i<=10) {
		if(i%7==0) {
			System.out.println("bye, see you tomorrow");
			break;
		}
		else {
			System.out.println(i);
		}
		i++;
		
		}
	
	System.out.println("------------------------");
	i=0;
	while(i<=100) {
		System.out.println(i);
		switch(i) {
		case 0:
			System.out.println("Zero - duck");
			break;
		case 25:
			System.out.println("good job");
			break;
		case 50:
			System.out.println("good job - half century");
			break;
		case 100:
			System.out.println("good job - century");
			break;
	}
	i++;	
	}

}
}
