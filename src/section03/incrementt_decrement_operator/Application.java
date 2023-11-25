package section03.incrementt_decrement_operator;

public class Application {

	public static void main(String[] args) {
		
		/* 증감연산자 */
		/* 피연산자의 앞 or 뒤에 사용이 가능하다. */
		/*
		 * 
		 * 다른 연산자와 함께 사용할 때 의미가 달라짐
		 */
		int firstNum = 20;
		
		int result1 = firstNum++ * 3;
		// 뒤에 ++가 붙으면 해당 연산이 끝나고 1증가
		System.out.println("result1 : " + result1); //60
		System.out.println("firstNum : " + firstNum); //21

		int firstNum2 = 20;
		
		int result2 = ++firstNum2 * 3;
		//++먼저 올리고 나머지 처리

		System.out.println("result2 : " + result2); //60
		System.out.println("firstNum2 : " + firstNum2); //21

	}
}
