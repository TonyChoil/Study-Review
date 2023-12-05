package exception.uses;

import java.io.*;

public class App2 {

    public static void main(String[] args){

        BufferedReader in = null;
		/*try블록 밖에 생성을 해줘야
		1. try구문이 끝나도 catch나 in.close()를 해줄 수 있는 것임.
		2. 위에 한번에 BufferedReader in = new BufferedReader(new FileReader("test.dat"));
		   로 해주면 try catch구문이 또 나와야됨
		*/
        try {

            in = new BufferedReader(new FileReader("test.dat"));

            String s;

            while((s = in.readLine()) != null) {

                System.out.println(s);
            }
            /* 같은 레벨의 Exception은 |를 통해 같이사용가능 */
        } catch (FileNotFoundException | EOFException e) {

            e.printStackTrace();
        } catch (IOException e) {

            /* catch블럭은 여러개를 작성할 시 상위 타입이 하단에 오고 후손 타입이 먼저 작성되어야 한다. */
            e.printStackTrace();
        }finally { //정상동작을하던, 오류가 나던 사용해주는 문장

            try {
                if(in != null) {
                    in.close();
                }
            } catch (IOException e) {

                e.printStackTrace();
            }
        }
    }

}