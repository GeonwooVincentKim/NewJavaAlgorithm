package Class.ClassStructor;

import static java.lang.System.out;

public class Cars {
    String color;
    String company;
    String type;

    public Cars() {
    }

    public Cars(String color, String company, String type) {
        this.setColor(color);
        this.setCompany(company);
        this.setType(type);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void go() {
        out.println("전진하다");
    }

    public void back() {
        out.println("후진하다");
    }
}
