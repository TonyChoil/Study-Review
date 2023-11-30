package api.wrapper;

public class app3 {

    public static void main(String[] args) {

        /* parsing과 반대로 기본자료형 값을 문자열로 변경하는 경우 */
    
    /* valueOf() : 기본자료형 값을 Wrapper클래스 타입으로 변환시키는 메소드
      toString() : 필드값을 문자열로 반환하는 메소드
    * */

        String b = Byte.valueOf((byte) 1).toString();
        String s = Short.valueOf((short) 2).toString();
        String i = Integer.valueOf(4).toString();
        String l = Long.valueOf(8l).toString();
        String f = Float.valueOf(4.0f).toString();
        String d = Double.valueOf(8.0).toString();//8이든 8.0이든 결과값은 8.0으로나옴
        String bl = Boolean.valueOf(true).toString();
        String c = Character.valueOf('a').toString();

        /* String클래스의 valueOf를 사용할 수 있다. */
        String str = String.valueOf(10);
        System.out.println(str);

        /* 문자열 합치기를 이용해 String으로 변환할 수 있다. */
        String str3 = 123 + "";
    }
}
