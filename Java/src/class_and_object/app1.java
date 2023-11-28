package class_and_object;

public class app1 {

    public static void main(String[] args){

        /* 필드에 바로 접근할 때 발생할 수 있는 문제점1
        필드에 올바르지 않은 값이 들어가도 통제가 불가능해진다.


        * */

        Monster monster1 = new Monster();
        monster1.setInfo("드라큘라");
        monster1.sethp(100);

        Monster monster2 = new Monster();
        monster2.setInfo("프랑켄슈타인");
        monster2.sethp(-200);

        System.out.println(monster1.getInfo());
        System.out.println(monster2.getInfo());

        Monster2 monster3 = new Monster2();
        monster3.setHp(100);

        /* 생성자를 이용한 초기화와 설정자를 이용한 초기화 비교 */
        //ㄴ 매개변수 있는 생성자   ㄴ기본생성자 + setter

        /* 1. 생성자를 이용한 초기화
         * 장점 : setter 메소드를 여러번 호출해서 사용하지 않고 단 한번의 호출로 인스턴스를 생성 및 초기화할 수 있다.
         * 단점 : 필드를 초기화할 매개변수의 개수를 경우의 수 별로 모두 만들어둬야 한다.
         *        호출 시 인자가 많아지는 경우 어떠한 값이 어떤 필드를 의미하는지 한 눈으로 보기 힘들다.
         *        예) 아이디, 비밀번호, 이름이 모두 greedy인 경우
         *        new User("greedy", "greedy", "greedy"); 몇 번째 인자가 아이디인지 이름인지 알 수 없다.
         *
         * 2. 설정자를 이용한 초기화
         * 장점 : 필드를 초기화하는 각각의 값들이 어떤 필드를 초기화하는지 명확하게 볼 수 있다.
         *   	  예) 아이디, 비밀번호, 이름이 모두 greedy인 경우
         *      	User user = new User();
         *      	user.setId("greedy");
         *       	user.setPwd("greedy");
         *       	호출하는 코드만 봐도 어떤 값이 어떤 필드를 초기화하는 내용인지 쉽게 알 수  있다.
         *  단점 : 하나의 인스턴스를 생성할 때 한 번의 호출로 끝나지 않는다.
         * */

        UserDTO user1 = new UserDTO("greedy", "greedy", "greedy", new java.util.Date());
        System.out.println(user1.getInformation());

        UserDTO user2 = new UserDTO();
        user2.setId("greedy");
        user2.setPwd("greedy");
        user2.setName("greedy");
        user2.setEnrollDate(new java.util.Date());
        System.out.println(user2.getInformation());

    }
}
