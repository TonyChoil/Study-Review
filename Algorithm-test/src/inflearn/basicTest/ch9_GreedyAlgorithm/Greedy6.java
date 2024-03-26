package inflearn.basicTest.ch9_GreedyAlgorithm;

import java.util.Scanner;

public class Greedy6 {
	static int[] arr;
	public int Find(int v) {
		if(arr[v] == v) return v;
		else return arr[v] = Find(arr[v]);
	}
	
	public void Union(int a, int b) {
		int c = Find(a); // a의 최상위층까지감
		int d = Find(b); // b의 최상위층까지 감
		if(c != d) arr[c] = d;
	}
	
	public static void main(String[] args) {
		Greedy6 main = new Greedy6();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		arr = new int[n+1];
		for(int i = 1; i <= n; i++) arr[i] = i;
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			main.Union(a, b);
		}

		int a = sc.nextInt();
		int b = sc.nextInt();
		if(main.Find(a) != main.Find(b)) System.out.println("NO");
		else System.out.println("YES");
	}
}
