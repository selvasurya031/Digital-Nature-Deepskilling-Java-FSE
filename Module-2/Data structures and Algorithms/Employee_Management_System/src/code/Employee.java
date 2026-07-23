package code;

public class Employee {
	int employeeid;
	String name;
	String position;
	int salary;
	
	public Employee(int employeeid, String name, String position, int salary) {
		super();
		this.employeeid = employeeid;
		this.name = name;
		this.position = position;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", name=" + name + ", position=" + position + ", salary=" + salary
				+ "]";
	}
	
	
	

}
