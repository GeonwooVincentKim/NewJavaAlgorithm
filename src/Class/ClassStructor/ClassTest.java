package Class.ClassStructor;

public class ClassTest {
    private int number;

    public ClassTest() {

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ClassTest(int number) {
        this.setNumber(number);
    }
}
