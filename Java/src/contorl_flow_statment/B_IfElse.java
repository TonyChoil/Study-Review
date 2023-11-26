package contorl_flow_statment;

import java.util.Scanner;

public class B_IfElse {
	

	public void testNestedIfElseStatement() {
		Scanner sc1 = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc1.nextInt();
		if( num > 0 ) {
			System.out.println("입력하신 숫자는 양수입니다.");
		}else if( num < 0) {
			System.out.println("입력하신 숫자는 음수입니다");
		}else System.out.println("입력하신 숫자는 0입니다");
	}
}
