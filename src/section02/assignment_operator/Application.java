package section02.assignment_operator;

public class Application {

	public static void main(String[] args) {
		
		int num = 12;
		num -= 5; //num = num - 5;
		System.out.println(num);
		num =- 5;  // num = -5;  띄어쓰기 상관 x 걍 -5초기화
		System.out.println(num);
	}
}