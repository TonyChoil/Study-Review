package class_and_object;


public class StaticMethodTest {

    private int count;

    public void nonStaticMethod() {

        this.count++;

        System.out.println("nonStaticMethod 호출됨...");
    }

    public static void staticMethod() {

        //this.count++; 둘다 사용못함 -> 왜? count는 인스턴스변수로, 생성자를 통해 공간을 만들 때 생성되는데,
        //static은 시작부터 생성되니깐 같이 만들수가 없음. 걍 당연한거
//        count++;
        System.out.println("staticMethod 호출됨...");
    }

}