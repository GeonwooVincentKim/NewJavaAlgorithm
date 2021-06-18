package Class.Inheritance.Annotation;

import static java.lang.System.out;

public class UserClass {
    @UserAnnot(value = "A")
    public void methodA() {
        out.println("MethodA() 실행");
    }

    @UserAnnot(value = "B", number = 10)
    public void methodB() {
        out.println("MethodB() 실행");
    }
}
