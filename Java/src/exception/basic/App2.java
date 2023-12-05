package exception.basic;

public class App2 {

    public static void main(String[] args) {

        /* try-catch를 이용한 방법 */

        ExceptionTest et = new ExceptionTest();

        try{
            et.chekcEnoughMoney(10000, 5000);
            System.out.println("===========상품 구입 가능 ===========");
            //예외발생안하면 여기까지 옴. catch는 안감
        } catch (Exception e){

            System.out.println("===========상품 구입 불가 =============");
            //예외발생할경우 catch{ }처리
        }
        System.out.println("프로그램을 종료합니다.");//try-catch로하면 더 밑으로 내려옴

    }


}
