package inflearn.basicTest.ch9_GreedyAlgorithm;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

class Edge implements Comparable<Edge>{
	int v;
	int cost;
	
	public Edge(int v, int cost) {
		this.v = v;
		this.cost = cost;
	}

	@Override
	public int compareTo(Edge o) {
		return this.cost - o.cost;
	}
}

public class Greedy8 {
	static int[] ch;
	static ArrayList<ArrayList<Edge>> graph;
	
    public int solution() {
    	PriorityQueue<Edge> pQ = new PriorityQueue<>();
    	pQ.offer(new Edge(1, 0));
    	int answer = 0;
    	while(!pQ.isEmpty()) {
    		Edge tmp = pQ.poll();
    		if(ch[tmp.v] == 0) {
    			ch[tmp.v] = 1;
    			answer += tmp.cost;
        		for(Edge eg : graph.get(tmp.v)) {
        			if(ch[eg.v] == 0) {
        				pQ.offer(eg);
        			}
        		}
    		}
    	}
    	return answer;
    }

    public static void main(String[] args) {
    	Greedy8 main = new Greedy8();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		ch = new int[n+1];
		graph = new ArrayList<>();
		for(int i = 0; i <= n; i++) {
			graph.add(new ArrayList<Edge>());
		}
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			graph.get(a).add(new Edge(b,c));
			graph.get(b).add(new Edge(a,c));
		}
		System.out.println(main.solution());
    }
}
