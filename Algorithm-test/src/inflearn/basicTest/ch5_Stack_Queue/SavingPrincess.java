package inflearn.basicTest.ch5_Stack_Queue;

import java.util.ArrayList;
import java.util.Scanner;

public class SavingPrincess {

    public int solution(int a, int b) {
        int answer = 0;
        ArrayList<Integer> array = new ArrayList();
        for(int i = 1; i <= a; i++){
            array.add(i);
        }
        int cnt = 1;
        int index = 0;
        while(array.size() != 1){
            cnt++;
            index++;
            if(index == array.size()) index = 0;
            if(cnt % b == 0){
                array.remove(index);
                index--;
            }
        }

        answer = array.get(0);

        return answer;
    }

    public static void main(String[] args) {
        SavingPrincess main = new SavingPrincess();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(main.solution(a, b));
    }
}
