package inflearn.basicTest.ch3_TwoPointers_SlidingWindows;

import java.util.Scanner;

public class SumOfNaturalNumbers {

    /* two pointers */
//    public int solution(int n) {
//        int answer = 0;
//        int sum = 0, rt = 1;
//        int[] arr = new int[n+1];
//        for(int i=1; i <= n; i++){
//            arr[i] = i;
//        }
//        for(int i = 1; i <= arr.length/2; i++){
//            sum += arr[i];
//            if(sum == n) answer++;
//                while(sum > n){
//                    sum -= arr[rt++];
//                    if(sum == n) answer++;
//                  }
//        }
//
//        return answer;
//    }

    /* share and rest */
        public int solution(int n) {
//        int answer = 0;
//        int sum = 0, cnt = 1;
//        n--;
//        while(n>0)
//        {
//            cnt++;
//            n=n-cnt;
//            if(n%cnt==0) answer++;
//        }
//        return answer;
            int answer=0, m=2;
            n--;
            while(n>0){
                m++;
                n -= m;
                if(n%m == 0) answer++;
            }
            return answer;
    }

    public static void main(String[] args) {
        SumOfNaturalNumbers main = new SumOfNaturalNumbers();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print(main.solution(n));
    }
}
