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

    public void swap(T n1, T n2) {
        T temp = n1;
        n1 = n2;
        n2 = temp;
    }
}
