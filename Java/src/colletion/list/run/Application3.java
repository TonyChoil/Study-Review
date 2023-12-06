package colletion.list.run;

import java.util.LinkedList;
import java.util.List;

public class Application3 {
	
	public static void main(String[] args) {
	
		/* LinkedList
		 * 
		 * ArrayList가 배열을 이용해서 발생할 수 있는 성능적인 단점을 보완하고자 고안되었다.
		 * 내부는 이중 연결리스트로 구현되어있다.
		 * 
		 * 단일 연결 리스트
		 * : 저장한 요소가 순서를 유지하지 않고 저장되지만 이러한 요소들 사이를 링크로 연결하여
		 * 구성하여 마치 연결된 리스트 형태인 거 처럼 만든 자료구조이다.
		 * 요소의 저장과 삭제 시 다음 요소를 가리키는 참조 링크만 변경하기 때문에
		 * 요소의 저장과 삭제가 빈번히 일어나는 경우 ArrayList보다 성능면에서 우수하다.
		 * 
		 * 하지만 단일 연결리스트는 다음 요소만 링크하기 때문에 이전 요소로 접근하기가 어렵다.
		 * 이를 보완하고자 만든 것이 이중 연결 리스트이다.
		 * 
		 * 이중 연결 리스트
		 *  : 단일 연결 리스트는 다음 요소만 링크하는 반면 이중 연결 리스트는 이전 요소도 링크하여
		 *   이전 요소로 접근하기 쉽게 고안된 자료구조이다.
		 * */
		//+ Queue 객체를 만들 때 생성자로 LinkedList를 대부분 사용함.
		List<String> linkedList = new LinkedList<String>();
		
		linkedList.add("apple");
		linkedList.add("banana");
		linkedList.add("orange");
		linkedList.add("mango");
		linkedList.add("grape");
		
		for(int i = 0; i < linkedList.size(); i++) {
			
			System.out.println(i + " : " + linkedList.get(i));
		}
		linkedList.remove(1);
		
		for(String s : linkedList) {
			System.out.println(s);
		}
		
		linkedList.set(0, "fineapple"); //set은 교체하는거 해당인덱스 추가는 add(index,값)
		/* toString() 메소드가 오버라이딩 되어있어서 모든 요소 정보를 쉽게 볼 수 있다. */
		System.out.println(linkedList);
		/* isEmpty() 메소드는 list가 비어있는지를 확인할 때 사용 */
		System.out.println(linkedList.isEmpty());
		
		/* 초기화 */
		linkedList.clear();
		
		System.out.println(linkedList.isEmpty()); //true
		
		
	}
}
