package encapsulation;

public class Employee {

	private String name;
	private int age;
	private long salary;
	private boolean isActive;
	private char gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public Object[] getEmployeeInfo() {
		Object obj[]=new Object[5];
		obj[0]=name;
		obj[1]=age;
		obj[2]=salary;
		obj[3]=isActive;
		obj[4]=gender;
		
		return obj;
		
	}
}
