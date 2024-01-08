package inflearn.basicTest.ch6_SortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;

public class BinaryQuestion2 {
    public int Count(int distance, int[] arr){
        int cnt = 1, index = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] - arr[index] >= distance){
                cnt++;
                index = i;
            }
        }
        return cnt;
    }

    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int lt = 1;
        int rt = arr[n-1];
        while(rt>= lt){
            int distance = (lt+rt)/2;
            if(Count(distance, arr) >= m){ //Count true-> 더 줄여야한다.
                answer = distance;
                lt = distance+1;
            }else rt = distance-1;
        }

        return answer;
    }

    public static void main(String[] args) {
        BinaryQuestion2 main = new BinaryQuestion2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(main.solution(n, m, arr));
    }
}
