package inflearn.basicTest.ch1_String;

import java.util.Scanner;

public class FlipSpecificWord {
    //    public String solution(String str) {
//        char[] ch = str.toCharArray();
//        int small = 0;
//        int large = ch.length - 1;
//        while (small < large) {
//            if ((ch[small] >= 'A' && ch[small] <= 'z') && (ch[large] >= 'A' && ch[large] <= 'z')) {
//                char tmp;
//                tmp = ch[small];
//                ch[small] = ch[large];
//                ch[large] = tmp;
//            }
//            small++;
//            large--;
//        }
//        String answer = String.valueOf(ch);
//        return answer;
//    }
public String solution(String str) {
    String answer;
    char[] ch = str.toCharArray();
    int small = 0, large = str.length() - 1;
    while (small < large) {
        if (!Character.isAlphabetic(ch[small])) small++;
        else if (!Character.isAlphabetic(ch[large])) large--;
        else {
            char tmp = ch[small];
            ch[small] = ch[large];
            ch[large] = tmp;
            small++;
            large--;
        }
    }
    answer = String.valueOf(ch);
    return answer;
}

    public static void main(String[] args) {
        FlipSpecificWord main = new FlipSpecificWord();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(main.solution(str));
    }
}
