package inflearn.basicTest.ch8_ApplyingDFSandBFS;

import java.util.ArrayList;
import java.util.Scanner;

public class DFS6_2 {
    static int[] pm, ch, arr;
    static int n, m;
    public void DFS(int L){
        if(L==m){
            for(int x : pm) System.out.print(x + " ");
            System.out.println();
        }else{
            for(int i=0; i<n; i++){
                if(ch[i]==0){
                    ch[i]=1;
                    pm[L]=arr[i];
                    DFS(L+1);
                    ch[i]=0;
                }
            }
        }
    }
    public static void main(String[] args) {
        DFS6_2 T = new DFS6_2();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        ch = new int[n];
        pm = new int[m];
        T.DFS(0);
    }
}
