package api.wrapper;

public class app2 {

    public static void main(String[] args) {

        /* parsing : 문자열(String)값을 기본자료형 값으로 변경하는 것을 parsing이라고 한다. */

        byte b = Byte.parseByte("1");
        short s = Short.parseShort("2");
        int i = Integer.parseInt("4");
        long l = Long.parseLong("8"); //8l 이렇게 쓰면 에러남
        float f = Float.parseFloat("4.0"); //"4.0f"는 가능함. 걍 싹다 빼주는게 편할지도
        double d = Double.parseDouble("8.0");
        boolean bl = Boolean.parseBoolean("true"); //true라는 문자열을 boolean타입의 true로 넣어줌
        /* Character는 parsing 기능을 제공하지 않는다. */
        char c = "abc".charAt(0);
    }
}
