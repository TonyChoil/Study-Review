package generic;

/* 인터페이스 상속 시 implements 키워드 대신 extends 사용한다. */
//public class Rabbitfarm<T implements Animal> { 에러.
//public class RabbitFarm<T extends Animal> {

/* 클래스 상속 시 extends 사용 가능 */
public class RabbitFarm<T extends Rabbit> {	//Rabbit타입으로만 지정하겠다.
/* 참고로 클래스와 인터페이스 상속 시 &를 사용한다.
 * 앞에 클래스가 와야하고 인터페이스는 뒤에 와야한다. (순서바뀌면에러)
 * &로 여러 타입을 동시에 가지는 경우에만 타입변수에 맞는 타입으로 여긴다.(둘 중 하나 아님)
 * */
//	public class RabbitFarm<T extends Rabbit & Animal> {
//	public class RabbitFarm<T extends Rabbit, Reptile> {
		
		private T animal;
	
		public RabbitFarm() {}
	
		public RabbitFarm(T animal) { //매개변수있는 생성자
		
			this.animal = animal;
		}
	
		public void setAnimal(T animal) {
			
			this.animal = animal;
		}
		
		public T getAnimal() {
			
			return this.animal;
		
		
		}
	
}
