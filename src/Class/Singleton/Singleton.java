package Class.Singleton;

import static java.lang.System.out;

public class Singleton {
    // Static Variable
    private static Singleton instance = new Singleton();

    // Private Access Modifier in Initializer
    private Singleton() {
        out.println("객체 생성");
    }

    // Static Method
    public static Singleton getInstance() {
        out.println("객체 리턴");
        return instance;
    }
}
