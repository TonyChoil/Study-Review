package inflearn.basicTest;

import java.util.Scanner;

class Main {
    public int solution(String str, char c){

        int count = 0;
        c = Character.toLowerCase(c);
        for(char x : str.toLowerCase().toCharArray()){

            if(x == c ) count++;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char c = sc.next().charAt(0);

        Main T = new Main();

        System.out.println(T.solution(str, c));
    }
}
