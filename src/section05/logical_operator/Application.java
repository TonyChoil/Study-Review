package section05.logical_operator;

public class Application {

	public static void main(String[] args) {
		
		/* 논리 연산자의 우선순위 활용
		 * && : 11순위
		 * || : 12순위
		 * 논리 and 연산자 우선순위가 논리 or 연산자 우선순위보다 높음
		 */
		
		/* 1. 1부터 100 사이의 값인지 확인 
		 * 1 <= 변수 <= 100 <-- 이렇게는 사용 못한다.
		 * */
		int num1 = 55; 
		System.out.println("1부터 100사이인지 확인: " + (num1 >= 1 && num1 <= 100));
		
	} 
}  
