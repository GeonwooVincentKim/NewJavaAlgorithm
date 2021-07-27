# Annotation

- Annotation means Comment. 
- Annotation generally use when we develop web-application by using `Spring FrameWork`

- Annotation is the `metadata` that provides addtional information to the Program
- It provides the information to the Compiler and let it check that if there are Compiler Error or other specific error are existing.
- Also provides the information when the Compiler Build, or generates codes automatically.

```java
    /*
        The meaning of `Meta-Data`
        1. It means Data for another Data
        2. Data that explain about another Data
    */
```


## The sort of Annotation that the Java provides

### `@Override` Annotation

- Check that some `Object` or `Instance` of `Child Class` that Overrided from the `Object` or  `Instance` of `Parent Class`
- Show the error to the Developer that some `Object` of `Child Class` was not overrided from the `Parent's Object` or `Instance`.

### `@Deprecated` Annotation

- Search 


## Meta Annotation

- Annotation that are `User Defined Annotation`, and it can be created by a user

### `@Retention` Annotation

- Set the Annotation Range
- Set how far does the range to hava a strong influence on Annotation

### `@Documented` Annotation

- Set the information of `Documentation` should be expressed

### `@Target` Annotation

- Set the location of `Annotation` that will be going to be apply

### `@Inherited` Annotation

- Inheritate `Parent's Annotation` from `Child's Annotation`

### `@Repeatable` Annotation

- Make the Annotation can declare for several times


## Enumerate Constant of `ElementType (Target)`

### `TYPE`

- When the type are Reference Type (Except `Array`), then use `TYPE`
- Class
- Interface
- `Enum`

### `Annotaiton Type`

- Declare `Annotation Type` 

- `Custom Annotation` part
```java
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention({RetentionPolicy.RUNTIME})
@Target({ElementType.ANNOTATION_TYPE})
public @interface CustomAnnotation(){
    String getUserName() default "홍길동";
    int getUserAge() default 20;
}
```

- The `Class` that calls `Custom Annotation` METHODS
```java
import CustomAnnotation;

import static java.lang.System.out;

public class CustomClass(){
    @CustomAnnotation
    public void method1(){
        out.println("Method 1 Test");
    }

    @CustomAnnotation(getUserName="김길동")
    public void method2(){
        out.println("Method 2 Test");
    }

    @CustomAnnotation(getUserName="김파랑", getUserAge=30)
    public void method3(){
        out.println("Method 3 Test");
    }
}
```

- `Main program` that creates `Custom Annotation Instance`
```java
import CustomAnnotation;

public class CustomAnnotationExample(){
    public static void main(String[] args){
        Method[] methodList = CustomAnnotation.class.getMethods();
        out.println(methodList);
    }
}

```