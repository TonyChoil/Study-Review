package api;

import java.util.Date;

public class date {
        public static void main(String[] args) {

            /* Date 클래스 생성 방법 (2가지) */

            /* 1. 기본 생성자를 사용하는 방법
             * 기본 생성자로 인스턴스를 생성하면 운영체제의 날짜/시간 정보를 이용해서 인스턴스를 만들게 된다.
             * */
            java.util.Date today = new java.util.Date();
            /* toString() 메소드가 오버라이딩 되어 있어서 쉽게 필드값을 출력해 볼 수 있다. */
            System.out.println(today);

            /* 2. Date(long date) 사용하는 방법 */
            /* getTime() : 1970년 1월 1일 0시 0분 0초 이후 지난 시간을 millisecond로 계산해서 long타입으로 반환한다. */
            System.out.println(today.getTime()); //마일스톤으로 표기 !

            Date time = new Date(1666663403784l); //직접 고정된 값 넣기
            System.out.println(time);

            /*
             * 하루 = 24시간, 1시간 = 60분, 1분 = 60초, 1초 = 1000밀리초
             *
             * 1000 * 60 * 60 * 24 가 하루가 된다.
             * */

        }
    }