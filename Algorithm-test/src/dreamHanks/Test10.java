package dreamHanks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Lecture implements Comparable<Lecture>{
	int price;
	int day;
	
	public Lecture(int price, int day) {
		this.price = price;
		this.day = day;
	}
	@Override
	public int compareTo(Lecture o) {
		return o.day-this.day;
	}
	
}

public class Test10 {

	public int sol(ArrayList<Lecture> arr, int max) {
		int answer = 0;
		PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
		Collections.sort(arr);
		int j = 0;
		for(int i = max; i>=1; i--) {
			for(; j < arr.size(); j++) {
				if(arr.get(j).day == i) pQ.offer(arr.get(j).price);
				else break;
//				if(arr.get(j).day <i) break;
//				else pQ.offer(arr.get(j).price);
			}
			if(!pQ.isEmpty()) answer += pQ.poll();
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Test10 main = new Test10();
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
