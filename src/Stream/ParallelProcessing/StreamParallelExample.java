package Stream.ParallelProcessing;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.List;

public class StreamParallelExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 100; i++) {
            list.add(i);
            out.print(list.get(i) + " ");
        }

        out.println();

        long start = System.nanoTime();
        out.println(start);

        // Calculating Sequential Streams calculation times
        list.stream().forEach(a -> {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                out.println(e.getClass());
                out.println("----------------");
                e.printStackTrace();
            }
        });

        long end = System.nanoTime();
        out.println(end);

        out.println("순차 스트림 처리 시간 : " + (end - start) + " nano sec");

        start = System.nanoTime();
        out.println(start);

        // Calculating Parallel Stream Calculation times
        list.parallelStream().forEach(a -> {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                out.print(e.getClass());
                out.println("----------------");
                e.printStackTrace();
            }
        });

        end = System.nanoTime();
        out.println(end);

        out.println("병렬 스트림 처리 시간 : " + (end - start) + " nano sec");
    }
}
