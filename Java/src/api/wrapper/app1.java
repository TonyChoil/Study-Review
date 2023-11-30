package api.wrapper;

public class app1 {

    public static void main(String[] args) {
        /* Wrapper 클래스

        상황에 따라 기본 타입의 데이터를 인스턴스화 해야 하는 경우들이 발생한다.
        이 때 기본타입의 데이터를 먼저 인스턴스로 변환 후 사용해야 하는데
        8가지에 해당하는 기본타입의 데이터를 인스턴스화 할 수 있도록 하는 클래스를
        레퍼클래스(Wrapper class)라고 한다.
        * */

        /* 박싱(Boxing)과 언박싱(UnBoxing)

        기본 타입을 래퍼클래스의 인스턴스로 인스턴스화 하는 것을 박싱(Boxing)이라고 하며
        래퍼클래스 타입의 인스턴스를 기본타입으로 변경하는 것을 언박싱(Unboxing)이라고 한다.
        * */

        int intValue = 20;

        Integer boxingNumber2 = Integer.valueOf(intValue); // static 메소드 이용

        /* 오토 박싱(AutoBoxing)과 오토 언박싱 */

        Integer boxingNumber = intValue;

        int unBoxingNumer2 = boxingNumber;

        int inum = 20;
        Integer integerNum1 = Integer.valueOf(20);
        Integer integerNum2 = Integer.valueOf(20);
        Integer integerNum3 = 20;
        Integer integerNum4 = 20;
        System.out.println("int와 Integer 비교 : " + (inum == integerNum1));
        System.out.println("int와 Integer 비교 : " + (inum == integerNum3)); //true
    }
}
