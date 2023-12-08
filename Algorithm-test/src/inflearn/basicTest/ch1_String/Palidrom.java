package inflearn.basicTest.ch1_String;

import java.util.Scanner;

public class Palidrom {

public String solution(String str) {
    String answer = "NO";
    str = str.toUpperCase().replaceAll("[^A-Z]", "");
    String tmp = new StringBuilder(str).reverse().toString();
    if(str.equals(tmp)) answer = "YES";
    return answer;
}

//    public String solution(String str) {
//        String answer = "";
//        StringBuilder strbd = new StringBuilder();
//
//        for(int i = 0; i < str.length(); i++){
//
//            if(Character.isAlphabetic(str.charAt(i))){
//
//                strbd.append(str.charAt(i));
//            }
//        }
//        if(strbd.toString().equalsIgnoreCase((strbd.reverse().toString()))){
//            answer = "YES";
//        }
//        else answer = "NO";
//
//        return answer;
//    }

    public static void main(String[] args) {
        Palidrom main = new Palidrom();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(main.solution(str));
    }
}
