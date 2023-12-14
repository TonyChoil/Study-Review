package inflearn.basicTest.ch2_Array;

import java.util.Scanner;

public class Mentoring {

//    public int solution(int n, int m, int[][] arr) {
//        int answer = 0;
//        for(int i = 1; i <= n; i++){ //i = 각 학생
//            int[] studentNum = new int[n+1];
//            for(int j = 0; j < m; j++){ // m은 시험 횟수
//                int index = Integer.MAX_VALUE;
//                for(int k = 0; k < n; k++){ // 해당 행의 index
//                    if(arr[j][k] == i) index = k;
//                    if(k > index) studentNum[arr[j][k]]++;
//                    // 여기서 내(i)의 index를 찾고, 그거를 다른 학생 인덱스랑 비교해서 내 뒤에있는 학생 번호를 추가.
//                    //경우의 수를 ++하는 것.
//                    // n만큼의 배열을 만들고, n인 값의 수를 찾는다.
//                    //
//                    //그러면 j까지 다 돌았을 때 ++가 이루어져야 한다.
//                }
//            }
//            for(int k = 1; k <= n; k++){
//                if(studentNum[k] == m) answer ++;
//            }
//        }
//        return answer;
//    }
    public int solution(int n, int m, int[][] arr) {
        int answer = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                int cnt = 0;
                for(int k = 0; k < m; k++){
                    int pi = 0, pj = 0;
                    for(int s = 0; s < n; s++){
                        if(arr[k][s] == i) pi=s;
                        if(arr[k][s] == j) pj=s;
                    }
                    if(pi>pj) cnt++;
                }
                if(cnt == m) answer++;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Mentoring main = new Mentoring();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(main.solution(n, m, arr));
    }
}
