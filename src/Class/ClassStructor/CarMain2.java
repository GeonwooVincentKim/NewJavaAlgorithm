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
            cars[i] = new Cars();
            cars[i].color = "화이트";
            cars[i].company = "대우";
            cars[i].type = "경차";
        }

        out.println("0번 인덱스 color : " + cars[0].color);
        out.println("1번 인덱스 color : " + cars[1].color);
        out.println("2번 인덱스 color : " + cars[2].color);

        cars[0].color = "블랙";
        out.println();

        out.println("0번 인덱스 color : " + cars[0].color);
        out.println("1번 인덱스 color : " + cars[1].color);
        out.println("2번 인덱스 color : " + cars[2].color);
    }
}
