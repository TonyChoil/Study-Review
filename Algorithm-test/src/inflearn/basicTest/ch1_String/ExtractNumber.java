package inflearn.basicTest.ch1_String;

import java.util.Scanner;

public class ExtractNumber {

public int solution(String str) {
    str = str.replaceAll("[^0-9]", "");
//    System.out.println(str);


    return Integer.parseInt(str);
}
//public int solution(String str) {
//    int answer = 0;
//    for(int i = 0; i < str.length(); i++){
//
//        if(str.charAt(i) <= '9' && str.charAt(i) >= '0')
//        answer = answer * 10 + (str.charAt(i) - '0');
//    }
//
//    return answer;
//}

//public int solution(String str) {
//    String answer = "";
//    for(char ch : str.toCharArray()){
//        if(Character.isDigit(ch)) answer+=ch;
//    }
//
//
//
//    return Integer.parseInt(answer);
//}
    public static void main(String[] args) {
        ExtractNumber main = new ExtractNumber();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(main.solution(str));
    }
}
