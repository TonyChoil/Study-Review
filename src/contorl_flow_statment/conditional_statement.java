package contorl_flow_statment;

import java.util.Scanner;

public class conditional_statement {

    public void testSimpleIfStatement() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        int num = scanner.nextInt();
        if(num % 2 == 0) {
            System.out.println("입력하신 숫자는 짝수입니다.");

        }else System.out.println("입력하신 숫자는 홀수입니다.");

        System.out.println("프로그램을 종료합니다.");
    }
}


