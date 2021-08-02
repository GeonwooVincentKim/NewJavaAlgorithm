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
        out.println("for 문 이용 -> (Array 사용)\n");

        long start = System.currentTimeMillis();
        out.println("for 문 이용 시작 시간 : " + start);

        for (int i = 0; i < array.length; i++) {
            arrayList.add(array[i]);
            out.print(arrayList.get(i) + " ");
        }

        long end = System.currentTimeMillis();
        out.println("for 문 이용 종료 시간 : " + end);
        out.println("for 문 이용 총 소요 시간 : " + (end - start) + "밀리 초");

        out.println();

        out.println(arrayList);
        out.println("-----------------------------");

        // 2. Outer-Iterator -> (Include Array)
        out.println("외부 반복자 이용 -> (Array 사용)\n");
        Iterator<String> iterator = arrayList.iterator();
        out.println(iterator);

        start = System.currentTimeMillis();
        out.println("외부 반복자 이용 시작 시간 : " + start);

        while (iterator.hasNext()) {
            out.println(iterator.next());
        }

        end = System.currentTimeMillis();
        out.println("외부 반복자 문 이용 종료 시간 : " + end);
        out.println("외부 반복자 문 이용 총 소요 시간 : " + (end - start) + "밀리 초");

        out.println();

        out.println("-----------------------------");

        // 3. Inner-Iterator -> (Include Array)
        out.println("내부 반복자 이용 -> (Array 사용)\n");

        start = System.currentTimeMillis();
        out.println("내부 반복자 이용 시작 시간 : " + start);

        arrayList.stream().forEach(s -> out.println(s));

        end = System.currentTimeMillis();
        out.println("내부 반복자 문 이용 종료 시간 : " + end);
        out.println("내부 반복자 문 이용 총 소요 시간 : " + (end - start) + "밀리 초");

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
