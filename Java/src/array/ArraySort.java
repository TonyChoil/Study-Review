package array;

public class ArraySort {

    public static void main(String[] args) {

        /* 버블 정렬(bubble sort)

        구현이 쉽다는 장점이 있으며, 이미 정렬된 데이터를 정렬할 때 가장 빠름
        하지만 다른 정렬에 비해 정렬 속도가 느리며, 역순으로 정렬할 때 가장 느린 속도
        * */

        int[] iarr = {2, 5, 4, 6, 1, 3};
        //제일 큰수가 계속 맨뒤로 가게 됨
        int temp;

        for(int i = iarr.length - 1; i>=0; i--){
            // i = 0 ~ 5
            // i = 0   j = 0
            // i = 1  j = 0, 1
            // i = 5 j = 0,1,2,3,4

            for(int j = 0; j < i; j++){
                System.out.println("i : " + i + " j : " + j );

                if(iarr[j] < iarr[j + 1]){

                    temp = iarr[j];
                    iarr[j] = iarr[j + 1];
                    iarr[j+1] = temp;
                }
            }

        }
        for(int i = 0; i < iarr.length; i++) {

            System.out.print(iarr[i]);
        }
        
        /* 순차 정렬
        
        순차 정렬이란 정렬 알고리즘에서 가장 간단하고 기본이 되는 알고리즘으로
        배열의 처음과 끝을 탐색하면서 차순대로 저열ㄹ하는 가장 기초적인 정렬 알고리즘
        * */
        int[] iarr2 = {2, 5, 4, 6, 1, 3};

        for(int i = 1; i < iarr2.length; i++){

            for(int j = 0; j < i; j++){

                if(iarr2[i]< iarr2[j]){
                    int temp2;
                    temp2 = iarr[i];
                    iarr2[i] = iarr2[j];
                    iarr2[j] = temp2;
                }
            }
        }

    }
}
