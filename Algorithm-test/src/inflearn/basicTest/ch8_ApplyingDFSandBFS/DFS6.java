package inflearn.basicTest.ch8_ApplyingDFSandBFS;

import java.util.ArrayList;
import java.util.Scanner;

public class DFS6 {
    static int m, n;
    static int[] arr;

    public void DFS(ArrayList<Integer> list) {
        if (list.size() == m) {
            System.out.println(list);
        } else {
            for (int i = 0; i < n; i++) {
                if (!list.contains(arr[i])) {
                    list.add(arr[i]);
                    DFS(new ArrayList<>(list));
                    list.remove(list.size() - 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        DFS6 T = new DFS6();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        T.DFS(new ArrayList<Integer>());
    }
}
