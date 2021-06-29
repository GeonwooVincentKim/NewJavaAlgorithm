package Class.Interface.Default_Static_Method;

public class CalculatorImplementation implements Calculator {
    @Override
    public int plus(int previousNumber, int post) {
        return previousNumber + post;
    }

    @Override
    public int multi(int previousNumber, int post) {
        return previousNumber * post;
    }
}
