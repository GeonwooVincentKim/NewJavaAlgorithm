package Class.ClassStructor;

import static java.lang.System.out;

public class CarMain2 {
    public static void main(String[] args) {
        Cars tico = new Cars("화이트", "대우", "경차");
        Cars pride = new Cars();

        out.println(tico);
        out.println(pride);

        // tico.color = "화이트";
        // out.println(tico.color);
    }
}
