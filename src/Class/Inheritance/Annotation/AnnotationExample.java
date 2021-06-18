package Class.Inheritance.Annotation;

import static java.lang.System.out;

import java.lang.reflect.Method;

public class AnnotationExample {
    public static void main(String[] args) throws Exception {
        Method[] method = UserClass.class.getDeclaredMethods();
        out.println(method);

        for (int i = 0; i < method.length; i++) {
            out.println(method[i].getName());

            String methodName = method[i].getName();
            out.println(methodName);

            out.println(method[i].getAnnotation(UserAnnot.class));
            UserAnnot annot = method[i].getAnnotation(UserAnnot.class);
            out.println(annot);
        }
    }
}
