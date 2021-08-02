package Stream.StreamVariousType.StreamAttribute;

public class StreamController<T> {
    private T valueOne;
    private T valueTwo;

    public StreamController() {
    }

    public StreamController(T valueOne, T valueTwo) {
        this.setValueOne(valueOne);
        this.setValueTwo(valueTwo);
    }

    public T getValueOne() {
        return valueOne;
    }

    public void setValueOne(T valueOne) {
        this.valueOne = valueOne;
    }

    public T getValueTwo() {
        return valueTwo;
    }

    public void setValueTwo(T valueTwo) {
        this.valueTwo = valueTwo;
    }
}
