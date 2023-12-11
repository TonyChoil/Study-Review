package inflearn.basicTest.ch2_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Prime2 {

    public boolean isPrime(int reversed){
        if(reversed == 1) return false;
        for(int i = 2; i < reversed; i++){
            if(reversed % i ==0) return false;
        }
        return true;
    }

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList();
        for (int i = 0; i < n; i++) {
            int reversed = 0;
            int tmp = arr[i];
            while(tmp > 0){

                reversed = reversed * 10 + tmp % 10; // 1
                tmp = tmp/10;
            }
            if(isPrime(reversed)) answer.add(reversed);
        }

        return answer;
    }

    public static void main(String[] args) {
        Prime2 main = new Prime2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int s : main.solution(n, arr)) {
            System.out.print(s + " ");
        }
    }
}
