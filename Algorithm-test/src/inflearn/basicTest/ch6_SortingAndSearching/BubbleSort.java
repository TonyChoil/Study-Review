package inflearn.basicTest.ch6_SortingAndSearching;

import java.util.Scanner;

public class BubbleSort {

    public int[] solution(int n, int[] arr) {
        int[] answer = arr;
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        BubbleSort main = new BubbleSort();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i]= sc.nextInt();
        }
        for(int i : main.solution(n, arr)){
            System.out.print(i + " ");
        }
    }
}
