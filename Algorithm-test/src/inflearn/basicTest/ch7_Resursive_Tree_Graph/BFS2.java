package inflearn.basicTest.ch7_Resursive_Tree_Graph;

import java.util.*;

public class BFS2 {
    int[] dis = {1, -1, 5};
    public int BFS(int a, int b) {
        long startTimeMillis = System.currentTimeMillis();
        int answer = 0;
        int[] ch = new int[2000000];
        Queue<Integer> Q = new LinkedList<>();
        Q.offer(a);
        while(!Q.isEmpty()){
            int len = Q.size();
            int tmp;
            for(int i = 0; i < len; i++){
                tmp = Q.poll();
                if(tmp == b) { // 168
                    long endTimeMillis = System.currentTimeMillis();
                    long time = (endTimeMillis - startTimeMillis);
                    System.out.println("time : " + time);
                    return answer;
                }
                for(int j = 0; j < 3; j++){
                    int nx = tmp+dis[j];
                    if(nx >= 1 && nx <= 2000000 && ch[nx] == 0){
                        ch[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
            answer++;
        }

        return answer;
    }

    // 3개 떨어져있을 때 -> +5 -1 -1  / +1 +1 +1 . 즉 , 4개 이상은 +5, 2이하는 +1이 빠름.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        BFS2 main = new BFS2();
        System.out.println(main.BFS(a, b));
    }
}
