package inflearn.basicTest.template;

import inflearn.basicTest.ch2_Array.Mountaintop;

import java.util.Scanner;

public class Main {

    public int solution(int n, int[][] arr) {
        int answer = 0;

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(main.solution(n, arr));
    }
}
