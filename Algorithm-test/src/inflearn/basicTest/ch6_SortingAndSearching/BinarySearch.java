package inflearn.basicTest.ch6_SortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public int solution(int n, int target, int[] arr) {
        int minIndex = 0, maxIndex = n-1;
        Arrays.sort(arr);

        while (minIndex <= maxIndex) {
            int halfIndex = (minIndex + maxIndex) / 2;
            if (arr[halfIndex] < target) {
                minIndex = halfIndex+1;
            } else if (arr[halfIndex] > target) {
                maxIndex = halfIndex-1;
            } else return halfIndex + 1;
        }
        return 0;
    } //answer 는 인덱스+1 해주어야함

    public static void main(String[] args) {
        BinarySearch main = new BinarySearch();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(main.solution(n, target, arr));
    }
}
