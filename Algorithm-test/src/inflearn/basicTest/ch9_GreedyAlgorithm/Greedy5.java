package inflearn.basicTest.ch9_GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Edge implements Comparable<Edge>{
	int vex;
	int cost;
	public Edge(int vex, int cost) {
		this.vex = vex;
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Edge [vex=" + vex + ", cost=" + cost + "]";
	}
	@Override
	public int compareTo(Edge o) {
		return this.cost - o.cost;
	}
	
}
public class Greedy5 {
	
	public void sol(ArrayList<ArrayList<Edge>> graph, int[] answer) {
		// pQ에서 빼야 할 정보 : 가중치가장낮은것 + 
		PriorityQueue<Edge> pQ = new PriorityQueue<>();
		pQ.offer(new Edge(1, 0));
		int cnt = 0;
		while(!pQ.isEmpty()) {
			Edge tmp = pQ.poll();
			int now = tmp.vex;
			int cost = tmp.cost;
			ArrayList<Edge> arr = graph.get(now);
			if(answer[now] < cost) continue;
			for(Edge eg : arr) {
				System.out.println(cnt++);
				//현재 cost랑 new cost를 더했을 때 최소값을 뽑아야함.
				if(cost + eg.cost < answer[eg.vex]) {
					answer[eg.vex] = cost + eg.cost;
					pQ.offer(new Edge(eg.vex, cost+eg.cost));
				}
			}
		}
		for(int i = 2; i < answer.length; i++) {
			if(answer[i] == Integer.MAX_VALUE) {
				System.out.println(i + " : impossible");
			}else System.out.println(i + " : " + answer[i]);
		}

	}
	
	public static void main(String[] args) {
		Greedy5 main = new Greedy5();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
		int[] answer = new int[n+1];
 		for(int i = 2; i <= n; i++) {
			answer[i] = Integer.MAX_VALUE;
		}
		for(int i = 0; i <= n; i++) {
			graph.add(new ArrayList<Edge>());
		}
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			graph.get(a).add(new Edge(b, c));
		}
		main.sol(graph, answer);
	}

}
