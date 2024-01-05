package inflearn.basicTest.ch6_SortingAndSearching;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CheckDuplicateLetter {

    public Character solution(int n, int[] arr) {
        Character answer = 'D';
        Set<Integer> set = new TreeSet();
        for(int i : arr) set.add(i);

        if(set.size() == arr.length) answer = 'U';

        return answer;
    }

    public static void main(String[] args) {
        CheckDuplicateLetter main = new CheckDuplicateLetter();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.print(main.solution(n, arr));
    }
}
