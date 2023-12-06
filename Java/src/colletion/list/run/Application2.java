package colletion.list.run;

import colletion.list.dto.BookDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Application2 {

	public static void main(String[] args) {
		
		List<BookDTO> bookList = new ArrayList<>();
		ArrayList<BookDTO> bookList1 = new ArrayList<>();
		System.out.println(bookList);
//		System.out.println(bookList1);
//		System.out.println(bookList1.get(0).getPrice());
		bookList1.add(new BookDTO());
		System.out.println(bookList1.size());
		/* 도서 정보 추가 */
		
		bookList.add(new BookDTO(1, "홍길동전", "허균", 50000));
		bookList.add(new BookDTO(2, "목민심서", "정약용", 30000));
		bookList.add(new BookDTO(3, "동의보감", "허균", 40000));
		bookList.add(new BookDTO(4, "삼국사기", "김부식", 46000));
		bookList.add(new BookDTO(5, "삼국유사", "일연", 58000));
		
		for(BookDTO book : bookList) {
			
			System.out.println(book);
		}
		/* 제네릭의 타입 제한에 의해 Comparable타입을 가지고 있는 경우에만 sort가 가능하다. */
//		Collections.sort(bookList); 인자값으로 List<BookDTO>는 못와요 라고 뜸.
//		그러니깐 List에 String만 담겨있는경우..
		//bookList는 사용자정의 클래스라서 멤버필드가 넘 많아서, Collections으로 받아줄수가없음
		//그래서 하나씩 비교할 수 있는 Comparator<BookDTO>를 상속받은 클래스를 하나 넣어줘서
		//직접 정렬할수있는 메소드를 만들어줘야하는 것임
		
		bookList.sort(new AscendingPrice());
		System.out.println("가격 오름차순 정렬=======================");
		for(BookDTO book: bookList) {			
			System.out.println(book);
		}
		
		/* 익명클래스를 이용한 정렬(Anonymous class) */
		
//		bookList.sort(new Comparator<BookDTO>()); 인터페이스는 혼자서 객체생성불가(생성자없음)
		
		/* 익명클래스는 뒤에 {}을 만들어서 마치 Comparator 인터페이스를 상속받은 클래스인데
		 * 이름이 없다고 생각하고 사용하는 것이다.
		 * */
		System.out.println("가격 내림차순 정렬======================");
		bookList.sort(new Comparator<BookDTO>() { //여기서 { } 추가괄호는 익명클래스르 만들어준것임
     
@Override
public int compare(BookDTO o1, BookDTO o2) {

return o1.getPrice() >= o2.getPrice() ? -1 : 1;
}
});
		
		for(BookDTO book: bookList) {
			
			System.out.println(book);
		}
		
		/* 제목순 오름차순으로 정렬 */
		bookList.sort(new Comparator<BookDTO>() {

			@Override
			public int compare(BookDTO o1, BookDTO o2) {
				/* 문자열은 대소비교를 할 수 없다. */
				/* 문자 배열로 변경 후 인덱스 하나하나를 비교해서 어느 것이 더 큰 값인지
				 * 확인해야하는데 String클래스의 compareTo()메소드에서 이미 정의해 놓았다. */
				
				/* 앞에 값이 더 작은 경우(즉, 바꾸지 않아도 되는 경우)음수반환,
				 * 같으면 0 반환
				 * 앞에 값이 더 큰 경우 양수 반환(즉, 바꿔야하는 경우)
				 * */
				return o2.getTitle().compareTo(o1.getTitle());
			}
		});
		
		System.out.println("책 제목 오름차순 정렬=======================");
		for(BookDTO book : bookList) {
			
			System.out.println(book);
		}
		
		/* 람다식(->)을 이용한 표기 */
		bookList.sort((BookDTO b1, BookDTO b2) -> b1.getTitle().compareTo(b2.getTitle()));
		
		System.out.println("책 제목 내림차순 정렬======================");
		for(BookDTO book : bookList) {
			
			System.out.println(book);
		}
	}
}
