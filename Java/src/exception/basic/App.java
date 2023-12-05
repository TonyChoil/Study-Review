package exception.basic;

public class App {

    public static void main(String[] args) throws Exception {

        //메인에 throws를 올리면, 실핼할 때 처리를 한다. 안 내용에서 처리할 기능을
        //만들어 주지 않았기 때문에, 심각한 오류로 판단해서 오류를 만나면 프로그램이 종료된다.

        ExceptionTest et = new ExceptionTest();

        et.chekcEnoughMoney(1000, 5000);
        /* 예외 발생 구문 이하 구문은 동작하지 않고 되돌아온다.
         * 하지만 메인메소드 또한 예외를 처리하지 않고 위임했다.
         * 따라서 프로그램은 비정상적으로 종료되고 아래 구문은 출력되지 않는다.
         * */

        System.out.println("프로그램을 종료합니다.");

    }
}
