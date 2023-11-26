package method_and_api;

public class Method3 {

    public static void main(String[] args) {

        System.out.println(Method4.sumTwoNumbers(10, 20));
        // 다른 class의 static 메소드 사용. class명을 명시해줬기 때문에 import 필요없음
        //class명 조차 생략하고 싶을때만 import 사용.


        /* 메소드 리턴 테스트 */
        /*
        모든 메소드 내부에는 (숨은)return;이 존재한다.
        즉 메소드가 끝나면 다시 main의 메소드 다음 line으로 돌아가는 것.
        void 메소드의 경우 return;을 명시적으로 작성하지 않아도 마지막 줄에
        컴파일러가 자동으로 추가를 해준다.

        return은 현재 메소드를 강제 종료하고 호출한 구문으로 다시 돌아가는 명령어.
         */

        Method3 app6 = new Method3();
        //String str = app6.testMethod();
        System.out.println(app6.testMethod2());
        //hello world  . 당연히 ""는 빠짐

        int first = 20;
        int second = 10;
        Method3 app7 = new Method3();
        System.out.println("두 수를 더한 결과 : "
                + app7.plusTwoNumbers(first, second));
        /* 매개변수와 리턴값 복합 활용 */
        /* 매개변수도 존재하고 리턴값도 존재하는 메소드를 이용하여 간단한 계산식 만들기 */
        System.out.println(app7.plusTwoNumbers2(first, second));


    }

    public void testMethod() {

        System.out.println("testMethod() 동작 확인...");

        return;

//        System.out.println("test");
        //Unreachable statement, return은 메소드 가장 마지막에 작성해야한다.
    }

    public String testMethod2() {

        return "hello world";
    }

    public int plusTwoNumbers(int first, int second) {

        return first + second;
//		int result = first + second;
//		return result;
    }
    /* 결과 값을 바로 return으로 String으로 받아줄 수 도 있음. */
    //매개변수 값을 int로 받고 return타입을 String으로 받아줌.
    public String plusTwoNumbers2(int first, int second) {

        return first + "와" + second + "의 합은 " + (first + second) + "입니다.";
    }
}
