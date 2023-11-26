package literal_and_variable;

public class typecasting {

    public static void main(String[] args){

        /*
        형변환의 종류와 규칙
        자동형변환(묵시적 형변환) : 컴파일러가 자동으로 수행해주는 타입 변환
        1-1. 작은 자료형에서 큰 자료형으로는 자동 형변환이 된다.
        1-2. 정수는 실수로 자동 형변환 된다.
        1.3 문자형은 int형으로 자동 형변환 된다.
        2. 강제 형변환(명시적 형변환) : 형변환(cast)연산자를 이용한 강제적으로 수행하는 형변환
         *   2-1. 자동형변환이 적용되지 않는 경우 강제 형변환이 필요하다.
        */

        /*
         * 작은 자료형에서 큰 자료형으로 공간만 옮기는 경우 데이터 손실이 발생하지 않기 때문에
         * 컴파일러가 자동으로 처리해준다.
         * */
        byte bnum1 = 1; //1byte
        short snum1 = bnum1; //2byte
        int inum1 = snum1; //4byte
        long lnum1 = inum1; //8byte

        /* 연산 시에도 자동으로 큰 쪽 자료형에 맞춰서 계산한다. */
        int num1 = 10;
        long num2 = 20;

        long result = num1 + num2; //long 으로 바뀜
        System.out.println(result);

        //실수 끼리의 자동 형변환
        float fnum = 4.0f;
        double dnum = fnum; //float 가 double 로 자동 변환

        // float result2 = fnum + dnum;  오류
        double result2 = fnum + dnum;

        System.out.println("result2 : " + result2); // 8.0


        long seven = 9999;
        System.out.println("seven : " + seven);
        //double의 경우 8.0식으로 표현되지만, long의 경우 출력값에 l이 굳이 붙지 않는다.(당연)

        char ch1 = 'a';
        int charNumber = ch1;

        System.out.println("charNumber : " + charNumber);
        //즉 문자를 정수형에 넣게되면 정수로 자동 형변환

        char ch2 = 65;
        System.out.println("ch2 : " + ch2);
        //문자 타입에 숫자를 넣으면 문자로 자동 형변환 (아스킷코드기반)

        /*
         * 1. 강제 형변환 규칙
         *  1-1. 큰 자료형에서 작은 자료형으로 변경 시 강제 형변환이 필요하다.
         *  1-2. 실수를 정수로 변경 시 강제 형변환이 필요하다.
         *  1-3. 문자형을 int미만 크기의 변수에 저장할 때 강제 형변환이 필요하다.
         *  1-4. 논리형은 강제 형변환 규칙에서도 제외된다.
         */

        short sh1;
        char ch3 = 65;

		/*sh1 = ch1; char를 short로 넣어주고싶은데 오류남.
		왜? char도 2byte고 short도 2byte인데,
		short는 -32768 ~ 32767 이고 char은 0~65535 이기 때문에
		서로 용기가 범위가 달라서 불가능.
		*/

        long lnum = 8;
        //int inum = lnum; 에러. 큰용기 ->작은 용기는 강제형변환 필요

        System.out.println(ch3);


        /* 실수를 정수로 변경 시 강제 형변환이 필요하다. */
        float fnum2 = 4.0f;
        //long lnum2 = fnum2; // float 4byte, long 8byte임에도 자동형변환 불가능
        //소수점 자리 이하 데이터 손실 가능성)

        long lnum2 = (long) fnum2; //소숫점을 버려도되니까 실수를 정수로 형변환해주세용
        //강제 형변환 의미는 내가 데이터 손실을 감안할테니 형변환 해줘~'라는 의미


        /* 다른 자료형 끼리 연산은 큰 자료형으로 자동 형변환 후 연산 처리 된다.*/
        int inum = 10;
        long lnum3 = 100;

        int isum = (int) (inum + lnum3);
        //연산 후 결과값 바꿔주기
        System.out.println(isum);

        long isum2 = inum + lnum;
        //그냥 용기 자체를 long으로 늘리기
        System.out.println(isum2);

        /* 형변환 사용 시 주의할 점 */
        /* 1. 의도하지 않은 데이터 손실 */
        int inum4 = 290;
        byte bnum = (byte) inum;
        System.out.println("inum : " + inum4); //290
        System.out.println("bnum : " + bnum); // 34. 앞쪽 bit부분 날라감

        /* 2. 의도한 데이터 손실 */
        double height = 175.5;
        int floorHeight = (int) height;

        System.out.println("height : " + height); //175.5
        System.out.println("floorheight : " + floorHeight); //175

    }
}
