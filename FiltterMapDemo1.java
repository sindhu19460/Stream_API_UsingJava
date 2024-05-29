package StreamFilter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee
{
	int empid;
	String empname;
	int salary;
	
	public Employee(int empid, String empname, int salary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
	}
	
	
}
public class FiltterMapDemo1 {

	public static void main(String[] args) {
		
		List<Employee> emp_list = new ArrayList<Employee>();
		
		emp_list.add(new Employee(1, "Jhon", 25000));
		emp_list.add(new Employee(2, "Prashi", 30000));
		emp_list.add(new Employee(3, "Bushu", 49000));
		emp_list.add(new Employee(4, "don", 41000));
		
		
		List<Integer> empSalary = emp_list.stream().filter(e->e.salary>=30000).map(e -> e.salary).collect(Collectors.toList());
		System.out.println(empSalary);
		
		System.out.println("--------------------------------------------");

		
		List<String> empname = emp_list.stream().filter(e->e.salary>=30000).map(e -> e.empname+" "+e.salary).collect(Collectors.toList());
		System.out.println(empname);
		 
		
	}

}
