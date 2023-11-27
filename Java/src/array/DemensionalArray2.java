package array;

public class DemensionalArray2 {

    public static void main(String[] args) {

        /**
         * 2차원 가변배열(dynamic array)을 선언 및 할당하고 차례로 값을 대입하서 출력
         *
         * 1. 배열의 선언 및 할당
         * 가변 배열의 경우 각 인덱스별 배열을 따로 할당 해야하만 한다.
         *
         * 선언과 동시에 모든 배열을 할당할 수 없으며, 할당할 배열의 갯수만 지정하고 각 인덱스에
         * 서로 다른 길이의 배열을 따로 할당해야 한다.
         *
         * 자료형[][] 변수먕 = new 자로형[배열크기][];
         *
         * 변수명[배열인덱스] = new 자료형[배열의 길이];
         */

//        int[][] iarr= new int[3][];


//		iarr[1] = new char[2]; 자료형이다른 배열은 하나로 묶어 관리할 수 없음
//        iarr[1] = new int[2];

        /* 2차원 배열도 할당과 동시에 JVM 기본값 외의 값으로 초기화하고 싶은 경우
        리터럴을(실값) 이용할 수 있다.
        * */

        /* 정변배열
        int[][] iarr = new int[1][5]; = int[][] iarr = {{1, 2, 3, 4, 5}}
        * */
        int[][] iarr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}};

        for (int i = 0; i < iarr.length; i++) {

            for (int j = 0; j < iarr[i].length; j++) {

                System.out.print(iarr[i][j] + " ");
            }

            System.out.println();
        }

        /* 가변배열 */
        int[][] iarr2 = {{1, 2, 3}, {4, 5, 6, 7},
                {8, 9, 10, 11, 12}};

        for (int i = 0; i < iarr2.length; i++) {

            for (int j = 0; j < iarr2[i].length; j++) {

                System.out.print(iarr2[i][j] + " ");
            }

            System.out.println();
        }
        System.out.println();
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};
        int[] arr3 = {20, 30};

        int[][] iarr3 = {arr1, arr2, arr3}; // int[][] iarr3 = new int[][]
        //iarr3라는 stack영역에 배열 주소값을 참조하는 참조변수를 넣어주고, heap의 배열 영역에 또다른 배열을 참조하는
        // arr1 arr2 arr3의 주소값이 들어있다. 주의해야 할 것인 이 때 arr1~3이 같은 자료형배열이어야 한다는 것이다.
        for (int i = 0; i < iarr3.length; i++) {

            for (int j = 0; j < iarr3[i].length; j++) {

                System.out.print(iarr3[i][j] + " ");
            }

            System.out.println();
        }

    }
}
