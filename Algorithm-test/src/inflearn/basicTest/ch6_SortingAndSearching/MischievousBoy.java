package inflearn.basicTest.ch6_SortingAndSearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MischievousBoy {

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList answer = new ArrayList();
        int[] arr2 = arr.clone();
        Arrays.sort(arr2);
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != arr2[i]) answer.add(i+1);
        }

        return answer;
    }

    public static void main(String[] args) {
        MischievousBoy main = new MischievousBoy();
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
