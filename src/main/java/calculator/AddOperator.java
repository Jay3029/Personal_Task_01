package calculator;

public class AddOperator implements Operator {

    public char type;

    public AddOperator(char operatorType) {
        this.type = operatorType;
    }

    @Override
    public int operate(int num1, int num2) {

        int  result = num1 + num2;

        return result;
    }
}
