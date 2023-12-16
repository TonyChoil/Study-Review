package inflearn.basicTest.ch3_TwoPointers_SlidingWindows;

import java.util.Scanner;

public class ContinuousSequence {

    public int solution(int n, int m, int[] arr) {
        int answer = 0, sum = 0, firstIndex = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
            if(sum == m) answer++;
            else if(sum > m){
                while(sum > m){
                    sum -= arr[firstIndex++];
                    if(sum == m)answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        ContinuousSequence main = new ContinuousSequence();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(main.solution(n, m, arr));
    }
}