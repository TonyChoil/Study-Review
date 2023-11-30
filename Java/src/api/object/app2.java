package api.object;

public class app2 {

    public static void main(String[] args){

        /* 모든 클래스가 object 클래스의 후손이다.

        따라서 Object 클래스가 가진 메소드를 자신의 것처럼 사용할 수 있다.
        또한 부모 클래스가 가지는 메소드를 오버라이딩해서 사용하는 것도 가능하다.

        대표적으로 많이 사용하는 메소드 toString(), equals(), hashCode()이다.


        * */

        /* equals() 메소드 오버라이딩
         *
         * equals 메소드는 매개변수로 전달받은 인스턴스와 == 연산하여 true or false를 반환한다.
         * 즉, 동일한 인스턴스인지를 비교하는 기능을 한다.
         *
         * 동일객체와 동등객체
         * 동일객체 : 주소가 동일한 인스턴스를 동일객체라고 한다.
         * 동등객체 : 주소는 다르더라도 필드값이 동일한 객체 동등객체
         *
         * equals() 메소드의 기본 기능은 동일객체 판단을 한다(동일성확인)
         * */

        BookDTO book1 = new BookDTO(1, "홍길동전", "허균", 50000);
        BookDTO book2 = new BookDTO(1, "홍길동전", "허균", 50000);

        System.out.println("두 인스턴스의 == 연산 비교 : " + (book1 == book2));
        //주소값비교
        System.out.println("두 인스턴스의 equals() 비교 : " + (book1.equals(book2)));
        //위에거랑 똑같은 얘기임.
    }
}
