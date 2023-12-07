package inflearn.basicTest.ch1_String;

import java.util.Scanner;

public class WordInSentence {
//    public String solution(String str){
//        String answer = "";
//        int m=Integer.MIN_VALUE;
//        String[] s =  str.split(" ");
//        for(String x : s){
//            int len = x.length();
//            if(len>m){
//                m=len;
//                answer = x;
//            }
//        }
//
//        return answer;
//    }

//    public String Solution(String str){
//
//        StringTokenizer stoken = new StringTokenizer(str, " ");
//        String answer = "";
//
//        while(stoken.hasMoreTokens()){
//
//            String str2 = stoken.nextToken();
//            if(str2.length() > answer.length()) answer = str2;
//        }
//
//        return str;
//    }

    public String solution(String str){
        String answer = "";
        int m=Integer.MIN_VALUE, pos;
        while((pos=str.indexOf(' ')) != -1){

            String s = str.substring(0, pos);
            int len = s.length();
            if(len > m) {
                m = len;
                answer = s;
            }
            str = str.substring(pos+1);
        }

        if(str.length() > m) answer = str;
        return answer;
    }


    public static void main(String[] args){

        WordInSentence main = new WordInSentence();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(main.solution(str));
    }
}
