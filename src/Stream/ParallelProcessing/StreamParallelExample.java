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

    }
}
