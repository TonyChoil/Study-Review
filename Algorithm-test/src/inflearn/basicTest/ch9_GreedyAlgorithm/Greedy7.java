package inflearn.basicTest.ch9_GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Root implements Comparable<Root>{
	int city;
	int route;
	int cost;
	
	public Root(int city, int route, int cost) {
		this.city = city;
		this.route = route;
		this.cost = cost;
	}

	@Override
	public int compareTo(Root o) {
		return this.cost - o.cost;
	}
}
public class Greedy7 {
	static int[] arr;
	static int answer = 0;
	
	public int find(int a) {
		if(arr[a] == a) return a;
		else return arr[a] = find(arr[a]);
	}
	
	public void union(int a, int b) {
		int fa = find(a);
		int fb = find(b);
		if(fa != fb) arr[fa] = fb;
	}
	
	public static void main(String[] args) {
		Greedy7 main = new Greedy7();
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();
		int E = sc.nextInt();
		arr = new int[V+1];
		List<Root> graph = new ArrayList<>();
		for(int i = 1; i <= V; i++) arr[i] = i;
		for(int i = 0; i < E; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			graph.add(new Root(A, B, C));
		}
		Collections.sort(graph);
		for(Root ed : graph) {
			if(main.find(ed.city) != main.find(ed.route)) {
				main.union(ed.city, ed.route);
				answer += ed.cost;
			}
		}
//		for(int i = 1; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
		System.out.println(answer);
	}
}
