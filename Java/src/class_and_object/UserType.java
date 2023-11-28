package class_and_object;

public class UserType {
    public static void main(String[] args) {
        /* 사용자 정의 자료형 사용하기 */
        /* 1. 변수 선언 및 객체 생성 */
        /* 자료형 변수명 = new 클래스명();　<-- 이 구문은 객체(instance)를 생성하는 구문 */

        /* 사용자 정이의 자료형인 클래스를 이용하기 위해서는 new연산자로 heap에 할당을 해야한다.
         * 객체를 생성하게 되면 클래스에 정의한 필드와 메소드 대로 객체(instance)가 생성된다.
         * 그리고 이 인스턴스들을 모아놓은 주소값을 할당.
         * 인터스턴스는 클래스에 작성한 순서대로 생성.
         * (heap)에 생성되기 때문에 jvm 기본값으로 초기화된다.
         * */

        Member member = new Member();

        System.out.println("member.id :" + member.id);

        member.id = "user01";
        member.pwd = "pass01";
        member.name = "홍길동";
        member.age = 20;
        member.gender = '남';
        member.hobby = new String[] { "축구", " 볼링", "테니스"};

        System.out.println(member.id);
    }

}

