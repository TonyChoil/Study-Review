package inflearn.basicTest.ch1_String;

import java.util.Scanner;

public class FlipWords {

    public String solution(String str){

        char[] ch = str.toCharArray();
        int small = 0;
        int large = ch.length -1;

        while(small < large){

            if((ch[small] > 'A' && ch[small] < 'z') && (ch[large] > 'A' && ch[large]  < 'z' )){

                char tmp;
                tmp = ch[small];
                ch[small] = ch[large];
                ch[large] = tmp;

            }

            small++;
            large--;
        }

        String answer = String.valueOf(ch);



        return answer;
    }

    public static void main(String[] args) {

        FlipWords main = new FlipWords();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(main.solution(str));
    }
}
