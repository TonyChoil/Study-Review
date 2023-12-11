package inflearn.basicTest.ch2_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Bignumber {

public ArrayList<Integer> solution(int n, int[] arr) {
    ArrayList<Integer> answer = new ArrayList<>();
    answer.add(arr[0]);
    for(int i = 1; i < n; i++){
        if(arr[i] > arr[i-1]) answer.add(arr[i]);
    }
    return answer;
}

    public static void main(String[] args) {
        Bignumber main = new Bignumber();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i]= sc.nextInt();
        }
        for(int x : main.solution(n, arr)){
            System.out.print(x + " ");
        }
    }
}
