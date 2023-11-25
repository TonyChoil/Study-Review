package section04.comparison_operator;

public class Application1 {

	public static void main(String[] args) {

		/* 비교 연산자 */
		
		/*
		 * 비교 연산자는 피연산자 사이에서 상대적은 크기를 판단하여 참 혹은 거짓을 반환하는 연산자
		 * 연산자 중 참(true) 혹은 거짓(false)를 반환하는 연산자는 삼항연산자의 조건식이나
		 * 조건문의 조건절에 만이 사용된다(고로 충분한 연습이 필요하다.)
		 */
		
		int inum1 = 10;
		int inum2 = 20;
		
		System.out.println("==========정수값 비교=========");
		System.out.println("inum1과 inum2가 같은지 비교 : " + (inum1 == inum2)); //false
		System.out.println("inum1과 inum2가 같지 않은지 비교 : " + (inum1 != inum2)); //true
		System.out.println("inum이 inum2보다 큰지 비교: " + (inum1 > inum2)); //flase
		System.out.println("inum이 inum2보다 작거나 같은: " + (inum1 <= inum2)); //ture
		
		//문자값 비교도 가능
		char ch1 = 'a';
		char ch2 = 'A';
		
		System.out.println(ch1 > ch2); //ch1 = 97 ch2 =65
		
		/*논리값 비교*/
		/* ==와 !=은 비교 가능하지만 대소비교(< > >= <=) 등은 불가 */
		boolean bool1 = true;
		boolean bool2 = false;
		
		System.out.println("==========논리값 비교=========");
		System.out.println("bool1과 bool2가 같은지 비교 : " + (bool1 == bool2)); //false
		System.out.println("bool1과 bool2가 같은지 비교 : " + (bool1 != bool2)); //true
		
		/* 문자열값 비교 */
		/*==과 !=은 비교 가능하지만 대소비교는 불가능하다. */
		
		String str1 = "java";
		String str2 = "java1";
		System.out.println(str1 != str2); //true

	
	}
	
}