package inflearn.basicTest.ch6_SortingAndSearching;

import java.util.Scanner;

public class SelectionSort {

    public int[] solution(int n, int[] num) {
        int[] answer = num;
        for(int i = 0; i < n-1; i++){
            int idx=i;
            for(int j=i+1; j<n; j++){
                if(num[j] < num[idx]) idx = j;
            }
            int tmp = num[i];
            num[i] = num[idx];
            num[idx] = tmp;
        }
        return answer;
    }

    public static void main(String[] args) {
        SelectionSort main = new SelectionSort();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i = 0; i < n; i++){
            num[i]= sc.nextInt();
        }
        for(int i : main.solution(n, num)){
            System.out.print(i + " ");
        }
    }
}
