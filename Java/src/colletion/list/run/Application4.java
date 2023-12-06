package colletion.list.run;

import java.util.Stack;

public class Application4 {
	
	public static void main(String[] args) {
		
	
	/* stack */
	/* Stack은 리스트 계열의 클래스
	 * 스택 메모리 구조는 선형 메모리 공간에 데이터를 저장하며
	 * 후입선출(LIFO - Last In First Out) 
	 * */
	Stack<Integer> integerStack = new Stack<>();
	
	/* Stack에 값을 넣을 때에는 push() 메소드를 이용
	 * add()도 이용이 가능하지만 Vector의 메소드이다. 
	 * 스택구조라는 것을 명확히 하기 위해
	 * push()를 사용하는 것이 좋다.
	 * */
	
	integerStack.push(1);
	integerStack.push(2);
	integerStack.push(3);
	integerStack.push(4);
	integerStack.push(5);
	
	
	System.out.println(integerStack);
	/* 스택에서 요소를 찾을 때 search()를 이용
	 * 인덱스가 아닌 위에서부터의 순번을 의미한다.
	 * 또한 가장 상단의 위치가 0이 아닌 1부터 시작한다.
	 * */
	
	System.out.println(integerStack.search(1));// 맨밑에 박혀있는 1이 나옴
	
	/* stack에서 값을 꺼내는 메소드는 크에 2가지로 볼 수 있다.
	 * peek() : 해당 스택의 가장 마지막에 있는(상단에 있는) 요소 반환
	 * pop() : 해당 스택의 가장 마지막에 있는(상단에 있는) 요소 반환 및 제거
	 * 
	 */

	System.out.println("peek() : " + integerStack.peek());
	System.out.println(integerStack);
	
	System.out.println("pop() : " + integerStack.pop());
	System.out.println("pop() : " + integerStack.pop());
	System.out.println("pop() : " + integerStack.pop());
	System.out.println("pop() : " + integerStack.pop());
	System.out.println("pop() : " + integerStack.pop());

	/* 더이상 pop()으로 꺼내올 요소가 없는 경우 EmptyStackException이 발생한다. */
	System.out.println(integerStack);
	
	}
}
