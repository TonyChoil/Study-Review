package class_and_object;

import java.util.Date;

public class User {

    /* 생성자 작성 위치
    작성위치는 문법상으로 클래스 내부에 작성하면 됟지만,
    통상적으로는 필드선언부와 메소드선언부 사이에 작성하는 것이 관례이다.

    생성자의 사용 목적
    	/* 생성자의 사용 목적
	 * 1.인스턴스 생성 시점에 수행할 명령이 있는 경우 사용한다.
	 * 2.매개변수 있는 생성자의 경우 매개변수로 전달받은 값으로 필드를 초기화하며 인스턴스를 생성할 목적으로 주로 사용된다.
	 * 3.작성한 생성자 외에는 인스턴스를 생성하는 방법을 제공하지 않겠다는 의미를 가진다.
	 *   따라서, 인스턴스를 생성하는 방법을 제한하기 위한 용도로 사용할 수도 있다.(초기값 전달 강제화)
	 *
	 *   ex) Scanner();의 경우 Scanner(System.in)이라는 매개변수를 전달해줘야만 만들어진다.
	 * */

    /*
     * 생성자 작성 방법
     * [표현식]
     * 접근제한자 클래스명(매개변수){
     * 		인스턴스 생성 시점에 수행할 명령 기술(주로 필드를 초기화)
     *      this.필드명 = 매개변수;
     * }
     *
     * 생성자 작성 방법은 메소드를 작성하는 방법과 유사하다. 하지만 두 가지 사항을 조심해야한다.
     * 1. 생성자메소드는 반드시 클래스의 이름과 동일해야한다.(대/소문자까지 같아야한다.)
     * 2. 생성자메소드는 반환형을 작성하지 않는다.(작성하는 경우 생성자가 아닌 메소드로 인식한다.)
     * */

    /* 매개변수 있는 생성자
     * 초기화할 필드가 여러 개인 경우, 초기화하고 싶은 필드의 개수별로 생성자를 여러개 준비해 둘 수 있다.
     */

    private String id;
    private String pwd;
    private String name;
    private Date enrollDate;

    /* 기본생성자(default constructor) */
    public User() {

        System.out.println("User 클래스의 기본 생성자 호출함...");
    }

    public User(String id, String pwd, String name) {

        this.id = id;
        this.pwd = pwd;
        this.name = name;

        System.out.println("User 클래스의 id, pwd, name을 초기화하는 생성자 호출함...");

    }


    public User(String id, String pwd, String name, Date enrollDate) {

        /* this()메소드는 중복되는 초기화 내용이 발생되면 이 중복된 내용을 줄여서 작성할 수 있다.
         * 동일 클래스 내에 작성한 다른 생성자 메소드를 호출하는 거이고, 괄호안에 매개변수의
         * 타입, 갯수, 순서에 맞는 생성자를 호출하고 복귀한다.
         *
         * 리턴되어 돌아오지만 리턴값은 존재하지 않는다.
         * this()는 가장 첫줄에 선언해야하며, 그렇지 않은 경우 Compile Error가 발생한다.
         *
         */

        this(id, pwd, name); //매개변수값이 같고, 개수가 같은 메소드를 불러옴 즉. 여기서는 바로 위에 "메소드호출"
        this.enrollDate = enrollDate; //이건 정의아직안해줬으니깐 새로해줌.
        System.out.println("4개다초기화하는 생성자 호출");

    }

    public User(User otherUser) {

        this.id = otherUser.id; //여기서 this.는 이 생성자로 생성한 참조변수의 인스턴스값
        this.pwd = otherUser.pwd; // otherUser.pwd는 복사해오는
        this.name = otherUser.name;
        this.enrollDate = otherUser.enrollDate;

        System.out.println("User 클래스의 복사생성자 호출함...");

        System.out.println("this의 hashCode : " + this.hashCode());
        System.out.println("otherUser의 hashCode : " + otherUser.hashCode());
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", enrollDate=" + enrollDate +
                '}';
    }
}
