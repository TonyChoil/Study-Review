package literal_and_variable;

public class constant {

    public static void main(String[] args){

        /*
        상수의 명명규칙
        상수의 명명 규칙은 변수의 명명규칙과 컴파일 에러를 발생시키는 규칙은 동일하다.
        단, 개발자들끼리의 암묵적인 규칙에서 일부 차이를 보인다.

        1. 모든 문자는 영문자 대문자 혹은 숫자만 사용한다.
        2. 단어와 단어 연결은 언더스코어(_)를 사용한다.
        * */

        final int AGE1 = 20;
        //상수는 camel-case, 소문자 다 만드는 건 가능하지만(에러안나지만)
        //변수와 구분해주기 위해 대문자로 쓰는 것이 국룰

//        AGE1 = 30; //Cannot assign a value to final literal_and_variable.variable 'AGE1'

        //재할당은 안되지만 연삭식에서 사용가능
        System.out.println("AGE 2배 :" + (AGE1 * 2)); // 40

        int sum = AGE1; // 상수 값으로 변수 초기화 가능

        //AGE = AGE + 10; 불가능

    }
}
