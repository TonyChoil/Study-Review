package exception.userexception;

import exception.userexception.exception.MoneyNegativeException;
import exception.userexception.exception.PriceNegativeException;

public class App3 {

    /* multi-catch
     *
     * JDK 1.7에서 추가된 구문으로
     * "동일한 레벨"의 다른 타입의 예외를 하나의 catch블럭으로 다룰 수 있다.
     * */

    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();

        try {
            et.checkEnoughMoney(50000, 10000);
        } catch (NotEnoughMoneyException e) {
            /* 예외클래스명, 예외발생위치, 예외메시지 등을 stack 호출 '역순'으로
             * 빨산색 글씨를 이용해서 로그 형태로 출력해주는 기능
             * */
            e.printStackTrace();
        } catch(PriceNegativeException | MoneyNegativeException e) {

            System.out.println(e.getMessage()); //발생한 예외 메시지를 전달
            System.out.println(e.getClass()); //발생한 예외클래스의 이름을 전달
        }finally {

            System.out.println("finally 블럭의 내용이 동작함");
        }

        System.out.println("프로그램을 종료합니다.");


    }

}
