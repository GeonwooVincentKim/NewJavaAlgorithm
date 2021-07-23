package Class.Object.String.StringHandler;

public class StringHandler {
    private int integerNumber;
    private long longNumber;
    private Double doubleNumber;

    StringHandler() {
        this(0, 0L, 0.0);
    }

    StringHandler(int integerNumber) {
        // this.setIntegerNumber(integerNumber);
        this(integerNumber, 0L, 0.0);
    }

    StringHandler(Long longNumber) {
        this(0, longNumber, 0.0);
    }

    StringHandler(Double doubleNumber) {
        this(0, 0L, doubleNumber);
    }

    StringHandler(int integerNumber, long longNumber, Double doubleNumber) {
        this.setIntegerNumber(integerNumber);
        this.setLongNumber(longNumber);
        this.setDoubleNumber(doubleNumber);
        // this(integerNumber, longNumber, doubleNumber);
    }

    public int getIntegerNumber() {
        return integerNumber;
    }

    public void setIntegerNumber(int integerNumber) {
        this.integerNumber = integerNumber;
    }

    public long getLongNumber() {
        return longNumber;
    }

    public void setLongNumber(long longNumber) {
        this.longNumber = longNumber;
    }

    public Double getDoubleNumber() {
        return doubleNumber;
    }

    public void setDoubleNumber(double doubleNumber) {
        this.doubleNumber = doubleNumber;
    }
}
