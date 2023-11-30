package api.stringbuilder;

public class app2 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("java");
        StringBuilder sb1 = new StringBuilder("java");

        System.out.println("sb : " + sb);  //StringBuilder는 toString이 재정의 되어있어서
        //주소값대신 실값이 나옴

        /* hashCode는 오버라이딩 되어 있지 않다.
         * 즉, 동일한 값을 가지는 경우 같은 해쉬코드를 반환하는 것이 아니라,
         * 인스턴스가 동일해야 같은 해쉬코드를 반환한다.
         * */

        System.out.println("sb의 hashCode : " + sb.hashCode());
        System.out.println("sb1의 hashCode : " + sb1.hashCode());

        /* 문자열 수정 */
        sb.append("oracle");

        System.out.println("sb : " + sb);
        System.out.println("sb의 hashCode : " + sb.hashCode());
        //문자열이 바뀌어도 hashCode/주소값 안달라짐
    }
}
