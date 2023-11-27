package array;

public class DemensionalArray {

    public static void main(String[] args){

        /** 2차원 배열은 1차원 배열 여러 개를 하나로 묶어서 관리하는 배열을 의미한다.
         * 더 많은 차원의 배열을 사용할 수 있지만 일반적으로 2차원 배열보다 더 높은 배열은
         * 사용 빈도가 적다.
         * */

        /* 2차원 배열을 사용하는 방법
        1. 배열의 주소를 보관할 레퍼런스 변수 선언(stack)
        2. 여러 개의 1차원 배열의 주소를 관리하는 배열을 생성(heap)
        3. 각 인덱스에 관리하는 배열을 할당(heap)하여 주소를 보관하는 배열에 저장
        4. 생성한 여러 개의 1차원 배열에 차례로 접근해서 사용
        * */

        int[][] iarr1;
        int iarr2[][];
        int[] iarr3[]; // 이렇게 선언하고 이차원배열로 생성자 생성가능.

        iarr3 = new int[3][];

        System.out.println("iarr3 : " + iarr3);
        //iarr[0], iarr[1], iarr[2]를 묶어서 가리키는 iarr주소값
        iarr3[0] = new int[5]; //iarr3[0]에 주소가 할당됨 (방이생성됨)
        System.out.println("iarr3[0] : " + iarr3[0]);
        iarr3[0] = new int[5]; //iarr3[0]에 주소가 할당됨 (방이생성됨)
        System.out.println("iarr3[0]에 방 할당");
        System.out.println("iarr3[0] : " + iarr3[0]);
        System.out.println("iarr3[0][1] : " + iarr3[0][1]); //생성된 방은 자동0초기화 (int)
        System.out.println("iarr3[1] : " + iarr3[1]);

        iarr1 = new int[3][]; //에러안남.
		int[] aar1;
//		aar1 = new int[];// 이건안됨..
        //왜? int[]는 값자체를 받아오지만
        //int[3][] 는 int[3]에 []를 받아오겠다.

        //int[3][4] 와 같이 3x4가 되면 정변배열
        //int[3][] 은 각자 크기가 다른 방을 만들어주면 가변배열

        /* 2차원 정변배열을 선언 및 할당하고 차례로 값 대입해서 출력하기

        1.배열의 선언 및 할당
        자료형[][] 변수명 = new 자료형[할당할 배열의 개수][할당할 배열의 길이]
        * */
        /* 길이가 5인 배열을 3개 할당하고 그 주소를 묶어 관리하는 배열의 주소를 stack의 iarr에 저장한다. */

        int[][] iarr = new int[3][5];
        int k = 0;

        for(int i = 0; i < iarr.length ; i++){
            for(int j = 0; j < iarr[i].length; j++){
                iarr[i][j] = ++k;
            }
        }

        for(int i = 0; i < iarr.length; i++) {

            for(int j = 0; j < iarr[i].length; j++) {

                System.out.print(iarr[i][j] + " ");
            }

            System.out.println();
        }
    }
}
