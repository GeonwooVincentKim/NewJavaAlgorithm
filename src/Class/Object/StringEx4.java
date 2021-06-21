package Class.Object;

import static java.lang.System.out;

public class StringEx4 {
    public static void main(String[] args) {
        String text = "Hello My Name is Hong Gil Dong";
        String charText = "GoodBye, Hong Gil Dong";
        out.println(text);

        out.println("0번 Index : " + text.charAt(0));

        for (int i = 0; i < text.length(); i++) {
            out.print(text.charAt(i) + " ");
        }

        out.println();
        out.println();
        out.println("-----------------------------------");
        out.println();

        String[] stringArray = text.split(" ");
        for (int i = 0; i < stringArray.length; i++) {
            out.println(i + " 번 Index 값 = " + stringArray[i]);
        }

        out.println();
        out.println("-----------------------------------");
        out.println();

        // char[] charArray = new char[text.length()];
        // char[] charArray = text.toCharArray();
        char[] charArray = charText.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            out.print(charArray[i] + " ");
        }

        out.println();

        String getCharArray = String.valueOf(charArray);

        String[] convertStringArray = getCharArray.split(" ");

        for (int i = 0; i < convertStringArray.length; i++) {
            out.println(i + " 번 Index 값 (Char[] -> String[]) = " + convertStringArray[i]);
        }

        out.println();
        // for (int i = 0; i < charArray.length; i++) {
        // // charArray[i] = text.charAt(i);
        // out.println(i + " 번 Index (char[]) 의 값 = " + charArray[i]);
        // }
    }
}
