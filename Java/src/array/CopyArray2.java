package array;

import java.util.Arrays;

public class CopyArray2 {
    public static void main(String[] args) {

        /* 깊은 복사 */
        /*
         * 깊은 복사는 heap에 생성된 배열이 가지고 있는 값을
         * 또 다른 배열에 복사를 해 놓은 것이다.
         *
         * 서로 같은 값을 가지고 있지만, 두 배열은 서로 다른 배열이기에
         * 하나의 배열에 변경을 하더라도 다른 배열에는 영향을 주지 않는다.
         * */

        /***
         * 깊은 복사 하는 방법 4가지
         * 
         * 1. for문을 이용한 동일한 인덱스의 값 복사
         * 2. Object의 clone()을 이용한 복사 (그저 클론)
         * 3. System의 arraycopy()를 이용한 복사 ★성능부분 효율 좋음(두 배열 시작점, 복사 개수 정할 수 있음)
         * 4. Arrays의 copyOf()를 이용한 복사 ★가장 유연 (0번째부터, 내가 생성한 방까지)
         */

        int[] originArr = new int[] {1, 2, 3, 4, 5};

        print(originArr);

        /* 1.for문을 이용한 동일한 인덱스 값 복사 */
        int[] copyArr1 = new int[10];

        for(int i = 0; i < originArr.length; i++){
            copyArr1[i] = originArr[i];
        }

        /* 원본 배열과 복사한 값은 같은 값을 가지고 나머지 인덱스는 다른 값, 다른 주소를 가지고 있다. */
        print(copyArr1);

        /* 2. Object의 clone()을 이용한 복사 */
        int[] copyArr2 = originArr.clone();

        /* 동일한 길이, 동일한 값을 가지는 배여이 생성되어 복사되며, 다른 주소를 가지고 있다. */
        print(copyArr2);

        /* 3. System의 arraycopy()를 이용한 복사 */
        int[] copyArr3 = new int[10];
        /*
         * arraycopy의 각 위치별 사용값
         * 1번째 : 원본배열
         * 2번째 : 복사를 시작할 인덱스
         * 3번째 : 복사본 배열
         * 4번쨰 : 복사를 시작할 인덱스
         * 5번째 : 복사할 길이
         * */
        System.arraycopy(originArr, 0, copyArr3, 3, originArr.length - 1);
        //원본길이보다 길게 복사범위넣으면 에러.
        /* 복사한 만큼의 값은 같지만 길이도 다르고 주소도 다르다. */
        print(copyArr3);


        /* 4. Arrays의 copyOf()를 이용한 복사 */
        int[] copyArr4 = Arrays.copyOf(originArr, 7);
        //7개짜리 방을 만들어서, 원본이랑 새로만든 방의 값 중 작은 수의 길이로
        //0번째 방부터 복사해줌(out of bound 범위 안나게) ->방크기를 얼마로하든 outof bound 안남.

        /* 복사한만큼의 값은 같지만 길이도 다르고 주소도 다르다. */
        print(copyArr4);

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = arr1.clone(); // 깊은 복사

        for(int i = 0; i< arr1.length; i++) {

            arr1[i] += 10;
        }

        for(int i = 0; i < arr1.length; i++) {

            System.out.print(arr1[i] + " ");
        }

        System.out.println();

        /***
         * 향상된 for문 : jdk 1.5 버전부터 추가되었다.
         * 배열 인덱스에 하나씩 차례로 접근해서 담긴 값을 임시로 사용하 변수에 담고 반복문을 실행한다.
         * 조회 만힝 쓰고, 단순 조회용으로는 향상된 for문이 훨씬 빠름
         * (일렬로 줄지어놓고 하나씩 가져오기 때문에)
         *
         * 주의 : 향상된 for문은 배열에 인덱스에 차례로 접근할 때는 편하게 사용할 수 있지만
         * 값을 변경할 수는 없다. 대신 변경하는 것이 아니고 사용하는 것이 목적이라면 조금 더 편하게 사용할 수 있다.
         */

        for(int i : arr2){
        //무한 초기화가 되게 때문에 값을 담는 것이 불가능.
            i += 10;
            System.out.println(i);
        }
    }


    /**
     * 	<pre>
     * 		배열을 매개변수로 전달받아
     * 		모든 인덱스에 저장되어 있는 값을 출력하는 기능을 제공
     * 	</pre>
     * @param iarr 저장된 값을 출력하기 위한 정수 배열ㄴ
     */
    public static void print(int[] iarr) { ///int[] iarr가 이미 매개변수를 선언한 것.

        /* 전달받은 배열의 hashCode 출력 */
        System.out.println("iarr의 hashCode : " + iarr.hashCode());

        /* 전달받은 배열의 값 출력 */
        for(int i = 0; i < iarr.length; i++) {

            System.out.print(iarr[i] + " ");
        }

        System.out.println();
    }

}
