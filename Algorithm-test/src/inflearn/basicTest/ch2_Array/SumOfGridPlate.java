package inflearn.basicTest.ch2_Array;

import java.util.Scanner;

public class SumOfGridPlate {

public int solution(int n, int[][] arr) {
    int answer = 0;
    int sum1, sum2;
    int crossSum = 0, xcrossSum = 0;
    for(int i = 0; i < n; i++){
        sum1 = sum2 = 0;
        for(int j = 0; j < n; j++){
            sum1 += arr[i][j];
            sum2 += arr[j][i];
            if(i==j) crossSum += arr[i][j];
            if(i+j == n-1) xcrossSum += arr[i][j];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);
    }
    answer = Math.max(answer, crossSum);
    answer = Math.max(answer, xcrossSum);


    return answer;
}

    public static void main(String[] args) {
        SumOfGridPlate main = new SumOfGridPlate();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(main.solution(n, arr));
    }
}
