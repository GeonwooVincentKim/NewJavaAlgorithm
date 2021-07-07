package Class.Interface.Annotation;

import static java.lang.System.out;

import java.lang.reflect.Method;

public class AnnotationExample {
    public static void main(String[] args) throws Exception {
        Method method[] = UserClass.class.getDeclaredMethods();
        // out.println(method);
        out.println();

        for (int i = 0; i < method.length; i++) {
            String methodName = method[i].getName();
            // out.println(methodName + " -> Method 이름");

            UserAnnotation annotation = method[i].getAnnotation(UserAnnotation.class);
            // out.println(annotation + " -> Method Annotation");

            out.print(methodName + " 의 Annotation");
            out.print("value : " + annotation.value() + " ");
            out.print("number : " + annotation.number() + " ");
            out.println("\n");

            method[i].invoke(new UserClass(), null); // Execute the Method -
        }
    }
}
