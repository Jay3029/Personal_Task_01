package calculator;

public class ModOperator implements Operator {

    public char type;

    public ModOperator(char operatorType) {
        this.type = operatorType;
    }

    @Override
    public int operate(int num1, int num2) {

        int  result = num1 % num2;

        return result;
    }
}
