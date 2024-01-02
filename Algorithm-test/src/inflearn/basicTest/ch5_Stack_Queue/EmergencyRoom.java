package inflearn.basicTest.ch5_Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person{
    int id;
    int priority;

    Person(int id, int priority){
        this.id = id;
        this. priority = priority;
    }
}
public class EmergencyRoom {

    public int solution(int num, int nth, int[] line) {
        int answer = 0;
        Queue<Person> Q = new LinkedList();
        for(int i = 0; i < num; i++){
            Q.offer(new Person(i, line[i]));
        }
        while(!Q.isEmpty()){
            Person tmp = Q.poll();
            // 더 높은 우선환자있을 경우
            for(Person p : Q){
                if(tmp.priority < p.priority){
                    Q.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            // 없을 경우
            if(tmp != null) {
                answer++;
                if(tmp.id == nth) return answer;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        EmergencyRoom main = new EmergencyRoom();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int nth = sc.nextInt();
        int[] line = new int[num];
        for(int i = 0; i < num; i++){
            line[i] = sc.nextInt();
        }
        System.out.print(main.solution(num, nth, line));
    }
}
