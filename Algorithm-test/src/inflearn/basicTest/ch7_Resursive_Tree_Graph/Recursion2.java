package inflearn.basicTest.ch7_Resursive_Tree_Graph;

public class Recursion2 {

    public void DFS(int n){
        if(n == 0) return;
        else{
            DFS(n/2);
            System.out.print(n%2 + " ");
        }
    }

    public static void main(String[] args) {
        Recursion2 T = new Recursion2();
        T.DFS(11);
    }
}
