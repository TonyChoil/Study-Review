package class_and_object;

public class Static {

    /* static키워드와 final키워드에 대해 알아본다 */

    /* static : 정적 메모리 영역에 프로그램이 start될 떄 할당을 하는 키워드이다.
     * 			인스턴스를 생성하지 않고도 사용할 클래스의 멤버(필드, 메소드)에 지정할 수 있다.
     * 			여러 인스턴스가 공유해서 사용할 목적의 공간이다.
     * 			하지만 static 키워드의 남발은 유지보수와 추적이 힘든 코드를 작성하게되는, 피해야할 방식이다.
     * 			명확한 목적이 존재하지 않는 이상 static 키워드 사용은 자제한다.
     * 			의도적으로 static 키워드를 사용하는 대표적인 예는 singleton 객체를 생성할 때이다.
     *          Member member1 = new Member;
     *          Member member2 = new Member;
     *          Member member3 = new Member;
     *          member1,2,3 모두 같은 주소를 쓰겠다.
     *
     * 		 * final : final은 중단의 의미를 가지는 키워드이다.
     * 	       final 키워드를 사용할 수 있는 위치는 다양한 편이며 의미가 약간은 다르지만,
     * 		  결국 변경 불가의 의미이다.
     * 		  1.지역변수 : 초기화 이후 값 변경 불가
     * 		  2.매개변수 : 호출 시 전달한 인자 변경 불가
     * 		  3.전역변수 : 인스턴스 생성 후 초기화 이후에 값 변경 불가
     * 		  4.클래스(static) 변수 : 프로그램 start 이후 값 변경 불가
     * 		  5.non-static 메소드 : 메소드 재작성(overriding)불가
     * 		  6.static메소드 : 메소드 재작성(overriding) 불가
     * 	      7.클래스 : 상속불가
     * */
}
