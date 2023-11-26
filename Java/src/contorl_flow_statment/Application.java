package contorl_flow_statment;

import java.util.Scanner;

public class Application {

	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

//		A_if check1 = new A_if();
//		check1.testSimpleIfStatement();
//		check1.testNestedIfStatement();
//		check1메소드는 A_if에서 가져왔는데, 여기 sc.close()가 있음.
//		B_IfElse check = new B_IfElse();
//		check.testNestedIfElseStatement();
//		여기는 sc1.scanner로 만들어놨는데, scanner 변수 이름이 달라도 다 꺼짐
//		왜? 메모리에 올홍려놓고 Scanner 객체를 한번에 다 꺼버리기 때문에 그럼.
//	
//		C_IfElse scoreProcessor = new C_IfElse();
//		scoreProcessor.testnestedIfElseIfStatement();
//		D_switch d = new D_switch();
//		//d.testSimpleSwitchStatement();
//		d.testSwitchVendingMachine();


		System.out.println("안녕" == "안녕");
		Application app = new Application();

		app.dowhileTest();
	}

	public void dowhileTest(){
		String str = "";


		do {
			System.out.println("문자열을 입력하세요");
			str = sc.nextLine();
			System.out.println(str);
		} while(!str.equals("exit"));
/*문자열을 ==로 직접 비교하게 되면, 주소값을 비교하는 것인데,
같은 string이면 true가 뜨겠지만, 위의 str은 변수의 주소값을 가리키므로
조면문에 str == "exit" 이라고하면 무조건 false가 뜨게 된다.
따라서 String class가 제공하는 equals메소드를 사용함.
equals는  대소문자 구분함.
*/
	}

	public void testnestedIfElseIfStatement() {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생의 이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.print("학생의 점수를 입력하세요 : ");
		int score = sc.nextInt();

		/* 학생의 이름과 점수 입력 */
		String grade = "";
		if(score >= 90) {
			grade = "A";
			if ( score >=95) {
				grade = "A+";
			}
		}else if(score >= 80) {
			grade = "B";
			if ( score >=85) {
				grade = "B+";
			}
		}else if(score >= 70) {
			grade = "C";
			if ( score >=75) {
				grade = "C+";
			}
		}else if(score >= 60) {
			grade = "D";
			if ( score >=65) {
				grade = "D+";
			}
		}else grade = "F";

		System.out.println(name + "의 등급은" + grade + "입니다.");
	}

	public void testSwitchVendingMachine() {

		System.out.println("========== greedy vending machine ========");
		System.out.println("      사이다      콜라      환타      바카스      핫식스");
		System.out.println("==========================================");
		System.out.print("음료를 선택해주세요 : ");

		Scanner sc = new Scanner(System.in);
		String selectedDrink = sc.nextLine();

		/* 원하는 음료에 맞는 가격을 저장할 변수 */
		int price = 0;

		switch(selectedDrink) {

			case "사이다" :
				System.out.println("사이다를 선택하셨습니다.");
				price = 500;
				break;
			case "콜라" :
				System.out.println("콜라를 선택하셨습니다.");
				price = 600;
				break;
			case "환타" :
				System.out.println("환타를 선택하셨습니다.");
				price = 700;
				break;
			case "바카스" :
				System.out.println("바카스를 선택하셨습니다.");
				price = 2000;
				break;
			case "핫식스" :
				System.out.println("핫식스를 선택하셨습니다.");
				price = 10000;
				break;
		}

		System.out.println(price + "원을 투입해주세요! ");
	}
}