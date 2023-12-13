package inflearn.basicTest.ch2_Array;

import java.util.Scanner;

public class ClassLeader {

    public int solution(int n, int[][] arr) {
        int answer = 0;
        int[] count = new int[n + 1];
        for(int i = 1; i <= n; i++) {
            for(int j = i+1; j <= n; j++){
                for(int k = 1; k <= 5; k++){
                    if(arr[i][k] == arr[j][k]){
                        count[i]++;
                        count[j]++;
                        break;
                    }
                }
            }
        }
        int max = 0;
        for(int i = 0; i < count.length; i++){
            if(max < count[i]){
                max = count[i];
                answer = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        ClassLeader main = new ClassLeader();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n+1][6];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {

                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(main.solution(n, arr));
    }
}
