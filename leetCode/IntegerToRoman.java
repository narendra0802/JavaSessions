package leetCode;

import java.util.HashMap;
import java.util.Scanner;

public class IntegerToRoman {

	public static int lengthOfInteger(int input) {
		int l=0;
		while(input!=0) {
			input=input/10;
			l++;
		}	
		return l;	
	}

	public static int multipliedByIndex(int i) {
		int power = 1;
		while(i>0) {
			power=power*10;
			i--;
		}
		return power;

	}

	public static String convertToRoman(int input, HashMap<Integer,String> sample) {
		String temp = "";
		int denom=1;
		while(input>0) {	
			if(input>9) {
				denom = multipliedByIndex(lengthOfInteger(input)-1);
				System.out.println("denom"+denom);
				int value=(input/denom)*denom;
				if(value>=1000) {
					int q=value/1000;
					for(int z=0;z<q;z++) {
						temp+=sample.get(1000);	
					}

				}else if((value>=500)&&(value<1000)) {
					int q=(value%500)/100;
					if(value==900) {
						temp+="CM";
					}
					else if(value==500){
						temp+="D";
					}
					else {
						temp+="D";
						for(int z=0;z<q;z++) {
							temp+=sample.get(100);
						}
					}

				}else if((value>=100)&&(value<500)){
					int q=value/100;
					if(q==4) {
						temp+="CD";
					}else {
						for(int z=0;z<q;z++) {
							temp+=sample.get(100);
						}
					}
				}else if((value>=50)&&(value<100)) {
					int q=(value%50)/10;
					if(q==4) {
						temp+="XC";
					}else if(q==0) {
						temp+="L";
					}else {
						temp+="L";
						for(int z=0;z<q;z++) {
							temp+=sample.get(10);
						}
					}
				}else if((value>=10)&&(value<50)) {
					int q=value/10;
					if(q==4) {
						temp+="XL";
					}else {
						for(int z=0;z<q;z++) {
							temp+=sample.get(10);
						}
					}
				}


			}
			else {
				temp+=sample.get(input);
			}

			input=input%denom;
			System.out.println("Input after iteration: "+input);

		}
		return temp;
	}

	public static void main(String[] args) {
		HashMap<Integer,String> sample =new HashMap<Integer,String>();
		sample.put(1,"I");
		sample.put(2,"II");
		sample.put(3,"III");
		sample.put(4,"IV");
		sample.put(5,"V");
		sample.put(6,"VI");
		sample.put(7,"VII");
		sample.put(8,"VIII");
		sample.put(9,"IX");
		sample.put(10,"X");
		sample.put(50,"L");
		sample.put(100,"C");
		sample.put(500,"D");
		sample.put(1000,"M");
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number to be converted:");
		int input = in.nextInt();
		int lengthOfGivenInteger=lengthOfInteger(input);
		String outputInRoman=convertToRoman(input,sample);
		System.out.println("Roman Number of given INput: "+outputInRoman);


	}



}
