package operator;

public class operator {

    public static void main(String[] args){

        /*
         * 산술 연산자
         *
         * 산술 연산자는 주로 사칙연산과 관련된 연산자로 가장 기본적이면서도 많이 사용되는 연산자이다.
         * 연산의 실행이 가능하기 위해 필요한 값이나 변수가 두 개인 이항 연산자로 분류되며
         * 피연산자들의 연산 방향은 '왼쪽에서 오른쪽'이다.
         */

        /*
         * 산술 연산자의 우선순위
         * 수학의 개념과 유사하게 곱하기와 나누기 연산이 더하기와 빼기 연산보다 우선적으로 동작하고
         * 우선순위가 같은 경우 연산자의 결합방향에 의해 실행 순서가 결정된다.
         */

        int num1 = 20;
        int num2 = 7;

        System.out.println("num1 + num2 = " + num1 + num2);
        // 207나옴.. 왜냐? 앞에 문자열 + 나오면 뒤에는 걍 다 문자열로 변함
        System.out.println("num1 + num2 = " + (num1 + num2));
        //이러면 27나옴. 근데 27도 string임, 왜냐? 앞에 문자열 나왔으니깐.

        int num = 12;
        num -= 5; // num = num - 5;
        System.out.println(num);

        num =- 5; // -5 -> 띄어쓰기 상관 x 그냥 -5로 초기화 됨.
        System.out.println(num);

        /* 증감연산자 */
        /* 피연산자의 앞 or 뒤에 사용이 가능하다. */
        /*
         *
         * 다른 연산자와 함께 사용할 때 의미가 달라짐
         */

        int firstNum = 20;

        int result1 = firstNum++ * 3;
        // ++가 뒤에 붙으면, 해당 항의 연산이 끝난 뒤 증가시킴.
        System.out.println("result1 : " + result1); //60
        System.out.println("firstNum : " + firstNum); //21

        int firstNum2 = 20;

        int result2 = ++firstNum2 * 3;
        //++먼저 올리고 뒤에 연산 진행.


        System.out.println("result2 : " + result2); //63
        System.out.println("firstNum2 : " + firstNum2); //21

        /* 비교 연산자 */
        /*
         * 비교 연산자는 피연산자 사이에서 상대적은 크기를 판단하여 참 혹은 거짓을 반환하는 연산자
         * 연산자 중 참(true) 혹은 거짓(false)를 반환하는 연산자는 삼항연산자의 조건식이나
         * 조건문의 조건절에 많이 사용된다(고로 충분한 연습이 필요하다.)
         */

        int inum1 = 10;
        int inum2 = 20;

        System.out.println("==========정수값 비교=========");
        System.out.println("inum1과 inum2가 같은지 비교 : " + (inum1 == inum2)); //false
        System.out.println("inum1과 inum2가 같지 않은지 비교 : " + (inum1 != inum2)); //true
        System.out.println("inum이 inum2보다 큰지 비교: " + (inum1 > inum2)); //flase
        System.out.println("inum이 inum2보다 작거나 같은: " + (inum1 <= inum2)); //ture

        //문자값 비교도 가능
        char ch1 = 'a';
        char ch2 = 'A';

        System.out.println(ch1 > ch2); //ch1 = 97 ch2 =65 -> true

        /*논리값 비교*/
        /* ==와 !=은 비교 가능하지만 대소비교(< > >= <=) 등은 불가 */
        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println("==========논리값 비교=========");
        System.out.println("bool1과 bool2가 같은지 비교 : " + (bool1 == bool2)); //false
        System.out.println("bool1과 bool2가 같은지 비교 : " + (bool1 != bool2)); //true

        /* 문자열값 비교 */
        /*==과 !=은 비교 가능하지만 대소비교는 불가능하다. */

        String str1 = "java";
        String str2 = "java1";
        System.out.println(str1 != str2); //true

        num1 = 10;
        num2 = 10;

        int result3 = (false && ++num1 > 0)? num1 : num1;
        //앞에 false기 때문에 뒤에 ++가 실행되지 않는다.
//        int result4 = (true && num2++ > 0)? num2 : num2;
        int result4 = (true && num2++ > 0)? num2 : num2;
        // 뒤의 ++는 해당 항이 끝나고 붙지만, ()안의 계산이기때문에
        //대입할때의 num2는 이미 11이 되어 있다.
        System.out.println("&&실행 확인 : " + result3); //10 나옴. ++num1 실행 안해줌.
        System.out.println("&&실행 확인 : " + result4); //10 나옴. ++num1 실행 안해줌.
        System.out.println("num1 : " + num1 + "\n" + "num2 : " + num2);

        /* 영문자인지 확인 */
        char ch4 = 'D';
        System.out.println("영문자인지 확인 : " + ((ch4 >= 'A' && ch4 <= 'Z') || ch4 >= 'a' && ch4 <= 'z'));
        System.out.println("영문자인지 확인 : " + ( (ch4>='A' && ch4 <= 'z') ) );

        /* 1. 1부터 100 사이의 값인지 확인
         * 1 <= 변수 <= 100 <-- 이렇게는 사용 못한다.
         * */
        num1 = 55;
        System.out.println("1부터 100사이인지 확인: " + (num1 >= 1 && num1 <= 100));

        /* 삼항 연산자 */
        /* 자바에서 유일하게 피연산자 항목이 3개인 연산자 */
        /* (조건식)? 참일 때 사용할 값1: 거짓일 때 사용할 값2
         *
         * 조건식은 반드시 결과가 true 또는 false가 나오게 작성
         *
         * 삼항연산자는  중첩도 가능함.
         *
         * 주로 비교/논리연산자가 사용된다.
         */

        /* 삼항 연산자 중첨 */
        int num3 = -1;
        int num4 = 0;
        int num5 = -5;

        String result5 = (num3 > 0)? "양수다" : (num3 == 0) ? "0이다" : "음수다.";
        System.out.println(result5);
    }
}
