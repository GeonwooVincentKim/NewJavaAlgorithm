package Collections.List.ArrayList;

import static java.lang.System.out;

import java.util.List;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        CustomArrayList customArrayList = new CustomArrayList();
        out.println(customArrayList);

        customArrayList.add("Test");
        customArrayList.add("Exam");
        customArrayList.add("Print");

        customArrayList.add(1, "No Test");

        for (int i = 0; i < customArrayList.size(); i++) {
            out.println(customArrayList.get(i));
            out.println(customArrayList.getIndex());
        }
    }
}
