package Class.Object.String.StringHandler;

public class StringHandlerClass {
    private int integerNumber;
    private long longNumber;
    private Double doubleNumber;

    public StringHandlerClass() {
        this(0, 0L, 0.0);
    }

    public StringHandlerClass(int integerNumber) {
        this(integerNumber, 0L, 0.0);
    }

    public StringHandlerClass(Long longNumber) {
        this(0, longNumber, 0.0);
    }

    public StringHandlerClass(Double doubleNumber) {
        this(0, 0L, doubleNumber);
    }

    public StringHandlerClass(int integerNumber, long longNumber, Double doubleNumber) {
        this.setIntegerNumber(integerNumber);
        this.setLongNumber(longNumber);
        this.setDoubleNumber(doubleNumber);
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
