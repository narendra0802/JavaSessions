package constructersHandson;

public class testClass {

	public static void main(String[] args) {
		String[] plugins={"xpath","camera","addon"};
		Browsers b= new Browsers("Chrome",169.85,plugins);
		String[] returnData = b.getPlugin();
		int l=returnData.length;
		System.out.println(l+" " +returnData[l-1]);	
		System.out.println(b.getName());
		b.setName("chromeDriver");
		System.out.println(b.getName());

	}

}
