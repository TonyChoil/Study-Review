package inflearn.basicTest.ch10_Dynamic_Programming;

import java.util.Scanner;

public class ClimbingStairs {
	static int[] arr;
	static int[][] ch;
	static int cnt = 1;
	public int Combi(int n, int m) {
		if(ch[n][m] != 0) return ch[n][m];
		System.out.println(cnt++);
		if(m == 0 || n==m) return 1;
		return ch[n][m] = Combi(n-1, m) + Combi(n-1, m-1);
	}
	
	public int sol(int n) {
		//콤비네이션 만드렁야함
		//m <= n/2 
		// n-mCm
		int answer = 0;
		for(int m = 0; m <= n/2; m++) {
			// m = 2의 개수 
			//2가 0개 일 때 
			//nC0
			answer += Combi(n-m, m);
		}
		return answer;
	}
	
	public static void main(String[] args) {
    	ClimbingStairs main = new ClimbingStairs();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		arr = new int[n];
		ch = new int[n+1][n+1];
		System.out.println(main.sol(n));
	}
}
