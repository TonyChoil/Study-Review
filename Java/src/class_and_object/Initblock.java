package class_and_object;

public class Initblock {
    /* 필드를 초기화하지 않으면 JVM이 정한 기본값으로 객체가 생성된다. */
//	private String name;
//	private int price;
//	private static String brand;

    /* 명시적 초기화 */
    private String name = "갤럭시";
    private int price = 2000000;
    private static String brand = "삼송";

    {
        name = "사이언";
        price = 900000;

        brand = "LG";
        System.out.println("인스턴스 초기화 블럭 동작함...");
        // 생성자  이전에 초기화블럭 등장..!
        /* 인스턴스 초기화 블럭에서는 static 필드를 초기화 할수 있는 것처럼 보인다.
        하지만 static 초기화 블럭은 클래스가 로드될 때 이미 기본값으로 초기화를 진행했다.
        따라서 인스턴스 초기화 블럭이 동장하는 시점에는 이미 초기화가 진행된 정적필드에
        인스턴스를 초기화 블럭에서 대입한 값으로 덮어 쓰게 되는 것이다.
        * */
    }

    static {


    }

    public static void main(String[] args) {
        Product product = new Product();
        System.out.println(product.getInformation());
        //명시적초기화 -> 인스턴스초기화블록 -> 생성자

        Product product2 = new Product("대륙폰", 300000, "샤우미");
        System.out.println(product2.getInformation());

        /*
         * 인스턴스 변수 : 기본값 -> 명시적초기값 -> 정적초기화블럭 -> ㅊ  인스턴스초기화블럭 -> 생성자
         * */
    }
}
