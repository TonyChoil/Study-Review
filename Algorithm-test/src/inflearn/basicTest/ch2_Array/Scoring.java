package inflearn.basicTest.ch2_Array;

import java.util.Scanner;

public class Scoring {

public int solution(int n, int[] arr) {
    int answer = 0;
    int combo = 0;
    for(int i = 0; i < arr.length; i++){
        if(arr[i] == 1) {
            combo++;
            answer += combo;
        }else combo = 0;
    }

    return answer;
}

    public static void main(String[] args) {
        Scoring main = new Scoring();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(main.solution(n, arr));
    }
}
