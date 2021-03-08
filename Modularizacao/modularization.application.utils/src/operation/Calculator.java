package operation;

import operation.internal.DivHelper;
import operation.internal.MultiHelper;
import operation.internal.SubHelper;
import operation.internal.SumHelper;

public class Calculator {

    private SumHelper sumHelper;
    private SubHelper subHelper;
    private MultiHelper multiHelper;
    private DivHelper divHelper;

    public Calculator(){
        sumHelper = new SumHelper();
        subHelper = new SubHelper();
        multiHelper = new MultiHelper();
        divHelper = new DivHelper();
    }

    public int sum(int valueOne, int valueTwo){
        return sumHelper.execute(valueOne,valueTwo);
    }

    public int sub(int valueOne, int valueTwo){
        return subHelper.execute(valueOne,valueTwo);
    }

    public int multi(int valueOne, int valueTwo){
        return multiHelper.execute(valueOne,valueTwo);
    }

    public int div(int valueOne, int valueTwo){
        return divHelper.execute(valueOne,valueTwo);
    }
}
