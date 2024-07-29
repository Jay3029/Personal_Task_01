package calculator.Operator;

public class DivideOperator<T extends Number> implements Operator<T> {

    public Class<T> type;

    public DivideOperator(Class<T> operatorType) {
        this.type = operatorType;
    }

    @Override
    public T operate(T num1, T num2) {
        if (num2.doubleValue() == 0) {
            throw new ArithmeticException("Divide by zero");
        }
        double result = num1.doubleValue() / num2.doubleValue();

        return (T) Double.valueOf(result);
    }

}