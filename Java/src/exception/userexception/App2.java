package exception.userexception;

import exception.userexception.exception.MoneyNegativeException;
import exception.userexception.exception.PriceNegativeException;

public class App2 {

    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();

        try {
            et.checkEnoughMoney(203000, -30000);
        } catch (PriceNegativeException e) {

            System.out.println("PriceNegativeException 발생!!!");
            System.out.println(e.getMessage());
        } catch (MoneyNegativeException e) {

            System.out.println("MoneyNegativeException 발생!!!");
//            System.out.println(e.getMessage());
        } catch (NotEnoughMoneyException e) {

            System.out.println("NotEnoughMoneyException 발생!!!");
            System.out.println(e.getMessage());
        }finally {

            System.out.println("finally 블럭의 내용이 동작함");

        }

        System.out.println("프로그램을 종료합니다.");
    }
}
