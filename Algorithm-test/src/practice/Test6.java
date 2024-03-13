package dreamHanks;

import java.util.ArrayList;

public class Test6 {
	static public int[] arr = {1,2,3,4};
	static public int[] ch, combi;

//	private void solution(ArrayList<Integer> list) {
//		if(list.size() == 4) {
//			System.out.println(list);
//		}else {
//			for(int i = 0; i < arr.length; i++) {
//				if(!list.contains(arr[i])) {
//					list.add(arr[i]);
//					solution(list);
//					list.remove(list.size()-1);
//				}
//			}
//		}
//	}
	
	public void DFS(int L) {
		if(L == 4) {
			for(int k : combi) System.out.print(k + " ");
			System.out.println();
		}else {
			for(int i = 0; i < arr.length; i++) {
				if(ch[i] == 0) {
					ch[i] = 1;
					combi[L] = arr[i];
					DFS(L+1);
					ch[i] = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Test6 main = new Test6();
//		ArrayList<Integer> list = new ArrayList<>();
		ch = new int[4];
		combi = new int[4];
//		main.solution(list);
		main.DFS(0);

	}



}
