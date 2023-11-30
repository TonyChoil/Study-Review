package api.string;

import java.util.StringTokenizer;

public class app3 {

    public static void main(String[] args) {

        /* split()과 StringTokenizer
         *
         * 문자열을 특정 구분자로 하여 분리한 문자열을 반환하는 기능을 한다.
         *
         * split() : 정규표현식을 이용하여 문자열을 분리한다.
         * 			 비정형화된 문자열을 분리할 때 좋지만(공백 문자열 값 포함)
         * 			 정규표현식을 이용하기 때문에 속도가 느리다는 단점을 가진다.
         * 			　　(StringTokenizer 보다)
         * StringTokenizer : 문자열의 모든 문자들을 구분자로 하여 문자열을 분리한다.
         * 					 정형화된 문자열 패턴을 분리할 때 사용하기 좋다.(공백 문자열 무시)
         * 					 split()보다 속도면에서 더 빠르다.
         * 					 구분자를 생략하는 경우 공백이 기본 구분자이다.
         * */

        String emp1 = "100/홍길동/서울/영업부"; // 모든 값 존재
        String emp2 = "200/유관순//총무부"; // 주소 x
        String emp3 = "300/이순신/경기도/"; // 부서 x

        String[] empArr1 = emp1.split("/");
        String[] empArr2 = emp2.split("/");
        String[] empArr3 = emp3.split("/");


        for (int i = 0; i < empArr1.length; i++) {

            System.out.println("empArr1[" + i + "] :" + empArr1[i]);
        }

        for (int i = 0; i < empArr2.length; i++) {

            System.out.println("empArr2[" + i + "] :" + empArr2[i]);
        } //공백이 중간에  있으면 빈칸으로 보여주고

        for (int i = 0; i < empArr3.length; i++) {

            System.out.println("empArr3[" + i + "] :" + empArr3[i]);
        } //공백이 마지막에 있으면 토큰화안함.(출력안함)

        /* 마지막 구분자 사이에 값이 존재하지 않는 경우 이후 값도 추출하고 싶을 때
         * 몇 개의 토큰으로 분리할 것인지 한계치를 두번째 인자로 넣어줄 수 있다.
         * 이때 음수를 넣게 되면 마지막 구분자 뒤의 값이 존재하지 않는 경우 빈 문자열로 토큰을 생성한다.
         *
         */
        String[] empArr4 = emp3.split("/", -1);

        for (int i = 0; i < empArr4.length; i++) {

            System.out.println("empArr4[" + i + "] :" + empArr4[i]);
        }

        /* StringTokenizer */
        System.out.println("================================");

        /* split()과 다르게 공백으로 존재하는 값을 무시해버린다. */
        StringTokenizer str1 = new StringTokenizer(emp1, "/");
        StringTokenizer str2 = new StringTokenizer(emp2, "/");
        StringTokenizer str3 = new StringTokenizer(emp3, "/");
        //이거는 배열객체로 자르는게아님
        while (str1.hasMoreTokens()) {

            System.out.println("str1 : " + str1.nextToken());
        }
        while (str2.hasMoreTokens()) {

            System.out.println("str2 : " + str2.nextToken());
        }
        while (str3.hasMoreTokens()) {

            System.out.println("str3 : " + str3.nextToken());
        }
        /* hasMoreTokens()/nextToken()으로 토큰을 꺼내면 해당 StringTokenizer의 토큰을 재사용하는 것이 불가능하다. */
        //토큰 각 1개씩

        String colorStr = "red*orange#blue/yellow green";

//		String[] colors = colorStr.split("*#/ "); //에러남. *#/ 가 없기 때문에
        String[] colors = colorStr.split("[#*/ ]");
//		==String[] colors1 = colorStr.split("[#*/ ]");
        /* 대괄호로 묶은 문자열은 문자열이 아닌 각 문자들의 패턴으로 볼 수 있다.
         * 따라서 "순서 상관없이" 존재하는 문자들을 이용해서 구분자로 사용할 수 있다.
         * 만들때부터 regex라고 써있음,
         * */
        for (int i = 0; i < colors.length; i++) {

            System.out.println("colors[" + i + "] :" + colors[i]);
        }

        StringTokenizer colorStringTokenizer = new StringTokenizer(colorStr, "*/# ");
        //[]로 정규표현식안해도됨 순서상관x. 만들 때 regex라고 안써있음.

        while (colorStringTokenizer.hasMoreTokens()) {

            System.out.println(colorStringTokenizer.nextToken());
        }


    }
}

