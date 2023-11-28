package class_and_object;
public class Product {

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
        //생성자 이전에 초기화블럭 등장..!
        /* 인스턴스 초기화 블럭에서는 static 필드를 초기화 할 수 있는 것처럼 보인다.
         * 하지만 static 초기화 블럭은클래스가 로드될 때 이미 기본값으로 초기화를 진행했다.
         * 따라서 인스턴스 초기화 블럭이 동작하는 시점에서는 이미 초기화가 진행된 정적필드에
         * 인스턴스 초기화 블럭에서 대입한 값으로 덮어 쓰게 되는 것이다.
         *
         */
    }

    static {

        //name = "아이뿡"; 불가능
        brand = "샤미";
        System.out.println("정적초기화블럭실행됨..");
    }

    public Product() {

        System.out.println("기본 생성자 호출됨...");
    }

    public Product(String name, int price, String brand) {

        this.name = name;
        this.price = price;
        Product.brand = brand;
        System.out.println("매개변수 있는 생성자 호출됨...");
    }

    public String getInformation() {

        return "Product name= " + this.name
                + ", price = " + this.price
                + ", brand = " + Product.brand;
    }
}

