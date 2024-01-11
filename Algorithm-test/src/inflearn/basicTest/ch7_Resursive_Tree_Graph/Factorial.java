package inflearn.basicTest.ch7_Resursive_Tree_Graph;

public class Factorial {
    public int Factorial(int n){
        if(n==1) return 1;
        else return n * Factorial(n - 1);
    }

    public static void main(String[] args) {
        Factorial T = new Factorial();
        System.out.println(T.Factorial(5));
    }
}
