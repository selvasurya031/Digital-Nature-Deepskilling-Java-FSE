package code;

public class Array {
	Employee[]  employees;
	int n;
	
	
	public Array(int count) {
		super();
		employees = new Employee[count];
		n =0;
	}


	public void add(Employee employee) {
		if(n < employees.length) {
			employees[n] = employee;
			n++;
			System.out.println("Employee Added");
		}
		else {
			System.out.println(" Cant Add .You Reached the Limit");
		}
		
	}
	
	public void search(int id) {
		for(Employee i : employees) {
			if(i==null)return;
			if(id==i.employeeid) {
				System.out.println("Search\n"+ i);
			}
		}
		System.out.println("Employee not Found");
	}
	public void Traverse() {
			System.out.println("\nEmployee List :");
		
		for(Employee i: employees) {
			if(i==null)return;
			System.out.println(i +"\n");
		}
	}
	public void Delete(int id) {
		for(int i =0;i<employees.length;i++) {
			if(employees[i]==null)return;
			if(id==employees[i].employeeid) {
				System.out.println("Deleted :"+ id);
				employees[i]=null;
				for(int j =i;j<employees.length-1;j++) {
					employees[j]=employees[j+1];
							employees[j+1]=null;
				}
			}
		}
	}

}
