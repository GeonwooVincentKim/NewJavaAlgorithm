package Class.Interface.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ ElementType.METHOD })
public @interface MyAnnotation {
    String value() default "-";

    int number() default 15;
}
