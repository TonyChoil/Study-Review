package literal_and_variable;

public class variable {

    public static void main(String[] args){
        byte bnum; // 1byte
        short snum; // 2byte
        int inum; // 4byte
        long lnum; // 8byte

        float fnum; //4byte
        double dnum; //8byte

        char ch; //2byte
        char ch1; //2byte

        boolean isTrue; // 1byte

        String str; // 4byte(엄밀이 얘기하면 주소값은 4byte이다.)

        lnum = 8L;

        fnum = 4.0f;
        dnum = 8.0;

        ch = 'a';
        System.out.println(ch); // a  'a'아님
        ch1 = 97; // a 출력

        /*
         * 변수의 사용 목적
         * 1. 값에 의미를 부여하기 위한 목적(의미 전달이 쉬워야  코드를 읽기 쉬워지고,
         * 협업 및 유지보수에 유리하기 때문)
         * 2. 한 번 저장해둔 값을 재사용 하기 위한 목적
         * (변수를 이용하여 코드를 작성하면, 값을 변경할 때도 보다 간편하게 변경할 수 있다.)
         * 3. 시간에 따라 변하는 값을 저장하고 사용할 수 있다.
         * (변하는 값을 저장하기 위한 공간이다.)
         */

        int point = 100;
        System.out.println("1번 고객에게 포인트를" + point + "포인트 지급하였습니다.");
        System.out.println("2번 고객에게 포인트를" + point + "포인트 지급하였습니다.");
        System.out.println("3번 고객에게 포인트를\" + point + \"포인트 지급하였습니다.");
        //-> 3번 고객에게 포인트를" + point + "포인트 지급하였습니다.
        //\"+ point + "\ 여기서 \는 이스케이프 문자라고 함. "" 안에 ""가 올수가 없기 때문에
        //" + point + "를 " " 문장 안에 붙여넣기를 하면 "를 문자로 인식하라고 \를 붙여줌.

        /* 1.동일한 범위 내에서 동일한 변수명을 가질 수 없다. */
        int age = 20;
//        int age = 30;

        /* 1-2. 예약어는 사용이 불가능하다. */
//		int true = 1; // 예약어 사용 불가

        /* 1-3. 변수명은 대소문자를 구분한다. */
        int True = 10; //근데 변수명 첫글자 대문자쓰면안됨
        int Age = 20;

        /* 1-4. 특수기호는 '_' 와 '&'만 사용 가능하다. */
        //int sh@rp = 20; // 불가능
        int _a_g_e_ = 20;
        int $harp = 20;

        /* 2-8. boolean 형은 의문문으로 가급적 긍정형태로 네이밍한다. */
        boolean isAlive = true;

        boolean isDead = false; //부정형보다는 긍정형이 더 나은 방식임

    }
}
