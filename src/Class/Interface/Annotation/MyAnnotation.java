package Class.Interface.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD }) // Use this Annotation when the developers creates new `METHOD` in the class
public @interface MyAnnotation {
    String value() default "-";

    int number() default 15;
}
