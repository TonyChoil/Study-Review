package inflearn.basicTest.ch8_ApplyingDFSandBFS;

import java.util.ArrayList;
import java.util.Scanner;


public class Pizza { 
	static ArrayList<Point> houses, stores;
	static int[] combi;
	static int answer = Integer.MAX_VALUE;
	
	
	public void DFS(int L, int s, int m) {
		if(L == m) {
			//조합된 수와 각 집의 거리의 총량을 구해서, 최소값을 출력해준다.
			//선택된 각 피자집마다, 각 집의 거리가 존재함. 
			int sum = 0;
			for(Point house : houses) {
				int dis = Integer.MAX_VALUE;
				for(int p : combi) {
					Point store = stores.get(p);
					dis = Math.min(dis, Math.abs(house.x - store.x) + Math.abs(house.y - store.y));
				}
				sum += dis;
			}
			answer = Math.min(sum, answer);
		}else {
			for(int i = s; i < stores.size(); i++) {
				combi[L] = i;
				DFS(L+1, i+1, m);
			}
		}
	}
	
	public static void main(String[] args) {
		
		Pizza T = new Pizza();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		stores = new ArrayList<>();
		houses = new ArrayList<>();
		combi = new int[m];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				int k = sc.nextInt();
				if(k == 1) houses.add(new Point(i, j));
				else if(k == 2) stores.add(new Point(i, j));
			}
		}
		T.DFS(0, 0, m);
		System.out.println(answer);
	}
}
