package api.string;

public class app {

    public static void main(String[] args) {

        /* 문자열 객체를 만드는 방법
         "" 리터럴 형태 : 도일한 값을 가지는 인스턴스 단일 인스턴스로 관리한다. (singleton)
         String : 자료 참조형
         콘솔에서 글자를 받으면 new String("문자열") 이렇게 만들어서 새로웅ㄴ 주소값 생성
        * */

        /* String 클래스의 자주 사용하는 메소드 */

        /* charAt() : 해당 문자열의 특정 인덱스의 해당하는 문자를 반환한다.
         * index는 0부터 시작하는 숫자 체계를 의미하며,
         * index를 벗어나면 정수를 인자로 전달하는 겨웅에는 IndexOutOfBoundException이 발생한다.
         * */
        String str1 = "apple";

        for(int i = 0; i < str1.length(); i++) {

            System.out.println("charAt(" + i + ") :" + str1.charAt(i));
        }


        /* compareTo() : 인자로 전달된 문자열과 사전 순으로 비교를 하여
         * 두 문자열이 같다면 0을 반환, 인자로 전달된 문자열보다 작으면 음수를,
         * 크면 양수를 반환한다.
         * 단, 이 메소드는 대소문자를 구분하여 비교환다.
         * */
        String str2 = "java";
        String str3 = "java";
        String str4 = "JAVA";
        String str5 = "oracle";


        System.out.println(str2.compareTo(str3));
        /* 같은면 0을 반환 */
        System.out.println("compareTo() : " + (str2.compareTo(str3)));
        /* 대문자와 소문자는 32만큼 차이가 난다. */
        System.out.println("compareTo() : " + str2.compareTo(str4));
        System.out.println("compareTo() : " + str4.compareTo(str2));
        //대문자가 소문자보다 아스킷코드가 빠르니까, compareTo로 비교했을 때 양수가 나오면 서로 바꿔줘야 오름차순이 된다
        /* jklmo j부터 o까지는 5만큼 차이가 난다. */
        System.out.println("compareTo() : " + str2.compareTo(str5));
        System.out.println("compareTo() : " + str5.compareTo(str2));

        /* compareToIgnoreCase() : 대소문자를 구분하지 않고 비교한다. */
        System.out.println("compareToIgnoreCase() : " + str3.compareToIgnoreCase(str4));

        /* concat() : 문자열에 인자로 전달된 문자열을 합치기해서 새로운 문자열을 반환한다.
         * 원본 문자열에는 영향을 주지 않는다.
         * */
        System.out.println("concat() : " + (str2.concat(str5)));
        System.out.println("str2 : " + str2);

        /* indexOf() : 문자열에서 특정 문자를 탐색해서 처음 일치하는 인덱스 위치를 정수형으로 반환한다.
         * 단, 일치하는 문자가 없는 경우 -1을 반환한다.
         * */
        String indexOf = "java oracle";

        System.out.println("indexOf('a') : " + indexOf.indexOf('a')); //1. 공백 포함인덱슨
        System.out.println("indexOf('z') : " + indexOf.indexOf('z')); //-1 없는 문자

        /* test@test.com test1234@test.com test.png helloworld.jpg */

        /* lastIndexOf() : 문자열 탐색을 뒤에서부터 하고 처음 일치하는 위치의 인덱스를 반환한다.
         * 단, 일치하는  문자가 없는 경우 -1을 반환한다.
         * */

        System.out.println("lastindexOf('a') : " + indexOf.lastIndexOf('a'));
        //7. 뒤에서 가까운 a를 찾고 앞에서부터의 인덱스를 반환
        System.out.println("lastindexOf('z') : " + indexOf.lastIndexOf('z')); //-1 없는 문자

        /*  trim() : 문자열 앞 뒤에 공백을 제거한 문자열을 반환한다. */
        String trimStr = "     java        ";
        System.out.println("trimStr : #" + trimStr + "#");
        //trimStr : #     java        #
        System.out.println("trim() : #" + trimStr.trim() + "#");
        //trim() : #java#
        /* 원본에 영향을 주지는 않는다. */
        System.out.println("trimStr : #" + trimStr + "#");

        /* toLowerCase() : 모든 문자를 소문자로 변환시킨다. 소문자에 LowerCase넣어도, 그대로 나옴.
         * toUpperCase() : 모든 문자를 대문자로 변환시킨다.
         * 원본에는 영향을 주지 않는다.
         * */
        String caseStr = "JavaOracle";

        System.out.println("toLowerCase() : " + caseStr.toLowerCase()); //javaoracle
        System.out.println("toUpperCase() : " + caseStr.toUpperCase()); //JAVAORACLE
        /* 원본영향 x */
        System.out.println("caseStr : " + caseStr );

        /* substring() : 문자열의 일부분을 잘라내어 새로운 문자열을 반환한다.
         * 원본에 영향을 주지 않는다.
         * */
        String javaoracle = "javaoracle";

        System.out.println("substring(3, 6) : " + javaoracle.substring(3, 6));
        //뒷부분 인덱스 앞까지만.
        System.out.println("substring(3) : " + javaoracle.substring(3)); // index3부터 끝까지

        /* replace() : 문자열에서 대체할 문자열로 기존 문자열을 변경해서 반환.
         * 원본에 여향을 주지 않는다.
         * */
        System.out.println("replace() : " + javaoracle.replace("java", "phyton"));
        // replace() : phytonoracle     java가아니라 Java라고하면 바뀌지않는다(오타 시 무시)
        System.out.println("javaoracle : " + javaoracle); //원본값변경 x

        /* length() : 문자열의 길이를 정수형으로 반환 */
        System.out.println("lengt() : " + javaoracle.length());
        // == "JavaOracle".length();  ->문자열은클래스이기때문에 가능
        System.out.println("빈 문자열의 길이 : " + "".length()); //0

        /* isEmpty() : 문자열의 길이가 0이면 true를 반환, 아니면 false를 반환
         * 길이가 0인 문자열과 null과는 다르다.
         * */
        System.out.println("isEmpty() : " + "".isEmpty()); //true
        System.out.println("isEmpty() : " + "   ".isEmpty()); //false
        System.out.println("isEmpty() : " + "abc".isEmpty());


    }
}
