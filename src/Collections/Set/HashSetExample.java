package Collections.Set;

import static java.lang.System.out;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // Check that the two same String add into the `Set` or not
        Set<String> set = new HashSet<>();
        out.println(set);

        set.add(new String("abc"));
        set.add(new String("abc"));

        out.println(set);

        // Check that the two same Member Object add into the `Set` or not
        Set<Member> set1 = new HashSet<>();
        out.println(set1);

        set1.add(new Member("홍길동", 40));
        set1.add(new Member("홍길동", 40));

        out.println(set1);
    }
}
