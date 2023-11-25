package method_and_api;

import java.util.Random;

public class Math2 {

    public static void main(String[] args) {

        /* API란?
         *  Application Programming Interface는 응용프로그램에서 사용할 수 있도록
         *  운영체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있도록 만든 인터페이스를
         *  뜻한다.
         *  ->쉽게 얘기해서 우리가 구현할 수 없거나 번거로운 기능을 JDK를 설치하면
         *  사용할 수 있도록 제공해놓은 소스코드들을 의미한다.
         *
         *  ->더 쉽게 말해 누가 작성해놓은 소스코드이니 가져다 쓰는 '방법'을 본다.
         * */
        /* 다른 패키지에 있는 클래스를 사용하는데 예외적으로 java.lang 패키지에 있는
         * 내용은 별도의 import를 하지 않아도 사용할 수 있게 정의되어 있다.
         * */
        /* java.lang.Math2
         *
         * Math클래스는 수학에서 자주 사용하는 상수들과 함수들을 미리 구현해 놓은 클래스.
         * */

        System.out.println("PI 변수 " + Math.PI);
        System.out.println("PI 변수 " + java.lang.Math.PI);

        System.out.println("-7의 절대값 : " + Math.abs(-7));
        System.out.println("10과 20중 더 작은 것은 :" + Math.min(10, 20));
        System.out.println("20과 30중 더 큰 것은 :" + Math.max(20, 30));

        System.out.println("난수 발생 : " + Math.random() );

        /* 난수의 활용
         *
         * Math.random()을 이용해 발생하는 난수는 0.0부터 1.0전까지의 실수 범위의
         * 난수값을 반환한다.
         */

        /* 원하는 범위의 난수를 구하는 공식 */
        /* (int) (Math.random() * 구하려는 난수의 갯수 + 구하려는 난수의 최소값 */
        /* 0 ~ 9까지의 난수 발생 */

        int random1 = (int) (Math.random() * 10);
        System.out.println("0부터 9 사이의 난수 : " + random1);

        /* 10 ~ 15까지의 난수 */
        int random3 = (int)(Math.random() * 6 ) + 10;
        System.out.println("10부터 15사이의 난수 : " + random3);
        //0 <= ? < 6
        /* -128 ~ 127가지의 난수 발생
         * 127 - (-128)
         * 127 + 128 + 1= 256
         * */
        //int random4 = (int ) (Math.random() * 256 ) + ( -128);
        int random4 = (int ) (Math.random() * 256 ) - 128 ;

        System.out.println("-128부터 127까지 난수 발생 : " + random4);

        /* java.util.Random 클래스 */

        /*
         * 원하는 범위의 난수를 구하는 공식
         * radom.nextInt(구하려는 난수의 갯수) + 구하려는 난수의 최소값
         * */
        Random random = new Random();

        int randomNumber1 = random.nextInt(10);
        //즉 0부터 10-1 까지 해줭 = 10개
        System.out.println("0부터 9까지의 난수 : " + randomNumber1);
        /* 1부터 10까지의 난수 발생 */
        int randomNumber2 = random.nextInt(10) + 1;
        System.out.println("1부터 10까지의 난수 : " + randomNumber2);

        /* 20부터 45까지의 난수발생 */
        int randomNumber3 = random.nextInt(26) + 20;
        System.out.println("20부터 45까지의 난수 발생 : " + randomNumber3);

    }
}
