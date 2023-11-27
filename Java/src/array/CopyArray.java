package array;

public class CopyArray {

    public static void main(String[] args) {
        /* 배열의 복사 */
        /* 배열의 복사에는 크게 두 가지 종류가 있다.

        1. 얕은 복사(shallow copy) : stack의 주소값만 복사
        2. 깊은 복사(deep copy) : heap의 배열에 저장된 값을 복사.
        * */

        int[] originArr = {1, 2, 3, 4, 5};

        int[] copyArr = originArr; //얕은 복사 = 같은 주소값.

        /* 얕은 복사의 활용 */

        /* 얕은 복사를 활용하는 것은 주로 "메소드 호출 시 인자로 사용하는 경우"와
         * "리턴값으로 동일한 배열"을 리턴해주고 싶은 경우 사용한다.
         * */

        String[] names = {"홍길동", "유관순", "이순신"};

        System.out.println("names의 hashCode : " + names.hashCode());

        print(names); //인자값으로 위에 names라는 String[]배열을 넘겨주면,
        //밑에 method에서 처리할 때에도 동일한 주소값을 받아와서 "홍길동", "유관순", "이순신"
        //를 불러옴 !

        String[] a = getAnimals();

        System.out.println("a의 hashCode값 : " + a.hashCode());

        print(a);
    }

    /**
     * <pre>
     *  배열을 매개변수로 전달받아
     *  모든 인덱스에 저장되어 있는 값을 출력하는 기능 제공
     * </pre>
     *
     * @param sarr 저장된 값을 출력하기 위한 문자열 배열
     */
    public static void print(String[] sarr) {

        System.out.println("sarr의 hashCode : " + sarr.hashCode());

        for (int i = 0; i < sarr.length; i++) {

            System.out.print(sarr[i] + " ");
        }

        System.out.println();
    }

    /**
     * <pre>
     * 	동물 종류로 생성된 문자열 배열을 반환하는 메소드
     * </pre>
     *
     * @return
     */
    public static String[] getAnimals() {
        //반환값으로 String배열을 받아오겠습니다. String[]에는 주소값이 들어있음요.
        String[] animals = new String[]{"낙타", "호랑이", "나무늘보"};

        System.out.println("새로 만든 animals의 hasCode : " + animals.hashCode());

        return animals;
    }

}
