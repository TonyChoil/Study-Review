package contorl_flow_statment;

import java.util.Random;
import java.util.Scanner;

public class looping_statement {

    public static void main(String[] args) {

        looping_statement app = new looping_statement();

//        app.testSimpleForStatement();
//        app.oneToTen();
//        app.testForExample3();
        app.testSimpleWhileStatement();
    }

    Scanner sc = new Scanner(System.in);

    public void testSimpleForStatement(){
        for(int i = 1; i <= 10; i++){
            System.out.println(i + " 번째 학생의 이름을 입력해주세요");
            String name = sc.nextLine();
            System.out.println(i + " 번째 학생의 이름은" + name + "입니다.");
        }
        System.out.println("10명의 학생 이름을 입력 받고 출력하는 기능을 완료했습니다!");
    }

    public void oneToTen(){
        int sum = 0;
        for(int i = 1; i <= 10; i++){
            sum += i;
        }
        System.out.println("총합 : " + sum);
    }

    public void testForExample3(){
        
        /* 5 ~ 10 사이의 난수를 발생시켜
        1부터 발생한 난수 가지의 합계를 구해보자
        * */
        Random ran = new Random();
        int ran1 = ran.nextInt(6) + 5;
        int sum = 0;
        System.out.println("ran의 값 :" + ran1);

        for(int i = 1; i <= ran1; i++){
            sum += i;
        }

        System.out.println("sum값 : " + sum);
    }

    public void testSimpleWhileStatement() {

        int i = 1;
        while(i <= 10) {
            System.out.println(i);
            i++;
        }
    }
}
