package calculator;

public class SubstractOperator implements Operator {

    public String type;

    public SubstractOperator(String operatorType) {
        this.type = operatorType;
    }

    @Override
    public int operate(int num1, int num2) {

        int  result = num1 - num2;

        return result;
    }
}
