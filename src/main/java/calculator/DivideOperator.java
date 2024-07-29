package calculator;

public class DivideOperator implements Operator {

    public char type;

    public DivideOperator(char operatorType) {
        this.type = operatorType;
    }

    @Override
    public int operate(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Divide by zero");
        }
        int result = num1 / num2;

        return result;
    }

}