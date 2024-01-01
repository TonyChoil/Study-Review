package inflearn.basicTest.ch5_Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Postfix {

    public int solution(String str) {
        Stack<Integer> stack = new Stack();

        for(char c : str.toCharArray()){
            if(Character.isDigit(c)){
                stack.push(c-'0');
            } else{
                int a = stack.pop();
                int b = stack.pop();
                switch (c){
                    case '+' : stack.push(b + a); break;
                    case '-' : stack.push(b - a); break;
                    case '*' : stack.push(b * a); break;
                    case '/' : stack.push(b / a); break;
                }
            }
        }


        return stack.pop();
    }

    public static void main(String[] args) {
        Postfix main = new Postfix();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(main.solution(str));
    }
}
