package Class.ClassStructor;

import static java.lang.System.out;

public class Cars {
    private String car;
    private String company;
    private String type;

    public Cars() {
    }

    public Cars(String car, String company, String type) {
        this.setCar(car);
        this.setCompany(company);
        this.setType(type);
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
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
