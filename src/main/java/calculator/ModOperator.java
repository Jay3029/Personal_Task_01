package calculator;

public class ModOperator implements Operator {

    public String type;

    public ModOperator(String operatorType) {
        this.type = operatorType;
    }

    @Override
    public int operate(int num1, int num2) {

        int  result = num1 % num2;

        return result;
    }
}
