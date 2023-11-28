package class_and_object;

public class app2 {
    public static void main(String[] args) {

        /* 메소드의 파라미터 선언부에는 다양한 종류의 값을 인자로 전달하여 호출할 수 있다.
         *
         * 매개변수(parameter)로 사용 가능한 자료형
         * 1. 기본자료형 8가지(char, byte, short, int, long, float, double, boolean)
         * 2. 기본자료형 배열
         * 3. 클래스자료형 Member
         * 4. 클래스자료형 배열
         * 5. 가변인자 ...
         * */

        ParameterTest pt = new ParameterTest();
        String[] a = {"볼링", "농구", "바보"};

        pt.testVariableLengthArrayParameter("홍길동");
    }
}
