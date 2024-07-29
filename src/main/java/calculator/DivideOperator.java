package calculator;

public class DivideOperator implements Operator {

    public String type;

    public DivideOperator(String operatorType) {
        this.type = operatorType;
    }

    @Override
    public int operate(int num1, int num2) {

        int result = num1 / num2;

        return result;
    }

}