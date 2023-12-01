package generic;

public class Generic<T> {

    /* 제네릭 설정은 클래스 선언부 마지막 부분에 다이아몬드 연산자를 이용하여 작성하게 된다.
    다이아몬드 여난자 내부에는 작성하는 영문자는 관례상 대문자로 작성한다.

    다이아몬드 연산자 내부에 작성한 T는 타입변수라고 부른다.

    타입변수를 자료형 대신 사용할 것인데, 가상으로 존재하는 타입이며
    T가 아닌 다른 영문자를 사용해도 무방하다.

    또한 여러 개의 타입변수를 작성할 때는 ,를 이용해서 여러 개 기술할 수도 있다.
    * */

    private T value; //클래스에 <T>안해주면 에러. 다른 문자로해도 에러

    public void setValue(T value) {

        this.value = value;
    }

    public T getValue() {

        return this.value;
    }

    /* Mammal 타입(상위타입)으로는 생성할 수 없다. (T extends Rabbit일때) */
//		RabbitFarm<Mammal> farm2 = new RabbitFarm<>();
//		RabbitFarm<Snake> farm3 = new RabbitFarm<>();
    /* Rabbit 타입이거나 Rabbit의 후손으로는 인스턴스 생성이 가능하다. */

    //결국 여기 RabbitFarm<a> : a에 들어갈거는 최대 가능 부모를 정해주는 것과 같다.
    //그다음에 setAnimal에서 자손을 넣을수도 있다.
}