package Class.InnerClass;

import static java.lang.System.out;

public class AExample {
    public static void main(String[] args) {
        A a = new A();
        out.println(a);

        A.B b = new A.B();
        out.println(b);

        b.var1 = 3;
        b.method();

        A.B.var2 = 3;
        A.B.method2();

        A.C c = a.new C();
        out.println(c);

        c.var1 = 3;
        c.method();
        out.println();

        a.method();
    }
}
