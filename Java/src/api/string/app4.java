package api.string;

public class app4 {

    public static void main(String[] args) {
        /* 이스케이프(escape) 문자
         * 문자열 내에서 사용하는 문자 중 특수문자를 표현하거나 특수기능을 사용할 때 사용하는 문자이다.
         *
         * 이스케이프문자   의미
         *   \n           개행(줄바꿈)
         *   \t			  탭
         *   \'			  작은 따옴표
         *   \"           큰따옴표
         *   \\           역슬래쉬 표시
         * */

        System.out.println("안녕하세요.\n저는 홍길동입니다.");

        System.out.println("안녕하세요.\t저는 홍길동입니다.");

        System.out.println("안녕하세요. 저는 '홍길동'입니다.");

//		System.out.println('''); //에남. 홑따옴표 문자와 문자 리터럴 기호가 중복됨
        System.out.println('\''); // '

//		System.out.println("안녕하세요 저는 "홍길동" 입니다."); // ""안에 ""못넣어줌 ->문자열 리터럴과 중복되어 에러남.

//		System.out.println("안녕하세요. 저는 \홍길동\ 입니다."); \뒤에는 약속된 문자만 올 수 있음
        System.out.println("안녕하세요. 저는 \\홍길동\\ 입니다.");

        System.out.print("안녕하세요");
        System.out.print("반갑습니다");

        System.out.println();
        System.out.println("안녕하세요.");
        System.out.println("반갑습니다.");

        /* 문자열 일때는 %s
         * 정수 일때는 %d
         * 실수 일때는 %f
         * */
        //입력하신 이름은 홍길동이고, 나이는 20살이고 몸무게는 65.8 입니다.

        //"입력하신 이름은 " + name + "이고, 나이는" + age + "살이고 몸무게는 " + weight + "입니다";
        System.out.printf("%s %s %d살이고, 몸무게는 %.3f" ,"안녕하세요", "반갑습니다.", 20,65.12);
        System.out.printf("%s %s %d살이고, 몸무게는 %.3f","안녕하세요","반갑습니다",30,76.5523);

    }

    }

