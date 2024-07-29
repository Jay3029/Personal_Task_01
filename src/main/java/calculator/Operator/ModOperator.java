package calculator.Operator;

public class ModOperator<T extends Number> implements Operator<T> {

    public Class<T> type;

    public ModOperator(Class<T> operatorType) {
        this.type = operatorType;
    }

    @Override
    public T operate(T num1, T num2) {
        if(num2.doubleValue() == 0) {
            throw new ArithmeticException("num2 is zero");
        }

        double result = num1.doubleValue() % num2.doubleValue();

        return (T) Double.valueOf(result);
    }
}
