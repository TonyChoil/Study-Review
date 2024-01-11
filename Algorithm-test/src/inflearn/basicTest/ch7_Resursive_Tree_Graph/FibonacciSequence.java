package inflearn.basicTest.ch7_Resursive_Tree_Graph;

import java.util.Scanner;

public class FibonacciSequence {
    static int[] fibo;
    public int FibonacciSequence(int n) {
        if(fibo[n]>0) return fibo[n];
        if (n == 1 || n == 2)  return fibo[n] = 1;
        else return fibo[n] = FibonacciSequence(n-1) + FibonacciSequence(n-2);
    }

    public static void main(String[] args) {
        FibonacciSequence T = new FibonacciSequence();
        int n = 100;
        fibo = new int[n+1];
        T.FibonacciSequence(100);
        for(int i = 1; i <= n; i++) System.out.print(fibo[i] + " ");
    }
}
