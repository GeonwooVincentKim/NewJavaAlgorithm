package Lambda.Functional_Interface;

import static java.lang.System.out;

public class LambdaExample2 {
    public static void main(String[] args) {
        LambdaInterface3 li3 = (String name) -> {
            out.println("제 이름은 " + name + " 입니다.");
        };

        li3.print("홍길동");
        print("홍길동");
    }

    public static void print(String name) {
        out.println("제 이름은 " + name + " 입니다.");
    }
}

@FunctionalInterface
interface LambdaInterface3 {
    void print(String name);
}
