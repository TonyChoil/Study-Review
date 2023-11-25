package literal_and_variable;

public class literal {

    public static void main(String[] args) {
        /*1-3. 정수와 실수의 연산*/
        /*정수와 실수 연산의 결과는 항상 실수가 나온다*/
        System.out.println("=====정수와 실수의 연산======");
        System.out.println(123 + 0.5);
        System.out.println(123 - 0.5);
        System.out.println(123 * 0.5);

        /*2. 문자의 연산 */
        System.out.println("=====문자와 문자의 연산======");
        System.out.println('a' + 'b'); //'a' = 97 'b'=98
        System.out.println('a' - 'b');
        System.out.println('a' * 'b'); //9506
        System.out.println('a' / 'b'); //0 -> 몫
        System.out.println('a' % 'b'); //97 -> 나머지

        /*2-2. 문자와 정수의 연산*/
        System.out.println("=====문자와 정수의 연산======");
        System.out.println('a' + 1);
        System.out.println('a' - 1);
        System.out.println('a' * 2);
        System.out.println('a' / 2);
        System.out.println('a' % 2);

        /* 문자열 합치기 테스트 */
        System.out.println("============두 개의 문자열 합치기 ======");
        System.out.println(9 + 9); // 18
        System.out.println("9" + 9); // 99
        System.out.println("9" + 9 + 9 + 9); // 9999. 즉 한 번 문자열이 되버리면
        //그 다음도 문자열

        System.out.println("10과 20의 합 : " + (10 + 20));
    }
}
