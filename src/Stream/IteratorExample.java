package Stream;

import java.util.ArrayList;
import java.util.Iterator;
// import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

public class IteratorExample {
    public static void main(String[] args) {
        String[] array = { "홍길동", "김유신", "이순신", "유관순" };

        List<String> arrayList = new ArrayList<String>();

        // 1. For-Loop
        out.println("for 문 이용 -> (Array 사용)");
        for (int i = 0; i < array.length; i++) {
            arrayList.add(array[i]);
            out.print(arrayList.get(i) + " ");
        }

        out.println(arrayList);
        out.println("-----------------------------");

        // 2. Outer-Iterator
        out.println("외부 반복자 이용 -> (Array 사용)");
        Iterator<String> iterator = arrayList.iterator();
        out.println(iterator);

        while (iterator.hasNext()) {
            out.println(iterator.next());
        }

        out.println("-----------------------------");

        // 3. Inner-Iterator
        out.println("내부 반복자 이용 -> (Array 사용)");
        arrayList.stream().forEach(s -> out.println(s));

        out.println("=============================");

        // 4. For-Loop

        // List<String> list = Arrays.asList(new String[] { "홍길동", "김유신", "이순신", "유관순"
        // });
    }
}
