package inflearn.basicTest.ch10_Dynamic_Programming;

import java.util.Scanner;

public class Dy3 {
	static int[] arr;
	
	public int sol() {
		int answer = 0;
		int[] dy = new int[arr.length];
		dy[0] = 1;
		for(int i = 0; i < arr.length; i++) {
			int k = arr[i];
			int max = 0;
			for(int j = i-1; j >= 0; j--) {
				if(arr[j] < k && dy[j]>max) max = dy[j];
			}
			dy[i] = max+1;
			answer = Math.max(answer, dy[i]);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Dy3 main = new Dy3();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(main.sol());
	}
}
