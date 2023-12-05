package exception.basic;

public class ExceptionTest {

    public void chekcEnoughMoney(int price, int money) throws Exception{

        System.out.println("가지고 계신 돈은 " + money + "원 입니다.");

        if(money >= price) {

            System.out.println("상품을 구입하기 위한 금액이 충분합니다.");

        } else {

            /**
             * 강제로 예외 발생
             * -> 예외를 발생시킨 쪽에서는 throws로 예외에 대한 책임을 위임해서
             * 해당 예외에 대한 처리를 강제화시킨다.
             * */
            throw new Exception(); // Throw new 예외타입
            //이 밑으로는 안감
//			System.out.println(""); // unreachable code
        }
        //throw로 던지게되서 예외로되면 if문 밖으로 탈출하지않음.
        /* 예외가 발생하지 않는 경우에 실행이 된다. */
        System.out.println("즐거운 쇼핑 하세요~~~");

    }
}
