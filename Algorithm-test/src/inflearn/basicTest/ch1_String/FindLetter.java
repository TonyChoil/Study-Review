package inflearn.basicTest.ch1_String;

import java.util.Scanner;

/**
 * 설명
 *
 * 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
 *
 * 대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.
 *
 *
 * 입력
 * 첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.
 *
 * 문자열은 영어 알파벳으로만 구성되어 있습니다.
 *
 *
 * 출력
 * 첫 줄에 해당 문자의 개수를 출력한다.
 */
class FindLetter {
    public int solution(String input, char letter){

        int count = 0;
        for(int i = 0; i < input.length(); i++){

            if(input.charAt(i) == letter){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char letter = sc.nextLine().charAt(0);

        FindLetter fn = new FindLetter();

        System.out.println(fn.solution(input, letter));
    }
}


 /*
    공부하는 방법
1️ 영상을 보기 전에 먼저 문제를 풀어보세요.

2️ 한 문제당 최소 20분은 스스로 연구해본 다음 영상을 시청합니다.

3️ 문제를 연구할 때는 펜과 종이로 그림을 그려보고 표도 그려보면서 연구해야 합니다.

4️ 펜으로 종이에 연구하는 게 매우 중요합니다. 이때 문제 해결력이 생깁니다.

5️ 20분이 지나도 해결이 되지 않는다면 영상을 시청하고, 익숙해질 때까지 반복 연습해야 합니다.
* */