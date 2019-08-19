package inherence;

public class Employee extends Person {
	private String title;
	private String employer;
	private String salary;
	private String employeegrade;
	public String getTitle() {
		return title;	
	}
	public void setSalary( String salary) {
		this.salary=salary;
	}	
	public String getTSalary() {
		return salary;	
	}
	public void setTitle( String title) {
		this.title=title;
	}
	public String getTEmployer() {
		return employer;	
	}
	public void setEmployer( String employer) {
		this.employer=employer;
	}
	public String getTEmployeegrade() {
		return employeegrade;	
	}
	public String toString() {
		return(this.getName()+";"+salary);
	}
	
	public void setEmployeegrade( String employeegrade) {
		this.employeegrade=employeegrade;
	}
	public static void main(String[] args) {
	Employee emp=new Employee()	;
	emp.setName("madhuri");
	emp.setEmailid("test@test.com");
	emp.setEmployeegrade("high");
	emp.setEmployer("BOFA");
	emp.setPhonenum("1234567");
	emp.setSalary("100K");
	emp.setTitle("QA lead");
	System.out.println(emp.toString());

	}
	

}
