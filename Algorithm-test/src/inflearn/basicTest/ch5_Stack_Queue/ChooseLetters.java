package inflearn.basicTest.ch5_Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class ChooseLetters {

    //    public String solution(String str) {
//        String answer = "";
//        // ( push ) pop stack이 empty일때 문자을 넣어준다.
//        Stack stack = new Stack();
//        for(char x : str.toCharArray()){
//            if(x == '(') stack.push(x);
//            else if(x == ')') stack.pop();
//            else{
//                if(stack.isEmpty()) answer += x;
//            }
//        }
//
//        return answer;
//    }
    public String solution(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for(char x : str.toCharArray()){
            if(x ==')') {
                while(stack.pop() != '(');
            }
            else stack.push(x);
        }
        for(int i=0; i<4; i++){
            answer += stack.pop();
        }
        return answer;
    }

    public static void main(String[] args) {
        ChooseLetters main = new ChooseLetters();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(main.solution(str));
    }
}
