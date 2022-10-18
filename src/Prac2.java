package src;

import java.util.HashMap;

class Detail{
	String name;
	
	public Detail(String name)
	{
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
}

public class Prac2 {
	
	public static void main(String[] args) {
		
		Detail d1=new Detail("Srikrishna");
		Detail d2=new Detail("Narendra");
			
		HashMap<Detail,String> h1=new HashMap<Detail,String>();
		h1.put(d1, "CSKFAN");
		h1.put(d2, "SRHFAN");
		System.out.println(d1.getName());
		System.out.println(h1.get(d1));	
	}

}
