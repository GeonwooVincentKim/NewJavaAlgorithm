package Class.ClassStructor.SingleTon;

import static java.lang.System.out;

public class Singleton {
    public static Singleton instance = new Singleton();

    private Singleton() {
        out.println("객체 생성");
        // Singleton singleton = new Singleton();
    }

    public static Singleton getInstance() {
        out.println("생성된 객체 Return");
        return instance;
    }
}
