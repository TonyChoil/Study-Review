package inflearn.basicTest.ch1_String;

import java.util.Scanner;

public class CompressingString {
    public String solution(String s){
        String answer="";
        s=s+" ";
        int cnt=1;
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i)==s.charAt(i+1)) cnt++;
            else{
                answer+=s.charAt(i);
                if(cnt>1) answer+=cnt;
                cnt=1;
            }
        }
        return answer;
    }
//public String solution(String str) {
//    String answer = "";
//    /*
//    반복을 나타내는 int repeat를 만들어서
//    옆이 같으면 ++를 해주고 계속하고,
//    다르면 1로 초기화 시킨다.
//    1로 초기화 시키는 시점에서 answer에 해당 문자를 넣어준다.
//    * */
//    int repeat = 1;
//    for(int i =0; i < str.length(); i++){
//        if(i != str.length() -1 && str.charAt(i) == str.charAt(i+1)) repeat++;
//        else if(repeat != 1){
//            answer = answer + str.charAt(i) + repeat;
//            // 이거 연산자 순서가,, String + char + char 하면 char도 String화 되지만
//            // String += char + char 하면 char+char이 먼저 일어나기 때문에 둘이 아스킷코들 합쳐지고
//            // String에 추가가 된다.
//            repeat = 1;
//        } else{
//            answer += str.charAt(i);
//        }
//        //KKHSSSSSSSE
//    }
//
//    return answer;
//}

    public static void main(String[] args) {
        CompressingString main = new CompressingString();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(main.solution(str));
    }
}
