package inflearn.basicTest.ch7_Resursive_Tree_Graph;

import java.util.*;

public class BFS4 {
    static int n, m;
    static int[][] graph;
    static int[] ch;

    public void BFS(int v) {
        Queue<Integer> Q = new LinkedList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int L = 0;
        Q.offer(v);
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                int tmp = Q.poll();
                for (int j = 1; j <= n; j++) {
                    if (graph[tmp][j] != 0 && ch[j] == 0) {
                        ch[j] = 1;
                        map.put(j, L+1);
                        Q.offer(j);
                    }
                }
            }
            L++;
        }
        System.out.println(map);
        for(int k : map.keySet()){
            System.out.println(k + " : " + map.get(k));
        }
    }

    public static void main(String[] args) {
        BFS4 T = new BFS4();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new int[n+1][n+1];
        ch = new int[n+1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
        }
        ch[1] = 1;
        T.BFS(1);
    }
}