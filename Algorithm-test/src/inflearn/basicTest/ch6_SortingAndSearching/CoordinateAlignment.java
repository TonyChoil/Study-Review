package inflearn.basicTest.ch6_SortingAndSearching;

import java.util.*;

class Point implements Comparator<Point> {
    int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Point() {
    }

    @Override
    public int compare(Point o1, Point o2) {
        if(o1.x == o2.x) return o1.y-o2.y;//x값이 같을 때, 앞의 값이 크면 바꿔준다.
        else return o1.x-o2.x; // x 다를 때, 앞의 값이 크면 바꿔준다.
    }
}
public class CoordinateAlignment {

    public static void main(String[] args) {
        CoordinateAlignment main = new CoordinateAlignment();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Point> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr.add(new Point(x, y));
        }
        arr.sort(new Point());
        for(Point p : arr){
            System.out.println(p.x + " " + p.y);
        }
    }
}
