package inflearn.basicTest.ch9_GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Info implements Comparable<Info>{
	int height, weight;
	
	public Info(int height, int weight) {
		this.height = height;
		this.weight = weight;
	}

	@Override
	public int compareTo(Info o) {
		return o.height - this.height;
	}
}	

	public class WrestlingPlayer {
//		
//		public int solution(ArrayList<Info> list) {
//			int count = 0;
//			for(int i = 0; i < list.size(); i++){
//				Info a = list.get(i);
//				for(int j = i; j < list.size(); j++) {
//					count++;
//					Info b = list.get(j);
//					if(a.height > b.height && a.weight > b.weight) {
//						list.remove(b);
//						j--;
//					}else if(b.weight > a.weight && b.height > a.height) {
//						list.remove(a);
//						i--;
//						break;
//					}
//				}
//			}
//			System.out.println(count);
//			return list.size();
//	}
		public int solution(ArrayList<Info> list) {
			int cnt=0;
			Collections.sort(list);
			int max=Integer.MIN_VALUE;
			for(Info in : list) {
				if(in.weight>max) {
					max=in.weight;
					cnt++;
				}
			}
			return cnt;
		}
		
		public static void main(String[] args) {
			WrestlingPlayer T = new WrestlingPlayer();
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			ArrayList<Info> list = new ArrayList<>();
			for(int i = 0; i < n; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				list.add(new Info(a, b));
			}
			System.out.println(T.solution(list));
		}
}
