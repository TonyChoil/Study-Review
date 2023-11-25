package section05.logical_operator;

public class Application1 {
	
	public static void main(String[] args) {
		/*
	       * 논리 연산자의 종류
	       * 1. 논리 연결 연산자 : 두 개의 피연산자를 가지는 이항 연산자이며, 연산자의 결합 방향은 왼쪽에서 오른쪽이다. 두 개의 논리 식을 판단하여 참과 거짓을 판단한다.
	       *                    
	       *    1-1. &&(논리 AND) 연산자: 두 개의 논리식 모두 참일 경우 참을 반환, 한개라도 거짓인 경우 거짓을 반환하는 연산자이다.
	       *    1-2. ||(논리 OR) 연산자 : 두 개의 논리식 중 둘 중 하나라도 참일 경우 참을 반환, 둘다 모두 거짓일 경우 거짓을 반환한다.
	       * 2. 논리 부정 연산자 : 피연산자가 하나인 단항연산자로, 피연산자의 결합방향은 왼쪽에서 오른쪽이다.
	       *    1-1. !(논리 NOT) 연산자 : 논리식의 결과가 참이면 거짓을 거짓이면 참을 반환한다.
	        * */
		
		System.out.println(true && true); //true
		System.out.println(true && false); //false
		//&&는 and조건
		System.out.println(false && false); //false
		System.out.println(false && true); //false
		//여기서 Dead code라는 건 의미가 없음.. 왜냐? &&가 true가 되려면 둘다 참이 되어야 하는데..
		//시작부터 false 면 어차피 false임
		System.out.println(true || true); //true
		System.out.println(true || false); //true
		//&&는 and조건
		System.out.println(false || false); //false
		//여기도 dead코드. 왜냐? ||는 하나만 true면 true가 뜨는데, 시작부터 true면
		//뒤에를 더 볼필요가 없기 때문에.
	  
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		
		System.out.println("a가 b보다 작으면서 c가 d보다 작은지 확인: " + (a < b && c < d));
		
		/* 2. 영어 대문자인지 확인*/
		char ch1 = 'G';
		System.out.println("영어 대문자인지 확인 : " + (ch1 >= 'A' && ch1 <= 'Z'));
		System.out.println("영어 대문자인지 확인 : " + (ch1 >= 65 && ch1 <= 90));
		
		char ch2 = 'g';
		System.out.println("영어 소문자인지 확인 : " + (ch2 >= 91 && ch2 <= 122));
		
		/* 대소문자 사오간없이 영문자 y인지 확인 */
		char ch3 = 'Y';
		System.out.println("영문자 y인지 확인 : " + (ch3 =='Y' || ch3 == 'y'));
		
		/* 영문자인지 확인 */
		char ch4 = 'D';
		System.out.println("영문자인지 확인 : " + ((ch4 >= 'A' && ch4 <= 'Z') || ch4 >= 'a' && ch4 <= 'z'));
		System.out.println("영문자인지 확인 : " + ( (ch4>='A' && ch4 <= 'z') ) );

	}

}
