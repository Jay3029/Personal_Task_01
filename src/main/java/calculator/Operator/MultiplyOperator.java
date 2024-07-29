package calculator.Operator;

public class MultiplyOperator<T extends Number> implements Operator<T> {

    public Class<T> type;

    public MultiplyOperator(Class<T> operatorType) {
        this.type = operatorType;
    }

    @Override
    public T operate(T num1, T num2) {

        double result = num1.doubleValue() * num2.doubleValue();

        return (T) Double.valueOf(result);
    }
}
