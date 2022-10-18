package src;

import java.util.HashMap;
import java.util.Map;

public class helloWorld {

	public static void main(String[] args) {
		
		HashMap<String,String> h1=new HashMap<String, String>();
		h1.put("10","Name");
		h1.put("30","age");
		h1.put("20","address");
		for(Map.Entry<String, String> i:h1.entrySet())
		{
			System.out.println(i.getKey()+" "+i.getValue());
		}
		
		
		
		
		

	}

}
