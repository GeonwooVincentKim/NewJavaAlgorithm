package Class.ClassStructor;

import static java.lang.System.out;

public class CarMain2 {
    public static void main(String[] args) {
        // Cars tico = new Cars("화이트", "대우", "경차");
        Cars[] cars = new Cars[3];
        Cars tico = new Cars();
        Cars pride = new Cars();

        out.println(tico);
        out.println(pride);

        tico.color = "화이트";
        tico.company = "대우";
        tico.type = "경차";

        out.println(tico.color);
        out.println(tico.company);
        out.println(tico.type);

        for (int i = 0; i < cars.length; i++) {
            cars[i] = tico;
        }

        out.println("2번 인덱스 color : " + cars[2].color);
    }
}
