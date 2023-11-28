package class_and_object;

public class Eagersingleton {

    /* 클래스가 최기화되는 시점에서 인스턴스를 생성한다. */
    private static Eagersingleton eager = new Eagersingleton();
    // 새로운 주소값을 생성하는 것과, 기본생성자를 private으로 막아놓고,

    //getInstance로만 통해서 가져오자.
    //거기에 static을 붙여서 eager가 계속 생성되는 게 안리ㅏ 처음 프로그램이 실행될 때 하나만 생성시킴.

    private Eagersingleton(){}
    //EagerSingleton a = new EagerSingleton();를 private으로 막음

    public static Eagersingleton getEager() {
        return eager;
    }
}
