package inflearn.basicTest.ch5_Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class CorrectParenthesis {

    public String solution(String str) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for(char x : str.toCharArray()){
            if(x =='(') stack.push(x);
            else{
                if(stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        if(!stack.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args) {
        CorrectParenthesis main = new CorrectParenthesis();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(main.solution(str));
    }
}
