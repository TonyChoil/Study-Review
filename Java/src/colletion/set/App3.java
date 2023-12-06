package colletion.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class App3 {

	public static void main(String[] args) {
		
		/* TreeSet 클래스
		 * 
		 * TreeSet클래스는 데이터가 정렬된 상태로 저장되는 이진 검색 트리 형태로 요소를 저장한다.
		 * 이진 검색 트리는 데이터를 추가하거나 제거하는 등의 기본 동작시간이 매우 빠르다.
		 * 
		 * Set인터페이스가 가지는 특징을 그대로 가지지만 (중복제거)
		 * 정렬된 상태를 유지한다는 것이 다른 점이다. (+오름차순)
		 * */
		
		TreeSet<String> tset = new TreeSet<>();
		
		tset.add("java");
		tset.add("oracle");
		tset.add("jdbc");
		tset.add("html");
		tset.add("css");
		
		System.out.println(tset);

		//하나씩 출력해주기. 
		/* 1번방법. Object[] 배열에 toArray메소드로 넣고, 향상for문이용해 출력 */
		Object[] arr = tset.toArray();
		
		for(Object obj : arr) {
			System.out.println( ((String)obj).toUpperCase() );
		}
		
		/* 2번방법. iterator객체에 넣고 hasNext, next이용해서 출력 */
		Iterator<String> iter = tset.iterator();
		
		System.out.println();
		while(iter.hasNext()) {
			
			System.out.println(((String)iter.next()).toUpperCase());
		}
		
		
		/* 로또 번호 생성(TreeSet 특징 이용) */
		Set<Integer> lotto = new TreeSet<Integer>();
		
		while(lotto.size() < 6) {
			
			lotto.add((int)(Math.random() * 45) + 1);
		}//int해주는 이유는 integer객체에 int넣어주면 오토박싱해줘서그럼 !
		//기본적으로 Math.random()메소드는 double을 반환해줌.
		
		System.out.println(lotto);
		
		
	}
}
