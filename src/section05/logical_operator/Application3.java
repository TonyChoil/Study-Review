package section05.logical_operator;

public class Application3 {

	public static void main(String[] args) {

		/*
		 * AND 연산과 OR 연산의 특징
		 * 논리식 && 논리식 : 앞의 결과가 false면 뒤를 실행 안한다.
		 * 논리식 || 논리식 : 앞의 결과가 true면 뒤를 실행 안한다.
		 */
		
		int num1 = 10;
		
		int result1 = (false && ++num1 > 0)? num1 : num1;
		//()? -> ()의 결과가 참이면 앞의 num1을 넣고 false면 : 뒤의 num1를 넣음
		System.out.println("&&실행 확인 : " + result1); //10 나옴. ++num1 실행 안해줌.
	   
		int num2 = 10;
		int num22 = 100;
		int result2 = (false || ++num2 <0)? num22 : num2;
		//false 면 뒤에 ++를 실행함. 근데 값이 false 니깐 뒤에 num2를 넣어줌.
		//만약 true면 num2 를 1증가시키고 result2는 num22가 들어감.
		System.out.println("||실행 확인 :" + result2); //10
	} //how to disable auto creation of curly brackets in eclipse?

}
