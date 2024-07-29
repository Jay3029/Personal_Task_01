package calculator;

public class MultiplyOperator implements Operator {

    public char type;

    public MultiplyOperator(char operatorType) {
        this.type = operatorType;
    }

    @Override
    public int operate(int num1, int num2) {

        int  result = num1 * num2;

        return result;
    }
}
