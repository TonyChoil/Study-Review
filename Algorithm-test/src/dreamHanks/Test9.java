package dreamHanks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Attend implements Comparable<Attend>{
	char stat;
	int time;
	public Attend(char stat, int time) {
		this.stat = stat;
		this.time = time;
	}
	@Override
	public int compareTo(Attend o) {
		if(this.time == o.time) {
			//떠난게 먼저오도록 
			return o.stat - this.stat;
		}
		return this.time - o.time;
	}
}

public class Test9 {

	public int sol(ArrayList<Attend> arr) {
		int answer = 0;
		int cnt = 0;
		for(int i = 0; i < arr.size(); i++) {
			if(arr.get(i).stat == 'a') {
				cnt++;
				answer = Math.max(cnt, answer);
			}
			else cnt--;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Test9 main = new Test9();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Attend> arr = new ArrayList<>();
		for(int i = 0; i <n; i++) {
			int ar = sc.nextInt();
			int de = sc.nextInt();
			arr.add(new Attend('a', ar));
			arr.add(new Attend('d', de));
		}
		Collections.sort(arr);
		System.out.println(main.sol(arr));
	}

}
