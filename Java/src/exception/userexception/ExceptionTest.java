package exception.userexception;


import exception.userexception.exception.MoneyNegativeException;
import exception.userexception.exception.PriceNegativeException;

public class ExceptionTest  {
	
	public void checkEnoughMoney(int price, int money) 
			throws PriceNegativeException, MoneyNegativeException, NotEnoughMoneyException {
		
		
		/* 상품 가격이 음수인지 확인하고, 음수인 경우 예외를 발생 */
		if(price < 0) {
			
			throw new PriceNegativeException("상품 가격은 음수일 수 없습니다.");
		}//생성자를 만들어서 생성자 안에있는 내용을 발생시킴(생성자를 메소드처럼 이용하는듯)
		/* 가진 돈이 음수인지 확인하고, 음수인 경우 예외를 발생 */
		if(money < 0) {
			
			throw new MoneyNegativeException("가지고 있는 돈은 음수일 수 없습니다.");
		}  //이렇게 하나씩 다 구분해준 이유는, 메세지내용보다는 보여지는 예외타입을 다르게 하기 위해서
		
		
		/* 위의 두 값이 정상 입력 되었더라고 상품가격이 가진 돈보다 큰 경우 예외 발생 */
		if(money < price) {
			
			throw new NotEnoughMoneyException("가진 돈보다 상품 가격이 더 비쌉니다.");
		}
		
		/* 모든 조건이 만족하는 경우 정상적으로 물건 구입가능 */
		System.out.println("가진 돈이 충분합니다. 즐거운 쇼핑 하세요~");
		
	}
}
