package colletion.set;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		
		/* Set인터페이스를 구현한 Set컬렉션 클래스의 특징
		 * 1. 요소의 저장 순서를 유지하지 않는다.
		 * 2. 같은 요소의 중복 저장을 허용하지 않는다.(null값도 중복하지 않게 하나의 null만 저장한다.)
		 * */

		/* HashSet 클래스
		 * Set 컬렉션 클래스에서 가장 많이 사용되는 클래스 중 하나이다.
		 * 해시 알고리즘을 사용하여 검색 속도가 빠르다는 장점을 가진다.
		 */
		HashSet<String> hset = new HashSet<>();
		
		/* 다형성 적용하여 상위 인터페이스를 타입으로 사용 가능 */
		Set<String> hset2 = new HashSet<>();
		Collection<String> hset3 = new HashSet<>();
		
		hset.add(new String("java")); 
		hset.add(new String("jdbc"));
		hset.add(new String("oracle"));
		hset.add(new String("html"));
		hset.add(new String("css"));
		//지 내부 기준에 의해 쌓아놈. 그리고 iterator쓰면 그대로 나옴
		System.out.println("hest : " + hset);

		hset.add(new String("java"));
		
		System.out.println("hest : " + hset);
		System.out.println("저장된 객체 수 :" + hset.size());
		System.out.println("포함확인 : " + hset.contains(new String("oracle")));
		
		/* 저장된 객체를 하나씩 꺼내는 기능이 없다.
		 * 반복문을 이용한 연속처리 하는 방법 */
		
		 /* 1. toArray() 배열로 바꾸고 for loop 사용 */
		 Object[] arr =  hset.toArray();
		 
		 for(int i = 0; i < arr.length; i++) {
			 
			 System.out.println(i + " : " + arr[i]);
		 }
		 
		 /* 2. iterator*()로 목록 만들어 연속 처리 */
		 Iterator<String> iter = hset.iterator();

		 while(iter.hasNext()) { //꺼내올 내용이 있는지 확인
			 
			 System.out.println(iter.next()); //안에 있는 내용을 반환.
		 }
		 System.out.println(hset);
		 
		 hset.clear();
		 
		 System.out.println("empty ? : " + hset.isEmpty());
		
		
	}
}
