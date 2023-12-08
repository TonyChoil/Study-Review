package inflearn.basicTest.ch1_String;

import java.util.Scanner;

public class SymmetricString {

//public String solution(String str) {
//    String answer = "";
//    str = str.toUpperCase();
//    String strReverse = new StringBuilder(str).reverse().toString();
//    if(str.equalsIgnoreCase(strReverse)) answer = "YES";
//    else answer = "NO";
//
//
//    return answer;
//}

        public String solution(String str) {
        String answer = "YES";
        str = str.toUpperCase();
        for(int i = 0; i < str.length()/2; i++){
            if(!(str.charAt(i) == str.charAt(str.length()-1-i))) answer = "NO";
        }


        return answer;
    }

    public static void main(String[] args) {
        SymmetricString main = new SymmetricString();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
//        main.solution(str);
        System.out.println(main.solution(str));
    }
}
