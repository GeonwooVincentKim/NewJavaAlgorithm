package Class.ClassConstructor;

public class Car2 {
    String color;
    String company;
    String type;

    Car2() {
        this("White", "기아", "경차");
    }

    Car2(String color, String company, String type) {
        this.color = color;
        this.company = company;
        this.type = type;
    }

    Car2(String company, String type) {
        this("white", company, type);
    }

    Car2(String type) {
        this("white", "기아", type);
    }

    public String toString() {
        return color + "-" + company + "-" + type;
    }
}
