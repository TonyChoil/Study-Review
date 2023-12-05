package exception.userexception;

import exception.userexception.exception.MoneyNegativeException;
import exception.userexception.exception.PriceNegativeException;

public class App1 {

    public static void main(String[] args) throws PriceNegativeException, MoneyNegativeException, NotEnoughMoneyException {

        /* 사전에 정의되어 있는 Exception의 종류는 굉장히 많이 있다.
         * 하지만 RuntimeException의 후손 대부분은 예외처리를 강제화 하지 않는다.
         * 왜냐하면 간단한 조건문등으로 처리가 가능하기 때문에 따로 강제화 하지 않았다.
         * */

        /* 사전에 정의된 예외클래스 외에 개발자가 원하는 명칭의 예외클래스를 작성하는 것이 가능하다.
         * extends Exception으로 예외처리 클래스를 상속받아 더 구체적인 예외 이름을 정의하는 것이다.
         * */

        ExceptionTest et = new ExceptionTest();

        /* 정상적인 프로그램의 흐름을 만들기 위해서 try-catch 블럭을 작성하는 것이 좋다. */
        try {

            et.checkEnoughMoney(50000, -30000);
            //여기서 오류가 발생하면, 밑으로 안내려가고 바로 catch블록으로 넘어가버림.
            //그리고 try catch밖으로 빠져나가서 또 쭉 내려감
            et.checkEnoughMoney(30000, 50000);

        } catch (Exception e) {

            e.printStackTrace();
        } finally {


        }
    }
}
