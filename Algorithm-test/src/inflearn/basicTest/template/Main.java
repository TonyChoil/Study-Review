package inflearn.basicTest.template;

import java.util.Scanner;

public class Main {

public int solution(int n, int[] arr) {
    int answer = 0;
    int highest = 0;
    for(int i = 0; i < n; i++){
        if(highest < arr[i]){
            highest = arr[i];
            answer++;
        }
    }
    return answer;
}

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(main.solution(n, arr));
    }
}
