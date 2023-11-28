package class_and_object;

public class ParameterTest {
    public void testPrimaryTypeParameter(int num) { //num = 매개변수

        System.out.println("매개변수로 전달받은 값 : " + num);
    }

    public void testPrimaryTypeArrayParameter(int[] iarr) {

        /* 배열의 주소가 전달된다.
         * 즉, 인자로 전달하는 배열과 매개변수로 전달받은 배열은 서로 동일한 배열을 가리킨다(얕은복사)
         * */
        System.out.println("매개변수로 전달받은 값 : " + iarr);
    }

	String name;
    String[] hobby;

	public void testVariableLengthArrayParameter(String name, String...hobby) {

		System.out.println("이름 : " + name);
		System.out.println("취미의 개수 : " + hobby.length);
		System.out.print("취미 : ");
		for(int i = 0; i < hobby.length; i++) {

			System.out.print(hobby[i] + " ");
		}
		System.out.println();

	}
//    		public void testVariableLengthArrayParameter(String...hobby) {
//				인자를 읽어 이를 배열로 생성해주는 것
	//가변인자는 인자를 넣지 않아도 정상 실행된다. (있어도 되고 없어도 됨.)
	//가변인자를 받아주는 필드는 배열로 지정한다.
////			System.out.println("이름 : " + name);
//			System.out.println("취미의 개수 : " + hobby.length);
//			System.out.print("취미 : ");
//			for(int i = 0; i < hobby.length; i++) {
//
//				System.out.print(hobby[i] + " ");
//			}
//			System.out.println();
//
//		}
}
