import static java.lang.System.out;

public class App {
    public static void main(String[] args) throws Exception {
        target: for (int i = 0; i < 5; i++) {
            // out.println(i);
            for (int j = 0; j < 5; j++) {
                if (j == 3) {
                    continue target;
                }
                out.println("i = " + i + ", j = " + j);
            }
        }
    }
}
