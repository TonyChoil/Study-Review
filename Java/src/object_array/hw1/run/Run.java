package object_array.hw1.run;

import java.util.Scanner;

import object_array.hw1.model.dto.Employee;
import object_array.hw1.model.dto.Student;

public class Run {

	public static void main(String[] args) {

		Student[] student = new Student[3];
		Employee employ[] = new Employee[10];	

		student[0] = new Student("홍길동", 20, 178.2, 70, 1, "정보시스템공학과");
		student[1] = new Student("김말똥", 21, 187.3, 80, 2, "경영학과");
		student[2] = new Student("강개순", 23, 167.0, 45, 4, "정보통신공학과");
		
		for(Student a : student) {
			
			System.out.println(a.information());
		}
		
		System.out.println();
		employ[0] = new Employee("박보검", 26, 180.3, 72, 100000000, "영업부");
		employ[1] = new Employee("강동원", 38, 182, 76, 200000000, "기획부");
	    
		
//		System.out.println(Employee.empCount); //static에 public 안붙이면
		//student / person은 서로 가능한데 default->같은패키지까지만허용
		//protected -> 같은패키지까지 + 상속으면 가능
		
		
		System.out.println(employ[0].information());
		System.out.println(employ[1].information());
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("사원을 추가하시겠습니까?(y/n)");
			char yesOrNo = sc.nextLine().charAt(0);
			if( yesOrNo == 'y' || yesOrNo == 'Y'){
				System.out.print("이름 입력: ");
				String name = sc.nextLine();
				System.out.print("나이 입력: ");
				int age = sc.nextInt();
				System.out.print("키 입력: ");
				double height = sc.nextInt();
				System.out.print("몸무게 입력: ");
				double weight = sc.nextInt();
				System.out.print("급여 입력: ");
				int salary = sc.nextInt();
				sc.nextLine();
				System.out.print("부서 입력: ");
				String dept = sc.nextLine();
				
				employ[Employee.empCount] = new Employee(name, age, height, weight, salary, dept);
							
			}else if ( yesOrNo == 'n' || yesOrNo ==  'N') {
				
				break;				
			}else continue;
			
		}
		
		for(int i = 0; i < employ.length; i++) {
			
			if(employ[i] != null) {
				
				System.out.println(employ[i].information());
			}else break;
			
		}
	}

}
