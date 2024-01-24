package inflearn.basicTest.ch8_ApplyingDFSandBFS;

import java.util.Scanner;

public class DFS10 {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int answer = 0;
    static int[][] board = new int[8][8];

    public void DFS(int x, int y){
        if(x == 7 && y == 7) answer++;
        else{
            for(int i = 0; i < 4; i++){
                int nx = x+dx[i];
                int ny = y+dy[i];
                if(nx>=1 && nx <= 7 && ny>= 1 && ny <= 7 && board[nx][ny] == 0){
                    board[nx][ny] = 1;
                    DFS(nx, ny);
                    board[nx][ny] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        DFS10 T = new DFS10();
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i <= 7; i++){
            for(int j = 1; j <= 7; j++){
                board[i][j] = sc.nextInt();
            }
        }
        board[1][1] = 1;
        T.DFS(1, 1);
        System.out.println(answer);
    }
}
