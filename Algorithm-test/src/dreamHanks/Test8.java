package dreamHanks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Info implements Comparable<Info>{
	int height;
	int weight;
	
	public Info(int height, int weight) {
		super();
		this.height = height;
		this.weight = weight;
	}

	@Override
	public int compareTo(Info o) {
		return o.height - this.height;
	}
}

public class Test8 {
	static ArrayList<Info> info = new ArrayList<>();
	
	public int sol(int n) {
		int answer = 0;
		int max = 0;
		for(int i = 0; i < n; i++) {
			int w = info.get(i).weight;
			if(w > max) {
				max = w;
				answer++;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Test8 main = new Test8();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			info.add(new Info(h, w));
		} //키로 먼저 정렬
		Collections.sort(info);
		System.out.println(main.sol(n));
	}
}
