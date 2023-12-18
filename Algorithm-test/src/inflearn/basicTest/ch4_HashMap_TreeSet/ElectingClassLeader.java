package inflearn.basicTest.ch4_HashMap_TreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class ElectingClassLeader {

//    public char solution(int n, String str) {
//        char answer=' ';
//        HashMap<Character, Integer> hsMap = new HashMap();
//        for(char x : str.toCharArray()){
//            hsMap.put(x, hsMap.getOrDefault(x,0)+1);
//        }
//        int max = 0;
//        for(char key : hsMap.keySet()){
//            if(hsMap.get(key)>max){
//                max = hsMap.get(key);
//                answer = key;
//            }
//        }
//
//        return answer;
//    }

    public char solution(int n, String str) {
        char answer=' ';
        HashMap<Character, Integer> hsMap = new HashMap();
        for(char x : str.toCharArray()){
            hsMap.put(x, hsMap.getOrDefault(x,0)+1);
        }
        System.out.println(hsMap.size());
        System.out.println(hsMap.containsKey('A'));
        int max = 0;
        for(char key : hsMap.keySet()){
            if(hsMap.get(key)>max){
                max = hsMap.get(key);
                answer = key;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        ElectingClassLeader main = new ElectingClassLeader();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.print(main.solution(n, str));
    }

}
