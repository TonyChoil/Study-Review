package api.object;

import java.util.HashMap;
import java.util.Map;

public class app {
    public static void main(String[] args) {

        /* Object클래스의 명세에 작g성된 일반 규약에 따르면
         * equals()메소드를 재정의 하는 경우 반드시 hashCode()메소드도 재정의 하도록 되어 있다.
         *
         * 만약 hashCode()를 재정의 하지 않으면 같은 값을 가지는 동등 객체는
         * 같은 해쉬값을 가져야 한다는 규약을 위반하게 된다.
         * but주소값은 다름
         * */
        BookDTO book1 = new BookDTO(1, "홍길동전", "허균", 50000);
        BookDTO book2 = new BookDTO(1, "홍길동전", "허균", 50000);

        System.out.println("book1의 hashCode : " + book1.hashCode());
        System.out.println("book2의 hashCode : " + book2.hashCode());
        System.out.println(book1 == book2);
        System.out.println(book1.equals(book2));


        Map<BookDTO, String> map1 = new HashMap<>();
        map1.put(new BookDTO(1, "홍길동전", "허균", 50000), "selled");
        Map<BookDTO, String> map = new HashMap<>();
        map.put(new BookDTO(1, "홍길동전", "허균", 50000), "selled");
        String str1 = map1.get(map1);
        System.out.println();
        String str = map.get(new BookDTO(1, "홍길동전", "허균", 50000));
	    String str2 = map.get("a");// ->생성자로 생성안해도 보이긴함
        System.out.println(str2); //null

        System.out.println(str);// selled
        System.out.println(str1);
        System.out.println(map);



    }
}
