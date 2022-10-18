package inheritanceHandson;

public class Apollo extends Hospital {
	@Override
	public void availableBeds() {
		System.out.println("APollo availableBeds");
	}
	
	public int availableBeds(int i) {
		return i;
	}

	
	@Override
	public void emergencyWard() {
		System.out.println("Apollo emergencyWard");
	}
	
	public void patientsList() {
		System.out.println("Apollo PatientsList");
	}
}
