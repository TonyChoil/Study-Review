package method_and_api;

import java.util.Scanner;

public class Scanner1 {

    public static void main(String[] args){

        /* java.util.Scanner을 이용한 다양한 자료형 값 입력 받기 */

        /* 1. Scanner1 객체 생성 */
        //java.util.Scanner1 sc = new java.util.Scanner1(java.lang.System.in);

        /*  java.lang은 패키지이름을 생략 가능 */
        Scanner sc = new Scanner(System.in);

        /* 2. 자료형 별 값 입력받기 */
        /* nextLine() : 입력받은 값을 문자열로 반환 */
//        System.out.print("이름을 입력하세요 : ");
//        String name = sc.nextLine();
//        System.out.println("입력하신 이름은 " + name + "입니다.");

        /* nextInt() : 입력받은 값을 int형으로 반환해준다.
         *
         * int 범위를 초과한 값을 받게되면 InputMismatchException이 발생한다.
         * int에 String입력해도 똑같음.
         * */
//        System.out.print("나이를 입력하세요 : ");
//        int age = sc.nextInt();
//        System.out.println("입력하신 나이는 " + age + "입니다.");
//
//        /* nextLong() : 입력받은 값을 long형으로 반환 */
//        System.out.print("금액을 입력해주세요 : ");
//        long money = sc.nextLong();
//        System.out.println("입력하신 금액은 " + money + "원 입니다.");
//
//        /* nextFloat() : 입력받은 값을 float 형으로 반환한다. */
//        System.out.print("키를 입력하세요 : ");
//        float height = sc.nextFloat();
//        System.out.println("입력하신 키는 " + height + "cm 입니다.");

        System.out.println("참과 거짓 중에 한 가지를 true or false로 입력해주세요 :");
        boolean isTrue = sc.nextBoolean();
        System.out.println("입력하신 논리값은 " + isTrue + "입니다.");
        //true / false 이외것입력하면 에러남. 대소문자구별안함

        /* Scanner의 nextLine() 와 next()
         * nextLine() : 공백을 포함한 한 줄을 입력을 위한 개행문자(\n) 전까지 읽어서
         * 문자열로 반환 (공백문자 포함)
         * next() : 공백문자 or 개행문자 전 까지만 읽음(공백문자 포함x)
         * 즉 띄어쓰기만해도 .
         * */

//        /* nextLine() */
//        System.out.print("인사말을 입력하세요 : ");
//        String greeting1 = sc.nextLine(); // 안녕하세요 반갑습니다.
//        System.out.println(greeting1);
//
//        /* next() */
//        System.out.print("인사말을 입력하세요 : ");
//        String greeting2 = sc.next(); //한 줄 단위로 끊어서 제공함.
//        System.out.println(greeting2);
//        String greeting3 = sc.next();
//        System.out.println(greeting3);

        /* 스캐너 주의 사항
         *
         * 스캐너의 next 메소드들은 입력한 내용을 버퍼로부터 토큰단위로 분리해서 읽어온다.
         * 1. next() 로 문자열 입력 받은 후 정수nextint(), 논리값(nextBoolean() 등을
         * 입력받을 때
         * */

        System.out.println("문자열을 입력해주세요 : ");
        String str1 = sc.next();
        System.out.println("str1 : " + str1);

        sc.nextLine(); //딱히 담아주지 않아도 알아서 뽑아옴.

        System.out.println("숫자를 입력해주세요 :");
        int num1 = sc.nextInt();
        System.out.println("num1 : " + num1);

        //문자열에 "안녕하세요"만 입력하면 에러 x ->buffer공간 clear
        //문자열에 "안녕하세요 반갑습니다" 입력하면 "반갑습니다"가 남아있기 때문에
        //그 다음 nextint()공간에 들어갈 수 없기 때문에 에러가 납니당..
        //->sc.nextLine(); 을 선언해서 buffer공간의 내용을 뽑고 다시 nextInt()사용가능.


        /* 2.정수, 실수, 논리값 입력 후 nextline()로 문자열을 입력받을 때 */

        System.out.println("숫자를 입력해주세요 : ");
        int num2 = sc.nextInt();
        System.out.println("num1 : " + num2);

        System.out.println("다시 숫자를 입력해주세요 : ");
        int num3 = sc.nextInt();
        System.out.println("num2 : " + num3);
        System.out.print("공백이 있는 문자열을 하나 입력해주세요 : ");

        sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println("str2 : " + str2);

    }
}
