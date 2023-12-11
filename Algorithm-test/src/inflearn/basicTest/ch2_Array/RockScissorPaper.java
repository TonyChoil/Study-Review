package inflearn.basicTest.ch2_Array;

import java.util.Scanner;

public class RockScissorPaper {

public char[] solution(int n, int[] a, int[] b) {
    char[] answer = new char[n];
    for (int i = 0; i < n; i++) {
        if (a[i] == b[i]) answer[i] = 'D';
        else if (a[i] == 1 && b[i] == 3) answer[i] = 'A';
        else if (a[i] == 2 && b[i] == 1) answer[i] = 'A';
        else if (a[i] == 3 && b[i] == 2) answer[i] = 'A';
        else answer[i] = 'B';
    }
        return answer;
}

    public static void main(String[] args) {
        RockScissorPaper main = new RockScissorPaper();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 게임횟수
        int[] a = new int[n];
        int[] b = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            b[i] = sc.nextInt();
        }
        for(char ch : (main.solution(n, a, b))) {
            System.out.println(ch);
        }
    }
}
