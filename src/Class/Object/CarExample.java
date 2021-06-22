package Class.Object;

import static java.lang.System.out;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();
        out.println(car);

        car.name = "그랜져";
        car.company = "현대자동차";

        out.println(car);
    }
}
