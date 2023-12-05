package colletion.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class App1 {

    public static void main(String[] args) {

        /* 컬렉션 프레임워크(Collection Framework)
         * 자바에서 컬렉션 프레임워크는 여러 개의 다양한 데이터를 쉽고 효과적으로 처리할 수 있도록
         * 표준화된 방법을 제공하는 클래스들의 집합이다.
         * -> 데이터를 효율적으로 저장하는 자료구조와 데이터를 처리하는 알고리즘을 미리 구현해놓은 클래스이다.
         * */

        /*
         * Collection Framework는 크게 3가지 인터페이스 중 한가지를 상속받아 구현해놓았다.
         * 1.List 인터페이스
         * 2.Set 인터페이스
         * 3.Map 인터페이스
         *
         * List 인터페이스와 Set 인터페이스의 공통부분을 Collection인터페이스에서 정의하고 있다.
         * 하지만 Map은 구조상의 차이라 Collection 인터페이스에서 정의하고 있지 않다.
         * ->인터페이스의 자식은 모든 메소드를 받아야함
         */

        /* List계열
         * List 인터페이스를 구현한 모든 클래스는 요소의 저장 순서가 유지되며, 중복 저장을 허용한다.
         * ArrayList, LinkedList, Vector, Stack 등이 있다.
         * */

        /* ArrayList
         * 가장 많이 사용되는 컬렉션 클래스이다.
         * 내부적으로 배열을 이용하여 요소를 관리하며, 인덱스를 이용해 배열 요소에 빠르게 접근할 수 있다.
         * */

        /* ArrayList인스턴스를 생성하게 되면 내부적으로 10칸짜리 배열을 생성해서 관리한다. */
        ArrayList alist = new ArrayList();

        /* 다형성을 적용하여 상위 레퍼런스로 ArrayList객체를 만들수도 있다. */
        /*
         * List 인터페이스 하위의 다양한 구현체들로 타입 변경이 가능하기 때문에
         * 레퍼런스 타입은 List로 해두는 것이 더 유연한 코드를 작성하는 것이다.
         * */
        List list = new ArrayList();

        Collection clist = new ArrayList();

        /* ArrayList는 저장 순서가 유지되며 index(순번)이 적용된다.
         * */
        alist.add("apple");
        alist.add(123); //autoBoxing 처리됨 int -> Integer
        alist.add(45.877);
        alist.add(new Date());
        System.out.println(alist.get(3) instanceof Double);
        /* toString() 오버라이딩되어있다. */
        System.out.println(alist); //[1, w]
        System.out.println(alist.get(0) instanceof String);

        System.out.println(alist.toString());

        /* ArrayList의 크기는 size()메소드로 확인할 수 있다.
         * 단, size()메소드는 배열의 크기가 아닌 요소의 개수를 반환한다.
         * -> 내부적으로 관리되는 배열의 사이즈는 외부에서 알 필요가 없기 때문에 기능을 제공하지 않는다. (length없음)
         * */

        System.out.println(alist.size()); //4

        for(int i = 0; i < alist.size(); i++) {

            System.out.println(alist.get(i));
        }

        /* 데이터의 중복 저장을 허용한다
         * 배열과 같이 인덱스로 요소들을 관리하기 때문에 인덱스가 다른 위치에 동일한 값을 저장하는 것이 가능하다.
         * */
        alist.add("apple");

        System.out.println("alist : " + alist);

        /* 원하는 인덱스 위치에 값을 추가할 수도 있다.
         * 값을 중간에 추가하는 경우 인덱스 위치에 덮어쓰는 것이 아니고
         * 새로운 값이 들어가는 인덱스 위치에 값을 넣고 이후 인덱스 하나씩 뒤로 밀리게된다.
         *
         * */
        alist.add(1, "banana"); //삽입할 인덱스, 값
        System.out.println("alist : " + alist);

        /* 저장된 값을 삭제할 때는 remove() 메소드를 사용한다.
         *
         * 중간 인덱스 값을 삭제하는 경우 자동으로 인덱스를 하나씩 앞으로 당긴다.
         * */
        alist.remove(1);

        System.out.println("alist : " + alist);

        /* 지정된 위치의 값을 수정할 때 인덱스를 활용할 수 있다. */
        alist.set(1, true); //Boolean타입으로 들어가유
        System.out.println("alist : " + alist);
        System.out.println(alist.get(1) instanceof Boolean);

        List<String> stringList = new ArrayList<>();
//		stringList.add(123); 제네릭 타입으로 지정하면 지정한 타입 외의 인스턴스는 저장하지 못한다.
        stringList.add("banana");
        stringList.add("orange");
        stringList.add("mago");
        stringList.add("grape");

        System.out.println("stringList : " + stringList);

        /*
         * 저장 순서를 유지하고 있는 stringList를 오름차순 정렬
         * Collection 인터페이스가 아닌 Collections 클래스이다.
         * -> Collection에서 사용되는 기능을 static 메소드로 구현한 클래스이며
         * 		인터페이스명 뒤에 s가 붙은 클래스들은 관례상 비슷한 방식으로 작성된 클래스를 의미하게 된다.
         */
        Collections.sort(stringList); //근데 오름차순밖에 안되유
        System.out.println("stringList : " + stringList);

        /* 조금 복잡하지만 내림차순 정렬을 할 수 있다.
         *
         * 하지만 ArrayList에는 역순으로 정렬하는 기능이 제공되지 않는다.
         *
         * 역순 정렬 기능은 LinkedList에 정의되어 있는 현재 사용하는 ArrayList를
         * LinkedList로 변경할 수 있다.
         * */
        stringList = new LinkedList<>(stringList);

        /* Iterator반복자 인터페이스를 활용해서 역순으로 정렬한다.
         * LinkedList타입으로 형변환 한 후에 descendingIterator() 메소드를 사용하면
         * 내림차순으로 정렬된 Iterator 타입의 목록으로 반환을 해준다.
         * 제네릭 적용하는 것이 좋다.
         *
         * Iterator란? 줄서세요!
         * Collection 인터페이스의 iterator() 메소드를 이용해서 인스턴스를 생성할 수 있다.
         * 컬렉션에서 값을 읽어오는 방식을 통일된 방식으로 제공하기 위해 사용한다.
         *
         * -> 인덱스로 관리되는 컬렉션이 아닌 경우에는 반복문을 사용해서 요소에 하나씩 접근할 수 없기 때문에
         * 	   인덱스를 사용하지 않고도 반복문을 사용하기 위한 목록을 만들어주는 역할이라고 보면된다
         *
         * hashNext() : 다음 요소를 가지고 있는 true, 더 이상 요소가 없는 경우 false를 반환
         * next() : 다음 요소를 반환
         * */

        Iterator<String> dIter = ((LinkedList<String>) stringList).descendingIterator();
        /* 한번 next()로 값을 꺼내면 다시 쓸 수 없다. -> 그래서 새로운 List에 담아줌*/
//		while(dIter.hasNext()) {
//
//			System.out.println(dIter.next());
//		}
//		while(true) {
//
//			System.out.println(dIter.next());
//		}

        /* 역순으로 정렬된 결과를 저장하기 위해 새로운 ArrayList를 생성 및 저장 */
        List<String> descList = new ArrayList<>();

        while(dIter.hasNext()) {

            descList.add(dIter.next());
        }

        System.out.println("descList : " + descList);
    }

}
