package inflearn.basicTest.ch9_GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Meeting implements Comparable<Meeting>{
	int start, end;

	public Meeting(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public int compareTo(Meeting o) {
		if(this.end == o.end) return this.start - o.start;
		return this.end - o.end; //오름차순
	}

	@Override
	public String toString() {
		return "Meeting [start=" + start + ", end=" + end + "]";
	}
	
	
}

public class Greedy2 {
	
	public int Solution(ArrayList<Meeting> arr) {
		int answer = 0;
		int endTime = 0;
		for(int i = 0; i < arr.size(); i++) {
			if(arr.get(i).start >= endTime) {
				answer++;
				endTime = arr.get(i).end;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
        Greedy2 main = new Greedy2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Meeting> arr = new ArrayList<>();
        for(int i = 0; i < n; i++) {
        	int a = sc.nextInt();
        	int b = sc.nextInt();
        	arr.add(new Meeting(a, b));
        }
        Collections.sort(arr);
        System.out.println(main.Solution(arr));
	}
}
