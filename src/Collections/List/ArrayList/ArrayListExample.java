package Collections.List.ArrayList;

import static java.lang.System.out;

// import java.util.List;
// import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        CustomArrayList customArrayList = new CustomArrayList();
        out.println(customArrayList);

        customArrayList.add("Test");
        customArrayList.add("Exam");
        customArrayList.add("Print");

        customArrayList.add(1, "No Test");
        customArrayList.add(3, "Print");

        out.println(customArrayList.getSize());
        for (int i = 0; i < customArrayList.getSize(); i++) {
            out.println(customArrayList.get(i));
            // out.println(customArrayList.getIndex());
            // if (!customArrayList.isContain(customArrayList, customArrayList.get(i))) {

            // }
            // if (!customArrayList.isContain(customArrayList, i)) {
            // if (!customArrayList.isContain(customArrayList, 3)) {
            // out.println("확인 중입니다.");
            // customArrayList.remove(i);
            // }
        }

        out.println();

        CustomArrayList newCustomArrayList = new CustomArrayList();
        for (int i = 0; i < customArrayList.getSize(); i++) {
            if (!newCustomArrayList.isContain(customArrayList)) {
                newCustomArrayList.add(customArrayList.get(i));
                // out.println("흠...");
                // out.println(newCustomArrayList.get(i));
            }
        }

        out.println();

        for (int i = 0; i < customArrayList.getSize(); i++) {
            out.println(newCustomArrayList.get(i));
        }

        int arraySize = customArrayList.getSize();
        out.println(arraySize);
    }
}
