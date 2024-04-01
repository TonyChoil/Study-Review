package inflearn.basicTest.ch10_Dynamic_Programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Brick implements Comparable<Brick>{
	int area;
	int height;
	int weight;
	
	public Brick(int area, int height, int weight) {
		this.area = area;
		this.height = height;
		this.weight = weight;
	}

	@Override
	public int compareTo(Brick o) {
		return o.area - this.area;
	}

	@Override
	public String toString() {
		return "Brick [area=" + area + ", height=" + height + ", weight=" + weight + "]";
	}
	
}

public class Dy4 {
	
	public int sol(List<Brick> bricks) {
		int answer = 0;
		int[] dy = new int[bricks.size()];
		dy[0] = bricks.get(0).height;
		answer = dy[0];

		for(int i = 1; i < bricks.size(); i++) {
			Brick br = bricks.get(i);
			int max = 0;
			for(int j = i-1; j >= 0; j--) {
				Brick tmp = bricks.get(j);
				if(br.weight < tmp.weight && dy[j] > max) {
					max = dy[j];
				}
			}
			dy[i] = max + br.height;
			if(dy[i] > answer) answer = dy[i];
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Dy4 main = new Dy4();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Brick> bricks = new ArrayList<>();
		for(int i =0; i < n; i++) {
			int a = sc.nextInt();
			int h = sc.nextInt();
			int w = sc.nextInt();
			bricks.add(new Brick(a, h, w));
		}
		Collections.sort(bricks);
		System.out.println(main.sol(bricks));
		/*
		 * [Brick [area=25, height=3, weight=4], Brick [area=16, height=2, weight=5], Brick [area=9, height=2, weight=3]
		 * , Brick [area=4, height=4, weight=6], Brick [area=1, height=5, weight=2]]
		 * 차례대로 선택하면서 weight 
		 * */
		
	}
}