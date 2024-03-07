package dreamHanks;

import java.util.Scanner;

public class Test5_gcd_lcm {

	public static int gcd(int a, int b) {

		while(true) {
			a = a%b;
			if(a == 0) break;
			int tmp = a;
			a = b;
			b = tmp;
		}
		return b;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("数字１入力");
		int a = sc.nextInt();
		System.out.println("数字２入力");
		int b = sc.nextInt();
		
		int gcd = gcd(a, b);
		System.out.println("最大公約数 : " + gcd);
		System.out.println("最少公倍数 : " + (a*b)/gcd);
	}
}
