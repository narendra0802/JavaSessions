package src;

import java.util.ArrayList;
import java.util.HashMap;

public class exer3<T> {

	@SuppressWarnings({ "unchecked", "deprecation" })
	public void checkTemplate() {
		ArrayList<T> s1=new ArrayList<T>();
		ArrayList<T> s2=new ArrayList<T>();
		
		s1.add((T) "Chennai");
		s1.add((T) "CSKFAN");
		s1.add((T) new Integer(27));
		s2.add((T) "Hyd");
		s2.add((T) "SRHFAN");
		s2.add((T) new Integer(16));
		HashMap<String,ArrayList<T>> h1=new HashMap<String,ArrayList<T>>();
		h1.put("Srikrishna",s1);
		h1.put("Narendra",s2);
		System.out.println(h1.get("Srikrishna"));
	}
	
	public static void main(String[] args) {
	
	exer3 o1=new exer3<>();
	o1.checkTemplate();
	
	
	}

}
