package method_and_api;

import static method_and_api.Calculator.maxNumberOf;

public class Method {

    public static void main(String[] args){

        /*
         * 메소드란?
         * 메소드(Method)는 어떤 특정 작업을 수행하기 위한 명령문의 집합
         */

        //line을 찍어주면 breakpoint가 생성됨

        Method app1 = new Method();
        app1.methodA();

        System.out.println("main() 종료됨..");

        /* import : 서로 다른 패키지에 존재하는 클래스를 사용하는 경우
         * 			패키지명을 포함한 풀 클래스 이름을 사용해야한다.
         * 			하지만 매번 다른 클래스의 패키지명까지 기술하기에는 번거롭다.
         * 			그래서 패키지명을 생략하고 사용할 수 있도록한 구문이 import 구문.
         *
         * 			import는 package 선언문과 class선언문 사이에 작성하며
         * 			어떠한 패키지 내에 있는 클래스를 사용할 것인지에 대해 미리
         * 	 		선언하는 효과를 가진다.
         */

        Calculator calc = new Calculator();
        // import안할 시,
        //==com.greedy.section01.Method.Calculator calc =
        // new com.greedy.section01.Method.Calculator();

        int min = calc.minNumberOf(50, 60);
        System.out.println("50과 60 중 더 작은 값은 : " + min);

        int max = Calculator.maxNumberOf(50, 60);
        //static으로 선언 된 메소드의 경우, class만 import하고,
        //인스턴스를 만들지 않아도 class name.method로 사용 가능하다.

        /* 추가로 static 메소드를 호출할 때 메소드 자체를 import해주면
        클래스명도 생략하고 사용할 수 있다. */
    //import static method_and_api.Calculator.maxNumberOf;
    //        --> *주의 같은 package라도 패키지.클래스명.메소드명 다 써줘야됨

        int max2 = maxNumberOf(100, 200);
        System.out.println("100과 200 중 더 큰 값은 : " + max2);

    }

    /* 메소드(meethod)선언 */
    /* 접근제한자(public, protected, default, private) 반환형(void, 기본자료형, 참조자료형...) 메소드명(){}
     */
    public void methodA(){
        System.out.println("methodA() 호출됨..");

        methodB();

        System.out.println("methodA() 종료됨..");
    }

    public void methodB() {
        System.out.println("methodB() 호출됨..");
    }
}
