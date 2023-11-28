package class_and_object;

public class FinalField {

    /* non-static field에 final사용 */

    /* final은 변경 불가의 의미를 가지고 있다.
     * 따라서 초기 인스턴스가 생성되고 나면 기본값이 0인 필드에 들어가게되는데,
     * 그 초기화 이후 값을 변경할 수 없기 때문에 선언하면서 바로 초기화를 해주어야 한다.
     * 그렇지 않으면 compile error가 발생한다.
     * */
    /* 이를 해결할 수 있는 방법 2가지 */
    /* 1.선언과 동시에 초기화 한다. */

    private final int NoN_STATIC_NUM = 1;

    /* 생성자를 이용해 초기화 */
    private final String NON_STATIC_NAME;

    public FinalField(String nonStaticName){
        NON_STATIC_NAME = nonStaticName;
    }

    //private static final int STATIC_NUM; 에러남 ->0으로 초기화 되기 때문에 이후 변경 불가능
    private static final int STATIC_NUM = 1;

    /* static 상수는 생성자인자로 초기화 불가 */
    //private static final double STATIC_DOUBLE;

    //순서가 안 맞음.. static이 생성자보다 먼저 생기는데(프로그램이 실행될 때,)
    //이거를 생성자로 나중에 초기화해줄 수 가 없음.
//	public FinalFieldTest(double staticDouble) {
//
//		FinalFieldTest.STATIC_DOUBLE = staticDouble;
//	}
}
