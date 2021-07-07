package Class.Interface.Annotation;

import static java.lang.System.out;

import java.lang.reflect.Method;

public class AnnotationExample {
    public static void main(String[] args) throws Exception {
        Method method[] = UserClass.class.getDeclaredMethods();
        out.println(method);

        for (int i = 0; i < method.length; i++) {
            String methodName = method[i].getName();
            out.println(methodName);

            // UserAnnotation annotation = method[i].getAnnotation(UserAnnotation.class);
        }
    }
}
