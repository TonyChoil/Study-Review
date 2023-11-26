package method_and_api;

public class Method4 {

    public static void main(String[] args){

        /* static 메소드 호출

        클래스명.메소드명();
        *  */
        System.out.println("10과 20의 합 : " + Method4.sumTwoNumbers(10, 20));

        /* 동일한 클래스 내에 작성된 static 메소드는 클래스명 생략이 가능하다. */
        System.out.println("10과 20의 합 : " + sumTwoNumbers(10, 20));

        /* 1. non-static 메소드인 경우 */
        /* 클래스가 다르더라도 사용하는 방법은 동일함.
         * 클래스명 변수이름 = new 클래스명();
         * 변수이름.메소드명();
         *  */

        int first = 100;
        int second = 50;

        Calculator calc = new Calculator();
        int min = calc.minNumberOf(first, second);

        System.out.println("두 수 중 최소값은 : " + min);


        /* 2. static 메소드인 경우 */
        /*다른 클래스에 작성한 static메소드의 경우
         * 호출할 때 반드시 클래스명을 기술해야한다.
         * 클래스명.메소드명();
         * why ? ->메소드명 중복될 수 있기 때문에 클래스명으로 구분해줌.
         */
        int max = Calculator.maxNumberOf(first, second);

        System.out.println("두 수 중 최대값은 : " + max);

        /* 주의
         * static 메소드도 non-static 메소드처럼 호출은 가능하다
         * 하지만 권장하지 않는다.
         */

        int max2 = calc.maxNumberOf(first, second);

    }

    /**
     * <pre>
     *     두 수를 더한 결과를 반한하는 기능을 제공
     *     static 메소드 호출을 위한 메소드
     * </pre>
     * @param first 더하기를 할 첫 번째 정수
     * @param second 더하기를 할 두 번째 정수
     * @return 두 수를 더한 결과를 리턴
     */
    public static int sumTwoNumbers(int first, int second){

        return first + second;
    }
}
