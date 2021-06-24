package Stream;

import java.util.ArrayList;
// import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

public class IteratorExample {
    public static void main(String[] args) {
        String[] array = { "홍길동", "김유신", "이순신", "유관순" };

        List<String> arrayList = new ArrayList<String>();

        for (int i = 0; i < array.length; i++) {
            arrayList.add(array[i]);
            out.print(arrayList.get(i) + " ");
        }

        // List<String> list = Arrays.asList(new String[] { "홍길동", "김유신", "이순신", "유관순"
        // });
        out.println(arrayList);
    }
}
