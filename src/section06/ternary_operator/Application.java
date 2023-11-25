package section06.ternary_operator;

public class Application {

	public static void main(String[] args) {
		
		/* 삼항 연산자 */
		/* 자바에서 유일하게 피연산자 항목이 3개인 연산자 */
		/* (조건식)? 참일 때 사용할 값1: 거짓일 때 사용할 값2
		 * 
		 * 조건식은 반드시 결과가 true 또는 false가 나오게 작성
		 * 
		 * 삼항연산자는  중첩도 가능함.
		 * 
		 * 주로 비교/논리연산자가 사용된다.
		 */
		
		int num1 = 10;
		int num2 = -10;
		
		String result1 = (num1 > 0) ? "양수다" : "양수가 아니다";
		System.out.println("num1은 " + result1);
		
		/* 삼항연산자 중첩 */
		int num3 = -1;
		int num4 = 0;
		int num5 = -5; 
		
		String result3 = (num3 > 0)? "양수다" : (num3 == 0) ? "0이다" : "음수다";
		System.out.println(result3);
		
		String result4 = (num4 > 0)? "양수다" : (num4 == 0)? "0이다" : "음수다";
		System.out.println(result4);

	}
}
