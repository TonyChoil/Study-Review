package inflearn.basicTest.ch6_SortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;

public class DecisionAlgorithm1 {

    public int Count(int size, int[] arr){
        int cnt = 1, sum = 0;
        for(int i : arr){
            if(sum + i > size){
                cnt++;
                sum = i;
            } else sum += i;
        }
        return cnt;
    }

    public int solution(int n, int num, int[] arr) {
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();
        while(lt <= rt){
            int size = (lt+rt)/2;
            if(Count(size, arr) <= num){
                answer = size;
                rt = size - 1;
            } else lt = size + 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        DecisionAlgorithm1 main = new DecisionAlgorithm1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(main.solution(n, num, arr));
    }
}
