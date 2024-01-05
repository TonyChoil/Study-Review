package inflearn.basicTest.ch6_SortingAndSearching;

import java.util.Scanner;

public class LRU {

//    public List<Integer> solution(int size, int num, int[] arr) {
//        List<Integer> answer = new LinkedList<>();
//        for(int i = 0; i < num; i++){
//            for(int j = 0; j < answer.size(); j++){
//                if(arr[i] == answer.get(j)) answer.remove(j);
//            }
//            answer.add(0, arr[i]);
//            if(answer.size() == size+1) answer.remove(size);
//        }
//
//        return answer;
//    }

    public int[] solution(int size, int num, int[] arr) {
        int[] answer = new int[size];
        for (int i : arr) {
            int index = -1;
            for (int j = 0; j < answer.length; j++) {
                // 이미 cash에 있는 경우
                if (arr[i] == answer[j]) index = j;
            }
            //cash에 없는 경우
            if (index != -1) {
                //j앞에를 j까지 다 밀고 0번인덱스에 arr[i]를 넣어줌
                for (int k = index; k >= 1; k--) {
                    answer[k] = answer[k - 1];
                }
            } else {
                for (int k = answer.length - 1; k >= 1; k--) {
                    answer[k] = answer[k - 1];
                }
            }
            answer[0] = arr[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        LRU main = new LRU();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i : main.solution(size, num, arr)) {
            System.out.print(i + " ");
        }
    }
}
