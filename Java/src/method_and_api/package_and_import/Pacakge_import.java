package method_and_api.package_and_import;
/*★ static import인 경우 외우기*/
import static method_and_api.Calculator.maxNumberOf;

//import method_and_api.Calculator;

import method_and_api.Calculator;

public class Pacakge_import {
    
    /* non-static일 경우 */
//    Calculator calc = new Calculator();

    /* static인 경우 */
    int max = method_and_api.Calculator.maxNumberOf(30,20);
    //->다른 패키지, 클래스에 있는 메소드를 가져오는 방법 1.
    //풀 패키지 + 클래스명을 다 써준다.

    int max2 = Calculator.maxNumberOf(20, 30);
    //import method_and_api.Calculator; import문으로 간단히 해결

    int max3 = maxNumberOf(20, 30);
    //static을 클래스명없이 사용할 때. 보통 import문이랑 좀 다름.
    /*★ static import인 경우 외우기*/
    //import static Calculator.maxNumberOf; 또는 Calculator.*
}
