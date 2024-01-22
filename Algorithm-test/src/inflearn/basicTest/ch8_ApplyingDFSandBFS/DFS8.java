package inflearn.basicTest.ch8_ApplyingDFSandBFS;

import inflearn.basicTest.ch7_Resursive_Tree_Graph.Factorial;

import java.util.Scanner;

public class DFS8 {
    static int m, n, k = 0;
    static int[] c, p, ch;


    public int Factorial(int n){
        if(n == 1 || n == 0) return 1;
        for(int i = n-1; i >= 2; i--){
            n = n * i;
        }
        return n;
    }

    public int Combination(int n, int r){

        return Factorial(n) / (Factorial(n-r) * Factorial(r));
    }

    public void DFS(int L, int sum){
        if(L == n){
            if(sum == m) {
                k = 1;
            }
        }else{
            for(int i = 1; i <= n; i++){
                if(k == 1) return;
                if(ch[i] == 0){
                    ch[i] = 1;
                    p[L] = i;
                    DFS(L+1, sum+c[L]*p[L]);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        DFS8 T = new DFS8();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        c = new int[n];
        p = new int[n];
        ch = new int[n+1];
        for(int i = 0; i < n; i++){
            c[i] = T.Combination(n-1, i);
        }
        T.DFS(0, 0);
        for(int l : p){
            System.out.print(l + " ");
        }
    }
}
