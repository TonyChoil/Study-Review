package exception.uses;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {

    public static void main(String[] args) {

        /* try-with-resource
         *
         * JDK 1.7에서 추가된 문법이다.
         *
         * close해야하는 인스턴스의 경우 try옆에 괄호안에서 생성하면
         * 해당 try-catch블럭이 완료될 때 자동으로 close처리 해준다.
         * */

        try(BufferedReader in = new BufferedReader(new FileReader("test.dat"));){

            String s;

            while ((s = in.readLine())!= null) {
                System.out.println(s);

            }
        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}
