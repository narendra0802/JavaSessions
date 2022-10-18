package encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setName("Narendra");
		emp.setSalary(1500000);
		emp.setActive(true);
		emp.setAge(31);
		emp.setGender('M');
		
		Employee emp2=new Employee();
		emp2.setName("Ajitha");
		emp2.setSalary(2500000);
		emp2.setActive(false);
		emp2.setAge(28);
		emp2.setGender('F');
		
		Object[] employeeInfo = emp.getEmployeeInfo();
		Object[] employeeInfo2 = emp2.getEmployeeInfo();
		
		for(Object o:employeeInfo) {
			System.out.println(o);
		}
		
		for(Object o:employeeInfo2) {
			System.out.println(o);
		}
		
		
	}

}
