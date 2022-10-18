package inheritanceHandson;

public class TestHospital {

	public static void main(String[] args) {
		Apollo ap=new Apollo();
		Hospital hos=new Hospital();
		Hospital hos2=new Apollo();
		
		ap.availableBeds();
		int i=ap.availableBeds(10);
		System.out.println(i);
		ap.patientsList();
		hos.availableBeds();
		hos2.availableBeds();
		
//		Apollo ap2=(Apollo) new Hospital();
//		ap2.availableBeds();
		
	}

}
