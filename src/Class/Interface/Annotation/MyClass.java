package Class.Interface.Annotation;

import static java.lang.System.out;

public class MyClass {
    @MyAnnotation
    public void method1() {
        out.println("실행 내용 1");
    }

    @MyAnnotation(value = "*")
    public void method2() {
        out.println("실행 내용 2");
    }

    @MyAnnotation(value = "*", number = 20)
    public void method3() {
        out.println("실행 내용 3");
    }
}
