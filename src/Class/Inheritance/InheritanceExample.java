package Class.Inheritance;

import static java.lang.System.out;

class Parent {
    Parent() {
        this(1);
        out.print("(1) -> Parent Class Initializer without Parameter");
        out.println();
    }

    // Could be run the risk that in the lines above this constructor's referencing
    // a state in the superclass that's not initialized yet.

    // And the compiler cannot be sure of which `this` method it will going to
    // execute
    // So it occurs error `Constructor call must be the first statement in a
    // constructor`.

    // Parent() {
    // this(1);
    // this("String");
    // out.print("(1) -> Parent Class Initializer without Parameter");
    // out.println();
    // }

    Parent(int intParameter) {
        this("String");
        out.print("(2) -> Parent Class Initializer with Integer Parameter");
        out.println();
    }

    Parent(String stringParameter) {
        out.print("(2-1) -> Parent Class Initializer with String Parameter");
        out.println();
    }
}

class Child extends Parent {
    Child() {
        this(1);
        out.print("(3) -> Child Class Initializer without Parameter");
    }

    Child(int childIntParameter) {
        this("String2");
        out.print("(4) -> Child Class Initializer with Integer Parameter");
        out.println();
    }

    Child(String childStringParameter) {
        out.print("(4-1) -> Child Class Initializer with String Parameter");
        out.println();
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        // out.println();
        // Parent p = new Parent();
        // out.println(p);

        out.println();
        Child c = new Child();
        out.println(c);
    }
}
