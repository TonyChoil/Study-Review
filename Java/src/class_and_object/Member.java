package class_and_object;

public class Member {

    /* 클래스 내부에는 메소드를 작성하지 않고 바로 변수를 선언할 수도 있다.
     * 이것을 전역변수(필드 == 인스턴스변수 = 속성)라고 부른다.
     * */
    
    /* 접근 제한자
    
    클래스 혹은 클래스의 멤버에 참조연산자로 접근할 수 있는 범위를 제한하기 위한 키워드.
    
    1. public : 모든 패키지에 접근 허용
    2. protected : 동일 패키지에 접근 허용. 단, 상속관계에 있는 경우 다른 패키지에서도 접근 가능
    3. default : 동일 패키지에서만 접근 허용(작성하지 않으면 default)
    4. private : 해당 클래스 내부에서만 접근 허용

    위의 네가지 접근제한자는 클래스의 멤버(필드, 메소드)에 모두 사용 가능하다.
    단, 클래스 선언 시 사용하는 접근제한자는 public과 default만 사용가능하다.
    * */

    String id;
    String pwd;
    String name;
    int age;
    char gender;
    String[] hobby;



}
