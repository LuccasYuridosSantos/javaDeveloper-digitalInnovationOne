package operation.internal;

public class SumHelper implements Operation {


    @Override
    public int execute(int firstValue, int secondValue) {
        return firstValue + secondValue;
    }
}
