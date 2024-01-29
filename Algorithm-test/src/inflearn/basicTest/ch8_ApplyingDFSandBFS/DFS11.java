package inflearn.basicTest.ch8_ApplyingDFSandBFS;
import java.util.Scanner;

public class DFS11 {
    static int n, answer = 0;
    static int[][] board, ch;
    int[] dx = {1, -1, 0, 0, -1, 1, -1, 1};
    int[] dy = {0, 0, 1, -1, -1, 1, 1, -1};

    public void DFS(int x, int y){
        for(int i = 0; i < 8; i++) {
        	int nx = x + dx[i];
        	int ny = y + dy[i];
        	if(nx >=0 && ny >= 0 && nx < n && ny < n && board[nx][ny] == 1 && ch[nx][ny] == 0) {
        		// 섬이지만, 안가본 곳은 추가해줌
        		ch[nx][ny] = 1;
        		DFS(nx, ny);
        	}
        }
    }

	public static void main(String[] args) {
        DFS11 T = new DFS11();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        board = new int[n][n];
        ch = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < n; i++) {
        	for(int j = 0; j < n; j++) {
        		if(board[i][j] == 1 && ch[i][j] == 0) {
        			answer++;
        			ch[i][j] = 1;
        			T.DFS(i, j);
        		}
        	}
        }
        System.out.println(answer);
	}
}
