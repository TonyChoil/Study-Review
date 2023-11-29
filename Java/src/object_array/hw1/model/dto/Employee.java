package object_array.hw1.model.dto;

public class Employee extends Person{

	private int salary;
	private String dept;
	public static int empCount = 0;
	
	public Employee() {empCount++;}


	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(age, height, weight);
		super.name = name;
		this.salary = salary;
		this.dept = dept;
		empCount++;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public int getSalary() {
		
		return salary;
	}
	
	public void setSalary(int salary) {
		
		this.salary = salary;
	}
	
	@Override
	public String information() {
		return super.information() + " 급여:" + this.salary + " 부서:" + this.dept;
	}



	
	
	
	
}
