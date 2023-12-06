package colletion.set;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class App2 {

	public static void main(String[] args) {
		
		/* LinkedHashSet 클래스 */
		/* HashSet이 가지는 기능을 모두 가지고 있고
		 * 추가적으로 저장 순서를 유지하는 특징을 가지고 있다.
		 * 
		 *  중복제거 + 순서 (good)
		 * */
		LinkedHashSet<String> lhest = new LinkedHashSet<>();
		
		lhest.add("java");
		lhest.add("oracle");
		lhest.add("jdbc");
		lhest.add("html");
		lhest.add("css");
		lhest.add("css");
		lhest.add("css");
		lhest.add("css");
		
		System.out.println("lhest : " + lhest);//순서가지고있음
		
		/* 오른차순 정렬을 원하면 클래스 타입일 때에만 가능 (Integer, String등등) */
		TreeSet<String> tset = new TreeSet<>(lhest);
		System.out.println("tset" + tset);
		/* 만들어진 linkedHashSet을 가지고 TreeSet으로 객체를 생성하면
		 * 같은 타입의 객체를 자동으로 비교하여 오름차순으로 정렬한다.
		 * */
		
		TreeSet<String> tset1 = new TreeSet<String>();
		tset1.add("d");
		tset1.add("c");
		tset1.add("t");
		tset1.add("p");
		tset1.add("q");
		
		System.out.println(tset1);
		
	}
}
