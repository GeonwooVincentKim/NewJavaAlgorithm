package Class.InnerClass;

import static java.lang.System.out;

public class A {
    A() {
        out.println("A 객체 생성");
    }

    static class B {
        B() {
            out.println("B 객체 생성");
        }

        int var1;
        static int var2;

        void method() {
            out.println("Static 내부 클래스의 Method()");
        }

        static void method2() {
            out.println("static 내부 클래스의 static method2()");
        }
    }

    public class C {
        C() {
            out.println("C 객체 생성");
        }

        int var1;

        void method() {
            out.print("Instance 내부 Class의 method1()");
        }
    }

    void method() {
        class D {
            D() {
                out.println("D 객체 생성");
            }

            int var1;

            void method1() {
                out.println("Local 내부 Class 의 Method1()");
            }

            void method2() {
                out.println(var1);
            }
        }

        D d = new D();
        d.var1 = 3;
        d.method1();
        d.method2();
    }
}
