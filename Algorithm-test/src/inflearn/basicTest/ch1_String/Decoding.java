package inflearn.basicTest.ch1_String;

import java.util.Scanner;

public class Decoding {

//public String solution(String str, int num) {
//    /*
//    str -> 2진수화 -> 10진수 화 -> answer에 입력
//    * */
//    String answer = "";
//    for(int i = 0; i < num; i++){
//        String encryptedLetter = str.substring(i*7, (1+i)*7);
//        String binaryInt = "";
//        for(int j = 0; j < 7; j++){
//            if(encryptedLetter.charAt(j) == '#') binaryInt += "1";
//            else binaryInt += "0";
//        }
//        int decimalLetter = Integer.parseInt(binaryInt, 2);
//        answer += (char)decimalLetter;
//    }
//
//    return answer;
//}

    public String solution(String str, int num){

        String answer ="";
        for(int i = 0; i < num; i++){
            String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
            int decimal = Integer.parseInt(tmp, 2);
            answer += (char)decimal;
            System.out.println(decimal);
            str = str.substring(7);
        }
        return answer;
    }

    public static void main(String[] args) {
        Decoding main = new Decoding();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = sc.next();
        System.out.println(main.solution(str, num));
    }
}
