package dreamHanks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public int sol(ArrayList<Lecture> arr, int max) {
		int answer = 0;
		Collections.sort(arr);
		
		PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
		int j = 0;
		for(int i = max; i>= 1; i--) {
			for(; j < arr.size() ; j++) {
				if(arr.get(j).day == i) pQ.offer(arr.get(j).price);
				else break;
			}
			if(!pQ.isEmpty()) answer += pQ.poll();
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0;
		ArrayList<Lecture> arr =new ArrayList<>();
		for(int i = 0; i < n; i++) {
			int p = sc.nextInt();
			int d = sc.nextInt();
			arr.add(new Lecture(p, d));
			if(d > max) max = d;
		}
		System.out.println(main.sol(arr, max));
	}

}
