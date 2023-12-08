package inflearn.basicTest.ch1_String;

import java.util.Scanner;

public class RemoveSameLetter {

public String solution(String str) {
    String answer = "";
    char[] ch = str.toCharArray();
    for(char c : ch){
        if(!answer.contains(String.valueOf(c))) answer += c;
    }

    return answer;
}

//    public String solution(String str) {
//    String answer = "";
//    for(int i = 0; i < str.length(); i++){
////        System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));
//        if(i == str.indexOf(str.charAt(i))) answer += str.charAt(i);
//
//        }
//
//    return answer;
//}

    public static void main(String[] args) {
        RemoveSameLetter removeSameLetter = new RemoveSameLetter();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(removeSameLetter.solution(str));
    }
}
