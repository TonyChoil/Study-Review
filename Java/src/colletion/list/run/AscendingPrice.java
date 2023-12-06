package colletion.list.run;

import colletion.list.dto.BookDTO;

import java.util.Comparator;


public class AscendingPrice implements Comparator<BookDTO>{

	@Override
	public int compare(BookDTO o1, BookDTO o2) {
		
		/* sort()에서 내부적으로 사용하는 메소드이다.
		 * 인터페이스를 상속받아서 메소드 오버라이딩 하는 것을 강제화 해 놓았다.
		 * */
		int result= 0;
		
		if(o1.getPrice() > o2.getPrice()) {
			
			/* 오름차순을 위해 순서를 바꿔야 하는 경우 양수를 반환 */
			result = 1;
		} else if(o1.getPrice() < o2.getPrice()) {
			/* 이미 오름차순 정렬로 되어 있는 경우 음수를 반환 */
			result = -1;			
		} else {
			
			/* 두 값이 같은 경우는 0을 반환 */
			result = 0;
		}
		
		return result ;			
	}

}
