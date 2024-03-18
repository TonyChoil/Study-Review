package dreamHanks;

public class Test4_QuickSort {

	private static void quickSort(int[] arr) {
		quickSort(arr, 0, arr.length - 1);
	}
	
	private static void quickSort(int[] arr, int start, int end) {
		int part2 = partition(arr, start, end);
		System.out.println("part2 : " + part2);
		if(start < part2 - 1) {
			quickSort(arr, start, part2 - 1);
		}
		if(part2 < end) {
			quickSort(arr, part2, end);
		}
	}
	

	private static int partition(int[] arr, int start, int end) {
		int pivot = arr[(start + end) / 2];
		System.out.println("pivot : " + pivot);
		while(start < end) {
			while(arr[start] < pivot) start++; //같아도 멈춤 
			while(arr[end] > pivot) end--;
			if(start <= end) {
				swap(arr, start, end);
				start++;
				end--;
			}
		}
		return start;
	}

	private static void swap(int[] arr, int start, int end) {
		int tmp = arr[start];
		arr[start] = arr[end];
		arr[end] = tmp;
	}

	public static void main(String[] args) {
		int[] arr = {5, 10, 7, 9, 3, 1, 8, 2};
		quickSort(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
