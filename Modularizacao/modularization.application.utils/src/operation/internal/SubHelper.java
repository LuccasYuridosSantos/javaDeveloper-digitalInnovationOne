package operation.internal;

public class SubHelper implements Operation {
    @Override
    public int execute(int firstValue, int secondValue) {
        return firstValue - secondValue;
    }
}
