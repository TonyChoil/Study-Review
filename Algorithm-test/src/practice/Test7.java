package dreamHanks;

public class Test7 {
	static int[][] arr;
	static int[] ch;
	static int count = 1;
	
	public void solution(int x, int y) {
		if(x == 3) {
			System.out.println(count++ + "目");
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}else {
			for(int i = 1; i <= 9; i++) {
				if(ch[i] == 0) {
					//왼쪽또는 위쪽만 확인하면 됨 
					boolean check = true;
					if(x-1>=0 && Math.abs(arr[x-1][y]-i) > 3) check = false; 
					if(y-1>=0 && Math.abs(arr[x][y-1]-i) > 3) check = false; 
					if(check) {
						ch[i] = 1;
						arr[x][y] = i;
						int ny = y + 1;
						int nx = x;
						if(ny==3) {
							nx++;
							ny = 0;
						}
						solution(nx, ny);
						ch[i] = 0;
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Test7 main = new Test7();
		arr = new int[3][3];
		ch = new int[10];
		
		main.solution(0,0);
	}
}
