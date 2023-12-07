package inflearn.basicTest.ch1_String;

import java.util.ArrayList;
import java.util.Scanner;

public class wordReverse {

    static Scanner sc = new Scanner(System.in);



//    public ArrayList<String> solutions(String[] str) {
//
//        ArrayList<String> answer = new ArrayList<>();
//        for (String word : str) {
//            String tmp = new StringBuilder(word).reverse().toString();
//            answer.add(tmp);
//
//        }
//        return answer;
//    }

    public ArrayList<String> solutions(String[] str) {

        ArrayList<String> answer = new ArrayList<>();
        for (String word : str) {
            char[] chArray = word.toCharArray();
            int sIndex = 0, lIndex = word.length() - 1;
            while (sIndex < lIndex) {
                char tmp = chArray[sIndex];
                chArray[sIndex] = chArray[lIndex];
                chArray[lIndex] = tmp;

                sIndex++;
                lIndex--;
            }
            answer.add(String.valueOf(chArray));
        }

        return answer;
    }



    public static void main(String[] args) {


        wordReverse main = new wordReverse();
        int num = sc.nextInt();
        String[] str = new String[num];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }

        for (String x : main.solutions(str)) {
            System.out.println(x);
        }

    }
}
