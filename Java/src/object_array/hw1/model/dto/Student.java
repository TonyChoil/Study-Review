package object_array.hw1.model.dto;

public class Student extends Person{

	private int grade;
	private String major;
	public static int sCount = 0;
	
	public Student() {sCount++;}


	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(age, height, weight);
		super.name = name;
		this.grade = grade;
		this.major = major;
		sCount++;
	}
	
	public int getGrade() {
		
		return grade;
	}
	
	public void setGrade(int grade) {
		
		this.grade = grade;
	}
	
	public String getMajor() {
		
		return major;
	}

	public void setMajor(String major) {
		
		this.major = major;
	}

	@Override
	public String information() {
		return super.information() + " 학년:" + this.grade + " 전공:" + this.major;
	}
	
	
	

	
	
}
