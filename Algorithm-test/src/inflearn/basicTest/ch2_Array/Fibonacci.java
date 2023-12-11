package inflearn.basicTest.ch2_Array;

import java.util.Scanner;

public class Fibonacci {

//    public int[] solution(int n) {
//        int[] answer = new int[n];
//        answer[0] = 1;
//        answer[1] = 1;
//
//        for(int i = 2; i < n; i++){
//            answer[i] = answer[i-1] + answer[i-2];
//        }
//
//        return answer;
//    }

    public void solution(int n){
        int a=1, b=1, c;
        System.out.print(a +" " + b);
        for(int i = 2; i < n; i++){
            c = a + b;
            a = b;
            b = c;
            System.out.print(" " + c);
        }
    }

//    public static void main(String[] args) {
//        Fibonacci main = new Fibonacci();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i : main.solution(n)) {
//            System.out.print(i + " ");
//        }
//    }

    public static void main(String[] args) {
        Fibonacci main = new Fibonacci();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

       main.solution(n);
    }
}
