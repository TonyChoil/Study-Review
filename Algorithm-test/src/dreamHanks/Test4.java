package dreamHanks;

public class Test4 {
		 
		 
	    public static void main(String[] args) {
	        int n = 4;	
	        int r = 4;	
	        int[] arr = {1, 2, 3, 4};
	        int[] output = new int[n];				
	        boolean[] visited = new boolean[n];		
	        
	        int count = 1;
	        for(int i=arr.length; i>0; i--) count = count * i;
	        System.out.println("count: "+count);
	        System.out.println("==============");
	        
	        perm(arr, output, visited, 0, n, r);
	    }
	 
	    static void perm(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
	    	if (depth == r) {
	            print(output);
	            return;
	        }
	 
	        for (int i = 0; i < n; i++) {
	            if (visited[i] != true) {		
	                visited[i] = true;			
	                output[depth] = arr[i];		
	                perm(arr, output, visited, depth + 1, n, r);	
	                visited[i] = false;			
	            }}	    }
	 
	    static void print(int[] arr) {
	    	for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	    	}
	        System.out.println();
	    }
}
