package array;

import java.util.Random;
import java.util.Scanner;

public class Array {

    public static void main(String[] args){

    /* 배열이란?
    동일한 자료형의 묶음(연속된 메모리 공간에 값을 저장하고 사용하기 위한 용도)
    배열은 heap 영역에 new 연산자를 이용하여 할당한다.
    * */

        /* 배열의 사용 이유
         * 반약 배열을 사용하지 않는다면 변수를 여러 개 사용해야한다.
         * 1. 연속된 메모리 공간을 관리할 수 없다. (즉 모든 변수의 이름을 사용자가 관리해야 한다.)
         * 2. 반복문을 이용한 연속 처리가 불가능하다.
         */

        /* 하나의 이름으로 관리되는 연속된 메모리 공간이고, 공간마다 찾아갈 수 있는 번호(인덱스)
         * 를 이용해 접근한다.
         *  */
        int[] arr = new int[5];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        for(int i = 0, value = 0; i< arr.length; i++) {
            //string.length(); 는 메소드. arr.length는 ()없음
            arr[i] = value += 10;
        }

        /* 값을 누적 */
        int sum2 = 0;

        sum2 += arr[0];
        sum2 += arr[1];
        sum2 += arr[2];
        sum2 += arr[3];
        sum2 += arr[4];

        System.out.println("sum2 =" + sum2);

        /* 배열의 사용 방법

        배열의 선언

        자료형[] 변수형;
        자료형 변수명[];로 선언할 수 있다.
        * */

        /* 선언은 stack에 배열의 주소를 보관할 수 있는 공간을 만드는 것 */
        int[] iarr;
        char carr[];

        /* new 연산자는 heap 영역에 공간을 할당하고 발생한 주소값을 반환하는 연산자.
        발생한 주소를 레퍼런스 변수(참조형 변수)에 저장하고, 이것을 참조하여 사용하기 때문에
        참조자료형(reference type)이라고 한다.
        * */

        iarr = new int[5];
        carr = new char[10];

        /* 위 선언과 할당을 동시에 할 수도 있다. */
        int[] iarr2 = new int[5];
        char carr2[] = new char[10];


        System.out.println("iarr2 : " + iarr2);
        System.out.println("carr2 : " + carr2);
        //16진수 주소값이 저장되어 있음.

        // hashcode() : 일반적으로 객체의 주소값을 10진수로 변환하여 생성한 객체의 고유한 정수값을
//        반환한다.

        System.out.println("iaar2의 hashCode : " + iarr2.hashCode());
        //1720435669
        System.out.println("caar2의 hashCode : " + carr2.hashCode());
        //662736689

        System.out.println("iarr2의 길이 : " + iarr.length); //5
        System.out.println("carr2의 길이 : " + carr.length); //10

        Scanner sc = new Scanner(System.in);
        System.out.println("할당할 배열의 크기를 입력해주세요. : ");
        int size = sc.nextInt();

        double[] darr = new double[size];
        //여기서 size가 바뀌더라도, 이미 stack 영역에 new 생성자를 통한
        //주소값이 선언이 되었기 때문에 주소값을 불변.

        System.out.println(darr.length);

        System.out.println("darr의 hashCode : " + darr.hashCode());
//391359742 391359742

        /***
         * 한 번 할당된 배열은 지울 수 없다.
         * 다만 레퍼런스변수를 null로 변경하여 더 이상 주소를 참조할 수 없게 된 배열은
         * 시간이 지난 후에 heap의 old영역으로 이동해서 GC가 삭제한다.
         *
         * 한 번 찾아갈 수 있는 주소값을 잃어버린 배열은 다시 참조 불가능하다.
         */

        /* 랜던한 카드를 한 장 뽑아서 출력해보자 */
    String[] shapes = {"SPADE", "CLOVER", "HEART", "DIAMOND"};
    String[] cardNumbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
            "JACK", "QUEEN", "KING", "ACE"};

    int randomShapeIndex = (int) (Math.random() * shapes.length);
    int randomCardNumberIndex = new Random().nextInt(cardNumbers.length);

		System.out.println("당신이 뽑은 카드는 :" + shapes[randomShapeIndex] + " " + cardNumbers[randomCardNumberIndex] + "입니다.");

    }
}
