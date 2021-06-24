package Lambda;

import static java.lang.System.out;

public class LambdaFunctionExample {
    public static void main(String[] args) {
        InterfaceEx ie = (int x, int y) -> x + y;
        out.println(ie.sum(1, 2));
    }
}

interface InterfaceEx {
    public int sum(int x, int y);
}
