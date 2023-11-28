package class_and_object;

import java.util.Date;

public class UserDTO {

    /* 자바빈(Java Bean)이란?
    JSP..에서 배우게 될 표준 액션 태그로 접근할 수 잇는 자바클래스이다.
    자바 코드를 모르는 웹 퍼블리셔들도 자바코드를 사용할 수 있도록 태그 형식으로
    지원하는 문법을 의미하고 규칙을 정해놓은 것을 자바빈이라고 한다.
    	 * 자바빈 작성규칙
	 * 1. 자바빈은 특정 패키지에 속해있어야 한다.(default '패키지' 사용 금지)
	 * 2. 멤버변수의 접근제어자는 private으로 선언해야한다.
	 * 3. 기본생성자가 명시적으로 존재해야한다. (매개변수 있는 생성자는 선택사항)
	 * 4. 멤버변수에 접근가능한 설정자(setter)와 접근자가(getter)가
	 *  	public으로 작성되어 있어야 한다.
	 * 5. 직렬화(Serializeable 구현)이 되어야 한다.(선택사항) 줄을 세우는 것
	 * */

    //그래서 DTO클래스는 필드변수 선언하고, 생성자생성하고, getter, setter 만들어주면 끝!
    private String id;
    private String pwd;
    private String name;
    private Date enrollDate;


    //기본생성자
    public UserDTO() {

    }


    //매개변수가 있는 생성자
    public UserDTO(String id, String pwd, String name, Date enrollDate) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.enrollDate = enrollDate;
    }



    /* getter / setter */

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(Date enrollDate) {
        this.enrollDate = enrollDate;
    }

    public String getInformation() {

        return "UserDTO id = " + this.id + ", pwd = " + this.pwd +
                ", name = " + this.name + ", enrollDate = " + this.enrollDate;
    }


}
