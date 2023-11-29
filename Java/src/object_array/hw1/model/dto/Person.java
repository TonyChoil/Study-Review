package object_array.hw1.model.dto;

public class Person {

	protected String name;
	private int age;
	private double height;
	private double weight;
	public static int pCount = 0;
	
	public Person() {pCount++;}


	public Person(int age, double height, double weight) {
		this.age = age;
		this.height = height;
		this.weight = weight;
		pCount++;
	}
	
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
	
	public double getHeight() {
		
		return height;
	}
	
	public void setHeight(double height) {
		
		this.height = height;
	}
	
	public double getWeight() {
		
		return weight;
	}
	
	public void setWeight(double weight) {
		
		this.weight = weight;
	}
	
	public String information(){
		
		return "이름:" + this.name + " 나이:" + this.age + " 신장:" + this.height
			   + "몸무게:" + this.weight;
		
	}

	
	
}
