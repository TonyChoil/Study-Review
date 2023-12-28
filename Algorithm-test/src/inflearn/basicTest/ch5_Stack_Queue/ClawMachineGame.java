package inflearn.basicTest.ch5_Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class ClawMachineGame {

    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        // for문 b번만큼 돌면서, board[a번][moves[i]]
        for(int line : moves){
            for(int i = 0; i < board.length; i++){
                if(board[i][line-1] != 0){
                    int tmp = board[i][line-1];
                    board[i][line-1] = 0;
                    if(!stack.isEmpty() && stack.peek() == tmp) {
                        answer += 2;
                        stack.pop();
                    }
                    else stack.push(tmp);
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        ClawMachineGame main = new ClawMachineGame();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[][] board = new int[a][a];
        for(int i=0; i<a; i++){
            for(int j=0; j<a; j++){
                board[i][j] = sc.nextInt();
            }
        }
        int b = sc.nextInt();
        int[] moves = new int[b];
        for(int i=0; i<b; i++){
            moves[i] = sc.nextInt();
        }
        System.out.print(main.solution(board, moves));
    }
}
