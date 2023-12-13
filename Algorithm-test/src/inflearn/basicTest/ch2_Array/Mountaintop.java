package inflearn.basicTest.ch2_Array;

import java.util.Scanner;

public class Mountaintop {

    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};
public int solution(int n, int[][] arr) {
    int answer = 0;
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            boolean flag = true;
            for(int k=0; k<4; k++){
                int nx=i+dx[k];
                int ny=j+dy[k];
                if(nx>= 0 && nx< n && ny>= 0 && ny<n && arr[nx][ny]>=arr[i][j]){
                    flag = false;
                    break;
                }
            }
        if(flag) answer++;
        }
    }
    return answer;
}

//    public int solution(int n, int[][] arr) {
//        int answer = 0;
//        for(int i=0)
//
//            // i = 0 j = 0 i = n+1 j = n + 1
//            int[][] grid =  new int[n+2][n+2];
//        for(int i = 0; i < n+2; i++){
//            for(int j = 0; j < n+2; j++){
//                if(i == 0 || j == 0 || i == n+1 || j == n+1){
//                    grid[i][j] = 0;
//                } else{
//                    grid[i][j] = arr[i-1][j-1];
//                }
//            }
//        }
//        for(int i = 1; i < grid.length-1; i++){
//            for(int j = 1; j < grid.length-1; j++){
//                if(grid[i][j] > grid[i-1][j] &&
//                        grid[i][j] > grid[i+1][j] &&
//                        grid[i][j] > grid[i][j-1] &&
//                        grid[i][j] > grid[i][j+1]){
//                    answer++;
//                }
//
//            }
//        }
//
//        return answer;
//    }
    public static void main(String[] args) {
        Mountaintop main = new Mountaintop();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){

                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(main.solution(n, arr));
    }
}
