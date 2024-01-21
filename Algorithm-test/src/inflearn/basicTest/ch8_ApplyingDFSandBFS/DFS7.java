package inflearn.basicTest.ch8_ApplyingDFSandBFS;

import java.util.Scanner;

public class DFS7 {
     int[][] arr = new int[35][35]; // static을 하지 않아 메모리 세이브
    public int DFS(int n, int r){
        int result = 0;
        if(arr[n][r] != 0) return arr[n][r];
        if(n == r || r == 0) return 1;
        else{
            result = DFS(n-1, r-1) + DFS(n-1, r);
            arr[n][r] = result;
        }

        return result;
    }
    public static void main(String[] args) {
        DFS7 T = new DFS7();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(T.DFS(n, r));
    }
}
