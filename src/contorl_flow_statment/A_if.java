package contorl_flow_statment;

import java.util.Scanner;

public class A_if {
	
	// 메소드 주석 생성 단축키 : alt + shift + j
	
	/**
	 * <pre>
	 * 	단독 if문 실행 흐름을 확인하기 위한 용도의 기능을 제공
	 * 	정수 짝수여부 판단 확인용
	 * </pre>
	 */
	public void testSimpleIfStatement() {

		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = scanner.nextInt();
		if(num % 2 == 0) {
			System.out.println("입력하신 숫자는 짝수입니다.");
			
		}else System.out.println("입력하신 숫자는 홀수입니다.");
		
		System.out.println("프로그램을 종료합니다.");
	}
	
	//if문 등을 작성할 때 }가 끝나는 곳은
	//} 요렇게 if가 시작하는 곳 열에 맞춰준다.
	
	/**
	 * <pre>
	 * 	중첩 if구문 흐름을 확인하기 위한 용도의 메소드
	 * 	양의 정수 짝수인지 여부 판단 확인용
	 * </pre>
	 */
	public void testNestedIfStatement() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 :");
		int a = sc.nextInt();
		if( a > 0 ) {
			
			if( a % 2 == 0) {
				
				System.out.println("양수이면서 짝수입니다.");
			}
		}
		sc.close();
	}

		
}

