package inflearn.basicTest.ch10_Dynamic_Programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Q{
	int score;
	int time;
	public Q(int score, int time) {
		this.score = score;
		this.time = time;
	}
}

public class Dy6 {
	static int[] dy;
	static List<Q> arr;
	
	public int sol() {
		for(Q q : arr) {
			for(int i = dy.length-1; i>=q.time; i--) {
				dy[i] = Math.max(dy[i], dy[i-q.time] + q.score);
			}
		}
		return dy[dy.length-1];
	}
	
	public static void main(String[] args) {
		Dy6 main = new Dy6();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		arr = new ArrayList<>();
		for(int i = 0; i<n;i++) {
			int s = sc.nextInt();
			int t = sc.nextInt();
			arr.add(new Q(s ,t));
		}
		dy = new int[m+1];
		System.out.println(main.sol());
	}
}
