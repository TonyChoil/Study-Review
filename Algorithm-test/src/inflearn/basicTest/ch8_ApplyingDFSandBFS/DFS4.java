package inflearn.basicTest.ch8_ApplyingDFSandBFS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DFS4 {
    static int n, m;

    public void DFS(int L, int[] arr) {
        if (L == m) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        } else {
            for(int k = 1; k <= n; k++){
                arr[L] = k;
                DFS(L+1, arr); // n가닥 뻗어나간다.
            }
        }
    }

    public static void main(String[] args) {
        DFS4 T = new DFS4();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        T.DFS(0, new int[m]);
    }
}
