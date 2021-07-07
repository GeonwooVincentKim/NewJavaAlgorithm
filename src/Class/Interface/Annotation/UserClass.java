package Class.Interface.Annotation;

import static java.lang.System.out;

public class UserClass {
    @UserAnnotation(value = "A")
    public void methodA() {
        out.println("MethodA() 실행");
    }
}
