package Class.Interface.Annotation;

import static java.lang.System.out;

import java.lang.reflect.Method;

public class MyAnnotationExample {
    public static void main(String[] args) {
        Method[] methodList = MyAnnotation.class.getMethods();
        out.println(methodList);
    }
}
