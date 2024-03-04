package DreamHanks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );
		
		System.out.println( "xの値を入力してください" );
		int x = Integer.parseInt( br.readLine() );
//		System.out.println( "yの値を入力してください" );
//		int y = Integer.parseInt( br.readLine() );
		
		//1번문제 
//		if(x > y) {
//			System.out.println("xはyよりも大きい");
//		}else if(y>x) {
//			System.out.println("xがyよりも小さい");
//		}else {
//			System.out.println("xとyの値が同じ場合");
//		}
		//2번문제
//		if(x > 0) {
//			if(x%2 == 0) System.out.println("正の数の偶数");
//			else System.out.println("正の数の奇数");
//		}else if(x < 0) {
//			if(x%2 == 0) System.out.println("負の数の偶数");
//			else System.out.println("負の数の奇数");
//		}else System.out.println("0です");
		
		//問3：月の日数を表示するプログラム
		int days;
		switch(x) {
			case 1 : 
			case 3 : 
			case 5 : 
			case 7 : 
			case 8 : 
			case 10 : 
			case 12 : days = 31; break;
			case 4 :
			case 6 :
			case 9 :
			case 11 : days = 30; break;
			case 2 : days = 28; break;
			default:
				System.out.println("入力が間違っています");
				return; //여기서 return되면 main메소드가 종료되기 때문에, days가 값이 없어도 상관없는 것임.
		}
		System.out.println(x + "月の日数は" + days + "日です");
	}
}
