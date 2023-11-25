package literal_and_variable;

public class overflow {

    public static void main(String[] args){


        /**
         * 오버플로우
         *
         * 자료형 별 값의 최대를 벗어나는 경우
         * 발생한 carry를 버림처리하고 sign bit를 반전시켜 최소합으로 순환시킨다.
         */
        // -128  ~ 127 범위를 가지고 있음.
        byte num1 = 127;
        System.out.println("num1 : " + num1);
        num1++;
        num1++;
        num1++;
        System.out.println("num1 : " + num1); // -127 -126

        /*
         * 언더플로우
         * 오버플로우와 반대 개념으로 최소 범위보다 작은 수를 발생시키는 경우 발생하는 현상이다.
         */

        byte num2 = -128;

        System.out.println("num2 : " + num2);
        num2--;
        num2--;
        num2--;

        System.out.println("num2 underflow : " + num2); //127 126 125

        /*int형의 최대값은 대략 21억 정도 */
        int firstNum = 1000000;
        int secondNum = 700000;
        int multi = firstNum * secondNum;

        System.out.println("firstNum * secondNum = " + multi);
        //firstNum * secondNum = -79669248 (언더플로우 발생)

        /*
         * 이런 현상이 발생해도 그냥 넘기는 경우가 발생할 수 있다.
         * 이런 경우를 *논리적 에러*라고 표현함. (디버깅 시 가장 힘든 이유 중 한가지)
         */

        /* 해결 방법 */
        /* 오버플로우를 예측하고 더 큰 자료형으로 결과값을 받아서 처리 */
        long longmulti = firstNum * secondNum;
        //firstNum * secondNum 의 결과도 int 로 나오기 때문에 결국 오버플로 발생한 값을 long에 담는 것.

        System.out.println("longMulti : " + longmulti); //그래도 오버플로 발생함

        long longMulti2 = (long) firstNum * secondNum; //cast연산자를 통해 강제형변환

        System.out.println("longMulti2 : " + longMulti2);
    }
}
