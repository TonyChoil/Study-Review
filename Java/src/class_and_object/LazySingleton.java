package class_and_object;

public class LazySingleton {
    /** 싱글톤 패턴은 생성자 호출을 통해 외부에서 인스턴스를 생성하는 것을 제한한다.
     * 프로그램 실행할 때 싱글톤 변수를 선언하지 않고, 내가 원하는 시점에 하려고 할 때
     * 클래스가 초기화되는 시점에서는 정적 필드를 선언해두고 null로 초기화한다.
     * */

    private static LazySingleton lazy;

    private LazySingleton(){}

    public static LazySingleton getLazy() {

        /* 인스턴스를 생성한 적이 없는 경우 인스턴스를 생성해서 반환하고
        생성한 인스턴스가 있는경우 만들어준 인스턴스르 반환한다.
        호출하고 나면 이 때 주소값을 할당하고 초기화한 이후에 조건절을 통해서 두번다시
        변경하지 못하게 한다.
        * */
        if(lazy == null){
            lazy = new LazySingleton();
        }

        return lazy;
    }
}
