package inflearn.basicTest.ch8_ApplyingDFSandBFS;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class DFS5 {
    static int n, amount, answer = Integer.MAX_VALUE;
    public void DFS(int L, int sum, int[] arr){
        if(L >= answer || sum > amount) return;
        if(sum == amount) {
            answer = Math.min(L, answer);
        }
        for(int i = n-1; i >= 0; i--){
            DFS(L+1, sum+arr[i], arr);
        }

    }
    public static void main(String[] args) {
        DFS5 T = new DFS5();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        amount = sc.nextInt();

        T.DFS(0, 0, arr);
        System.out.println(answer);
    }
}
