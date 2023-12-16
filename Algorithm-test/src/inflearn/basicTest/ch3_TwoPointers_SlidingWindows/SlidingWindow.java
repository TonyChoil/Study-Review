package inflearn.basicTest.ch3_TwoPointers_SlidingWindows;

import java.util.Scanner;

public class SlidingWindow {

    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        int sum = 0;

        for(int i = 0; i < m; i++) {
            sum += arr[i]; // m = 5일 때  0~4까지
        }
        // 첫 window 완성
        answer = sum;
        for (int i = m; i < n; i++) {
            sum = sum - arr[i-m] + arr[i]; //
            answer = Math.max(answer, sum);
        }
        return answer;
}

    public static void main(String[] args) {
        SlidingWindow main = new SlidingWindow();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(main.solution(n, m, arr));

    }
}
