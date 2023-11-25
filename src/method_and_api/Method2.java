package method_and_api;

public class Method2 {

    public static void main(String[] args){

    /* 전달인자(argument)와 매개변수(parameter)를 이용한 메소드 호출
     * 값을 넣어주는 것 : argument / 값을 받겠다 : parameter
     *
     * 변수의 종류
     * 1. 지역변수 : 선언한 메소드 블럭 내부에서만 사용 가능
     *  ->methodA()에서 생성된지역변수는 A에서만 사용 가능
     * 2.매개변수
     * 3.전역변수(field변수) : 클래스가 생성되고 종료될 때까지 살아있는 변수
     * 4.클래스변수(static)
     *
     * 이 때 전달하는 값을 전달인자(argument)
     * 메소드 선언부 괄호 안에 전달 인자를 받기 위해 선언하는 변수를
     * 매개변수(parameter)라고 부른다.
     */

    Method2 app3 = new Method2();

    /* 전달인자와 매개변수를 이용한 메소드 호출 테스트 */
    /* 1. 전달인자로 값 전달 테스트 */
    /* 호출하려는 메소드의 매개변수 선언부에 미리 선언해둔 자료형, 개수, 순서가
     * 일치하게 값을 넣어 호출. */
	testMethod(40); //여기서 40이 전달인자(argument)
    //app3.testMethod("40"); 오류.
    //app3.testMethod(20, 30, 40); 인자값이 다르기 때문에 안들어감.
    //JavaScript는 가능함.
    //app3.testMethod(); 매개변수 선언되있는데 인자 값 안 넣으면 호출불가.
    }

    public static void testMethod(int age){ //여기서 int age가 매개변수임(일종의 지역변수)
        //int age에 값을 넣어주는 것을 전달인자(argument)라고함.
        //int age = 30; duplicate variable.
        System.out.println("당신의 나이는 " + age + "세 입니다.");
    }

}
