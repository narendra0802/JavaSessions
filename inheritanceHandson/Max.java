package inheritanceHandson;

public class Max extends Hospital {
	@Override
	public void availableBeds() {
		System.out.println("Max availableBeds");
	}

	@Override
	public void emergencyWard() {
		System.out.println("Max emergencyWard");
	}
	
	public void maxPatientsList() {
		System.out.println("Max PatientsList");
	}
}
