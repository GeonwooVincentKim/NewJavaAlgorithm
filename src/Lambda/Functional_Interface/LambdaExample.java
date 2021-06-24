package Lambda.Functional_Interface;

import static java.lang.System.out;

public class LambdaExample {
    public static void main(String[] args) {
        // AnonymousClass Version
        AnonymousClass anonymousClass1 = new AnonymousClass() {
            public void print() {
                out.println("내 이름은 익명의 자식, 익명객체지");
            }
        };

        anonymousClass1.print();

        // Lambda Function Version
        LambdaInterface li = () -> {
            String str = "Method 출력";
            out.println(str);
        };

        li.print();
    }
}

interface LambdaInterface {
    void print();
}

class AnonymousClass implements LambdaInterface {
    @Override
    public void print() {
        // out.println("내 이름은 익명, 클래스지");
    }
}