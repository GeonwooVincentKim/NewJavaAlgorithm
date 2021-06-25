package Stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

public class IteratorExample {
    public static void main(String[] args) {
        String[] array = { "홍길동", "김유신", "이순신", "유관순" };

        List<String> arrayList = new ArrayList<String>();

        // 1. For-Loop -> (Include Array)
        out.println("for 문 이용 -> (Array 사용)");
        for (int i = 0; i < array.length; i++) {
            arrayList.add(array[i]);
            out.print(arrayList.get(i) + " ");
        }

        out.println(arrayList);
        out.println("-----------------------------");

        // 2. Outer-Iterator -> (Include Array)
        out.println("외부 반복자 이용 -> (Array 사용)");
        Iterator<String> iterator = arrayList.iterator();
        out.println(iterator);

        while (iterator.hasNext()) {
            out.println(iterator.next());
        }

        out.println("-----------------------------");

        // 3. Inner-Iterator -> (Include Array)
        out.println("내부 반복자 이용 -> (Array 사용)");
        arrayList.stream().forEach(s -> out.println(s));

        out.println();
        out.println("=============================");
        out.println();

        List<String> list = Arrays.asList(new String[] { "홍길동", "김유신", "이순신", "유관순" });
        out.println(list);

        // 4. For-Loop
        out.println("for 문 이용");

        for (int i = 0; i < list.size(); i++) {
            out.println(list.get(i));
        }

        out.println("-----------------------------");

        // 5. Outer-Iterator
        out.println("외부 반복자 이용");
        Iterator<String> iterator2 = list.iterator();
        out.println(iterator2);

        while (iterator2.hasNext()) {
            out.println(iterator2.next());
        }

        out.println("-----------------------------");

        // 6. Inner-Iterator
        out.println("내부 반복자 이용");
        list.stream().forEach(s -> out.println(s));
    }
}
