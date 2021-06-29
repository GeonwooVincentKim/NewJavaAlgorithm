package Class.Interface.Default_Static_Method;

import static java.lang.System.out;

public class InterfaceExample {
    public static void main(String[] args) {
        Calculator cal = new CalculatorImplementation();
        out.println(cal);

        int resultPlus = cal.plus(3, 9);
        int resultMultiply = cal.multi(3, 9);

        out.println("resultPlus 의 값은 : " + resultPlus);
        out.println("resultMultiply 의 값은 : " + resultMultiply);

        int resultExecutePlus = cal.executePlus(3, 9);
        out.println("default method 호출 결과 : " + resultExecutePlus);

        int resultExecuteMultiply = Calculator.executeMultiply(3, 9);
        out.println("static method 호출 결과 : " + resultExecuteMultiply);
    }
}
