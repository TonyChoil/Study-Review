package inflearn.basicTest.ch2_Array;

import java.util.Scanner;

public class CanSeeStudents {

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
        CanSeeStudents main = new CanSeeStudents();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(main.solution(n, arr));
    }
}
