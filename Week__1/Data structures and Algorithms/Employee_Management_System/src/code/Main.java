package code;

public class Main {
	public static void main(String[] args) {
		Array team = new Array(6);
		
		team.add(new Employee(101, "Sachin", "Software Engineer", 50000));

		team.add(new Employee(103, "Arun", "Project Manager", 80000));

		team.add(new Employee(104, "Kumar", "DevOps Engineer", 60000));

		team.add(new Employee(105, "Vijay", "Business Analyst", 55000));
		
		team.add(new Employee(106, "Priya", "UI/UX Designer", 48000));

		team.add(new Employee(107, "Anjali", "Data Analyst", 62000));

		team.add(new Employee(108, "Ramesh", "System Administrator", 58000));
        
        team.Traverse();
        

        team.Delete(105);
        team.Traverse();

		
	}
}
