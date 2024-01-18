package inflearn.basicTest.ch8_ApplyingDFSandBFS;

import java.util.Scanner;

public class DFS3 {
    static int m ,n, answer=0;
    public void DFS(int time, int score, int L, int[][] q){
        if(time > m) return;
        if(L == n){
            if(score > answer) answer = score;
        }else{
            DFS(time+q[L][1], score+q[L][0], L+1, q);
            DFS(time, score, L+1, q);
        }
    }
    public static void main(String[] args) {
        DFS3 T = new DFS3();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        int[][] q = new int[n][2];
        for(int i = 0; i < n; i++){
            q[i][0] = sc.nextInt();
            q[i][1] = sc.nextInt();
        }

        T.DFS(0, 0, 0, q);
        System.out.println(answer);
    }
}
