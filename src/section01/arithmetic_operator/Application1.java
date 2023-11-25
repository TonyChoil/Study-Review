package section01.arithmetic_operator;

public class Application1 {
 
	public static void main(String[] args) {
		
		/*
		 * 산술 연산자
		 * 
		 * 산술 연산자는 주로 사칙연산과 관련된 연산자로 가장 기본적이면서도 많이 사용되는 연산자이다.
		 * 연산의 실행이 가능하기 위해 필요한 값이나 변수가 두 개인 이항 연산자로 분류되며
		 * 피연산자들의 연산 방향은 '왼쪽에서 오른쪽'이다.
		 */
		
		/*
		 * 산술 연산자의 우선순위
		 * 수학의 개념과 유사하게 곱하기와 나누기 연산이 더하기와 빼기 연산보다 우선적으로 동작하고
		 * 우선순위가 같은 경우 연산자의 결합방향에 의해 실행 순서가 결정된다.
		 */
		
		int num1 = 20;
		int num2 = 7;
		
		System.out.println("num1 + num2 = " + num1 + num2);
		// 207나옴.. 왜냐? 앞에 문자열 + 나오면 뒤에는 걍 다 문자열로 변함
		System.out.println("num1 + num2 = " + (num1 + num2));
		//이러면 27나옴. 근데 27도 string임, 왜냐? 앞에 문자열 나왔으니깐.
		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("num1 + num2 = " + (num1 - num2));
		System.out.println("num1 + num2 = " + (num1 * num2));
		System.out.println("num1 + num2 = " + (num1 / num2));
		System.out.println("num1 + num2 = " + (num1 % num2));
		
		

		
	}
}
