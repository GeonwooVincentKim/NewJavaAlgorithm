package Lambda.Functional_Interface;

import static java.lang.System.out;

public class LambdaExample3 {
    public static void main(String[] args) {
        LambdaInterface4 f4 = (x, y) -> {
            return x * y;
        };
        out.println("두 수의 곱 : " + f4.cal(3, 2));
    }
}

@FunctionalInterface
interface LambdaInterface4 {
    int cal(int x, int y);
}
