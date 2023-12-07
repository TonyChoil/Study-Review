package colletion.map;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class App2 {

    public static void main(String[] args) {

        /* 설정 파일의 값을 읽어서 어플리케이션에 적용할 때 사용 */
        //보통 설정값을 저장해서 관리
        Properties prop = new Properties();

        prop.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
        prop.setProperty("url", "jdbc:oracle:thin:@127.0.0.1:1521:xe");
        prop.setProperty("user", "student");
        prop.setProperty("password", "student");

        System.out.println(prop);//Map객체 결과랑 똑같이나옴. Map객체타입을 이용해 관리하는중

        try {

            prop.store(new FileOutputStream("driver.dat"), "jdbc driver"); //앞쪽은 파일이름, 뒤에는 주석
            prop.store(new FileWriter("driver.txt"), "jdbc driver"); //앞쪽은 파일이름, 뒤에는 주석# or <comment>
            prop.storeToXML(new FileOutputStream("driver.xml"), "jdbc driver"); //앞쪽은 파일이름, 뒤에는 주석

        } catch (IOException e) {

            e.printStackTrace();
        }

        /* 파일로부터 읽어와서 Properties에 기록 */
        Properties prop2 = new Properties();

        System.out.println(prop2);

        try {
            prop2.load(new FileInputStream("driver.dat"));
            //FileInputStream은 이미지와같은 파일을 읽는 용이고, 문자만 읽어오는건
            //FileReader를 권장함.
            System.out.println();
            prop2.load(new FileReader("driver.txt")); //Map은 뒤에있는 내용으로 덮어쓰기를 하기 때문에
            //뒤에나온 FileReader을 덮어씌워서 가져옴
            /* Properties의 모든 키 값 목록을 대상스트림에 내보내기 한다. */
            prop2.list(System.out);

            System.out.println(prop2.get("driver"));//key값 = "driver"
        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}
