package dreamHanks;

public class Test3_2 {

	public static void main(String[] args) {

		int[] arr = {30, 355, 24, 12, 98, 72, 5, 76, 60, 35, 54, 62, 2, 12, 35};
		// {30, 355, 24, 12 , 98} 
		// 1회차30 24 12 98 355
		// 2회차 24 12 30 98 355
		// 3회차 12 24 30 98 355
		
		// 시행거듭하면 하나씩더 안봐도 되는거고
		// 2번째 포문은 다 돌기는 해야하는거고 대신 - i
		//버블정렬
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = 0; j < arr.length-1-i; j++) {
				int tmp;
				if(arr[j] > arr[j+1]) {
					tmp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}

}
