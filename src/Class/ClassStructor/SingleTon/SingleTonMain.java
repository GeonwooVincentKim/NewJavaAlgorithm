package Class.ClassStructor.SingleTon;

import static java.lang.System.out;

public class SingleTonMain {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        out.println(singleton);

        Singleton singleton2 = Singleton.getInstance();
        out.println(singleton2);

        Singleton singleton3 = Singleton.getInstance();
        out.println(singleton3);
    }
}
