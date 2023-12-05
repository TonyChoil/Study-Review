package contorl_flow_statment;

public class branching_statement {

    public static void main(String[] args) {

        branching_statement app = new branching_statement();
//        App.testSimpleBreakStatement();
//        App.testSimpleBreakStatement2();
        app.testJumpBreak();
    }

    /* break문은 반복문내에서 사용한다.
     * 해당 반복문을 빠져나올 때 사용하며, 반복문의 조건문 판단
     * 결과와 상관없이 반복분을 빠져나올때 사용한다.
     *
     * 일반적으로 if(조건식) { break; }처럼 사용된다.
     * 단, switch문은 반복문이 아니지만 예외적으로 사용된다.
     * break = 가장 가까운 반복문을 탈출한다
     */
    public void testSimpleBreakStatement() {
        int sum = 0;
        for (int i = 1; ; i++) {
            sum += i;
            System.out.println(sum);
            if (i == 100) {
                break;
            }
        }
    }

    public static void testSimpleBreakStatement2() {
        /*
        중첩 반복문
        break는 모든 반복문을 종료하는 것이 아닌, 자신에게 가장 인접한 반복문 실행만 멈춘다.
        * */
        for (int dan = 2; dan < 10; dan++) {

            for (int su = 1; su < 10; su++) {
                if (su > 5) {
                    /* su가 5보다 큰 경우 해당 반복문을 빠져나온다. */
                    // if문 빠져나가는 거 아님. 그 위에 반복문.
                    break; //return = 메소드 호출한 곳으로 돌아감. ->2단에서 멈춤
                }
                System.out.println(dan + " * " + su + " = " + (dan * su));
            }
            System.out.println();
        }
    }
    public static void testJumpBreak() {
        /* 중첩 반복문 내에서 분기문(break)를 이용하여 한 번에 여러 개의 반복문을 중지시킬 때 사용 */
            //밑에 for문을 한 덩어리로 묶어서 label이라고 이름을 정해준임.

//        Label_continue: // 라벨 붙이기
//        for ( int i = 0; i < 3; i++ ) {
//            for ( int j = 1; j <= 3; j++ ) {
//                if ( j ==  2 ) {
//                    System.out.println( i+ "번 째" + " j :" + j);
//                    continue Label_continue;
//                }
//
//            }
//        }
        label_a:
        for(;;) {
            for(int i = 0; i < 10; i++) {
                System.out.println("i = " + i);
                System.out.println(i);
                if(i ==3) {

                    break label_a;
                }
            }
        }
        System.out.println(123);
    }
}
