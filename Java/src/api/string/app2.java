package api.string;

public class app2 {

    public static void main(String[] args) {
        /* 문자열 객체를 만드는 방법
         * "" 리터럴 형태 : 동일한 값을 가지는 인스턴스를 단일 인스턴스로 관리한다.(singleton)
         * new String("문자열") : 매번 새로운 인스턴스를 생성한다.
         * */

        String str1 = "java"; //리터럴값 주소값
        String str2 = "java";
        String str3 = new String("java");
        String str4 = new String("java");

        System.out.println("str1 == str2 : " + (str1 == str2)); //true

        System.out.println("str2 == str3 : " + (str2 == str3));

        System.out.println("str1의 hashCode : " + str1.hashCode());
        System.out.println("str2의 hashCode : " + str2.hashCode());
        System.out.println("str3의 hashCode : " + str3.hashCode());
        System.out.println("str4의 hashCode : " + str4.hashCode());
        /* 하지만 4개의 문자열 모두 동일한 hashCode값을 가진다.
         * 동일한 문자열은 동일한 hashCode 값을 반환하도록 이미 재정의가 되어 있기 때문이다.
         * */

        System.out.println("str1의 찐hashCode : " + System.identityHashCode(str1.hashCode()));
        System.out.println("str2의 찐hashCode : " + System.identityHashCode(str2.hashCode()));
        System.out.println("str3의 찐hashCode : " + System.identityHashCode(str3.hashCode()));
        //찐 해쉬코드값 보기

        /* equals() : String클래스의 equals()메소드는 인스턴스 비교가 아닌 문자열값을
         * 			  비교하여 동일한 값을 가지는 경우 true, 다른 값을 가지는 경우 false를
         * 			  반환하도록 Object의 equals()메소드를 재정의 해두었다.
         *
         * 		       따라서 문자열 인스턴스 생성 방식과 상관없이 동일한 문자열인지를 비교하기 위해
         * 				== 연산대신 equals() 메소드를 사용해야한다.
         * */
        /* new java.util.Scanner(System.in).nextLine(); 을 이용해 문자열을 입력받은 경우
         * subString으로 잘라내기해서 새로운 문자열을 생성 후에 반환하기 때문에
         * 이 때 new String()으로 인스턴스를 생성한 것과 동일한 것으로 볼 수 있다.
         *
         * 따라서 Scanner로 입력받은 문자열을 비교할 때는 equals()를 사용해야한다.
         * */
    }
}
