package inflearn.basicTest.ch8_ApplyingDFSandBFS;

import java.util.Scanner;

public class DFS9 {
    static int n, m;
    static int[] ch, arr;
    public void DFS(int L, int first){
        if(L == m){
            for(int i : arr) System.out.print(i + " ");
            System.out.println();
        }else{
            for(int i  = first; i <= n; i++){
                    arr[L] = i;
                    DFS(L+1, i+1);
            }
        }
    }

    public static void main(String[] args) {
        DFS9 T = new DFS9();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        ch = new int[n+1];
        arr = new int[m];
        T.DFS(0, 0);
    }
}
