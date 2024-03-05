package dreamHanks;

public class Test3 {

	public static void main(String[] args) {
		int[] arr = {30, 355, 24, 12, 98, 72, 5, 76, 60, 35, 54, 62, 2, 12, 35};
		
		for(int i = 1; i < arr.length; i++) {
			int tmp = arr[i], j;
			for(j = i-1; j >= 0; j--) {
				if(arr[j] > tmp) arr[j+1] = arr[j];
				else break;
			}
			arr[j+1] = tmp;
		}
		for(int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i] + " ");
		}
	}

}
