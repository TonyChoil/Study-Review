package inflearn.basicTest.ch10_Dynamic_Programming;

import java.util.Scanner;

public class Dy2 {
	static int[] dy;
	public int sol(int n) {
		dy[1] = 2;
		dy[2] = 3;
		for(int i =3; i <=n; i++) {
			dy[i] = dy[i-1] + dy[i-2];
		}
		return dy[n];
	}
	
	public static void main(String[] args) {
		Dy2 main = new Dy2();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		dy = new int[n+1];
		System.out.println(main.sol(n));
	}
}
