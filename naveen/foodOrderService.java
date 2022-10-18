package naveen;

import java.util.ArrayList;

public class foodOrderService {

	public boolean login(long phoneNumber,String password) {
		return true;	
	}

	public boolean login(long phoneNumber,int otp) {
		return true;	
	}

	public boolean login(String userName, String password) {
		return true;
	}

	public boolean login(String userName,String password,int otp) {
		return true;
	}

	public int searchRestaurant(String restaurantName) {

		return 100;
	}

	public ArrayList<String> searchRestaurant(String restaurantName,String foodItem) {
		ArrayList<String> items=new ArrayList<String>();
		items.add("masalaDosa");
		items.add("setDosa");
		items.add("gheeDosa");
		items.add("podiDosa");
		items.add("upmaPesarettu");
		
		return items;

	}
	
	public ArrayList<String> searchRestaurant(String restaurantName,String foodItem,int price) {
		ArrayList<String> items=new ArrayList<String>();		
		return items;
	}
	
	public ArrayList<String> searchRestaurant(String restaurantName,String foodItem,int price,byte rating) {
		ArrayList<String> items=new ArrayList<String>();
		return items;
	}
	

	public static void main(String[] args) {


	}

}
