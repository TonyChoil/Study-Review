package inflearn.basicTest.ch8_ApplyingDFSandBFS;

import java.util.ArrayList;
import java.util.Scanner;

class Point2{
	int x, y;

	public Point2(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point2 [x=" + x + ", y=" + y + "]";
	}
	
}

class Main {
	static ArrayList<Point2> house, store;
	static int[] combi;
	static int answer = Integer.MAX_VALUE;
	
	public void DFS(int i, int m, int L) {
		if(L == m) {
			int sum = 0;
			for(Point2 houses : house) {
				int dis = Integer.MAX_VALUE;
				for(int k = 0; k < m; k++) {
					Point2 stores = store.get(combi[k]);
					int x = Math.abs(houses.x - stores.x);
					int y = Math.abs(houses.y - stores.y);
					dis = Math.min(dis, x+y);
				}
				sum += dis;
			}
			answer = Math.min(answer, sum);
		}else {
			for(int j = i; j < store.size(); j++) {
					combi[L] = j;
					DFS(j+1, m, L+1);
			}
		}
		//m개만큼 선택해서, 각각 피자배달거리를 다 반복문으로 돌려서 구해야함.
		//우선 피자집에서 m개를 선택하는 알고리즘이 필요.
		//2.선택해서 각 집마다 거리를 구해서 최소거리로 변경해서 다 더해야함.
		//store.size에서 m개를 선택하는 콤비 dfs
		
		
	}
	
	public static void main(String[] args) {
		
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		house = new ArrayList<>();
		store = new ArrayList<>();
		combi = new int[m];
		// 좌표만 저장해서 서로 비교
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				int k = sc.nextInt();
				if(k == 1) house.add(new Point2(i, j));
				else if(k == 2) store.add(new Point2(i, j));
			}
		}
		
		main.DFS(0, m, 0); 
		System.out.println(answer);
	}

}
