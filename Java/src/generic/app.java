package generic;

public class app {

    public static void main(String[] args){

        /* 제네릭(generic)
        제네릭의 사전적인 의미는 일반적인이라는 의미이다.
        자바에서 제네릭이란 데이터의 타입을 일반화한다는 의미를 가진다.

        JDK 1.5버전부터 추가된 문법
        
        instanceof 비교 및 다운캐스팅 작성이 불필요
        * */

        Generic<Integer> gt1 = new Generic<Integer>();
        //Genetic<T>의 T를 Integer로 바꿔줬다.

        gt1.setValue(10);

        System.out.println(gt1.getValue());

        Generic<String> gt2 = new Generic<>(); //왼쪽에 타입정해주면 오른쪽은 생략가능

        gt2.setValue("홍길동");
        System.out.println(gt2.getValue());
        System.out.println(gt2.getValue() instanceof String);

        Generic<Double> gt3 = new Generic<Double>();
        gt3.setValue(0.5);
        System.out.println(gt3.getValue());
        System.out.println(gt3.getValue() instanceof Double);
    }
}
