package inflearn.basicTest.ch1_String;

import java.util.Scanner;

public class MininumDistance {

//public void solution(String str, char ch) {
//    int[] intList  = new int[str.length()];
//    int distance = 1000;
//    for(int i = 0; i < str.length(); i++){
//        if(str.charAt(i) == ch){
//            distance = 0;
//        } else distance++;
//        intList[i] = distance;
//    }
//    distance = 1000;
//    for(int i = str.length() - 1; i >= 0; i--){
//        if(str.charAt(i) == ch)distance = 0;
//        else{
//            distance++;
//            intList[i] = Math.min(intList[i], distance);
//        }
//    }
//}

    public void solution(String str, char ch){
        int[] answer = new int[str.length()];
        int distance = 1000;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ch) distance = 0;
            else distance++;
            answer[i] = distance;
        }
        distance = 1000;

        for(int i = str.length() - 1; i >= 0; i--){
            if(str.charAt(i) == ch) distance = 0;
            else{
                distance++;
                answer[i] = Math.min(answer[i], distance);
            }
        }
        //참고:int배열[]은 처음 만들 때부터 방의 크기를 명시해야 한다.
        for(int i : answer){
            System.out.print(i + " ");
        }
    }


    public static void main(String[] args) {
        MininumDistance main = new MininumDistance();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.next().charAt(0);
        main.solution(str, ch);
    }
}
