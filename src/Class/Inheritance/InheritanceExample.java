package Class.Inheritance;

import static java.lang.System.out;

class Parent {
    Parent() {
        this(1);
        out.print("(1) -> Parent Class Initializer without parameter");
        out.println();
    }

    Parent(int intParameter) {
        out.print("(2) -> Parent Class Initializer with Parameter");
        out.println();
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        out.println();
        Parent p = new Parent();
        out.println(p);
    }
}
