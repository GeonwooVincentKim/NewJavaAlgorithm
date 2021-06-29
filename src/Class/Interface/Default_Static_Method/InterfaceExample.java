package Class.Interface.Default_Static_Method;

import static java.lang.System.out;

public class InterfaceExample {
    public static void main(String[] args) {
        Calculator cal = new CalculatorImplementation();
        out.println(cal);
    }
}
