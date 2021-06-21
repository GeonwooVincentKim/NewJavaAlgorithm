package Class.Object;

import static java.lang.System.out;

public class StringEx4 {
    public static void main(String[] args) {
        String text = "Hello My Name is Hong Gil Dong";
        out.println(text);

        out.println("0번 Index : " + text.charAt(0));

        for (int i = 0; i < text.length(); i++) {
            out.print(text.charAt(i) + " ");
        }

        String[] stringArray = text.split(" ");
        for (int i = 0; i < stringArray.length; i++) {
            out.println(i + " 번 Index 값 = " + stringArray[i]);
        }
    }
}
