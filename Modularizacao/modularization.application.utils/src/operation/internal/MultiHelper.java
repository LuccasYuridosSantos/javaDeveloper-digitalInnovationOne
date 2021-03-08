package operation.internal;

public class MultiHelper implements Operation {
    @Override
    public int execute(int firstValue, int secondValue) {
        return firstValue * secondValue;
    }
}
