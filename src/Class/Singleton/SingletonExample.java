package Class.Singleton;

import static java.lang.System.out;

public class SingletonExample {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        out.println(s1);

        Singleton s2 = Singleton.getInstance();
        out.println(s2);

        Singleton s3 = Singleton.getInstance();
        out.println(s3);
    }
}
