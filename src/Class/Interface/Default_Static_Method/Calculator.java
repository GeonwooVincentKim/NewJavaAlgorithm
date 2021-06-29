package Class.Interface.Default_Static_Method;

public interface Calculator {
    public int plus(int previousNumber, int post);

    public int multi(int previousNumber, int post);

    default int executePlus(int previousNumber, int post) {
        return previousNumber + post;
    }

    static int executeMultiply(int previousNumber, int post) {
        return previousNumber * post;
    }
}
