package inflearn.basicTest.template;

import java.util.Scanner;


class Main{
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int m=kb.nextInt();
		int cnt = 1;
		int[] dy=new int[m+1];
		for(int i=0; i<n; i++){
			int ps=kb.nextInt();
			int pt=kb.nextInt();
			for(int j=m; j>=pt; j--) {
				dy[j] = Math.max(dy[j], dy[j-pt]+ps); 
			}
		}
		System.out.print(dy[m]);
	}
}
