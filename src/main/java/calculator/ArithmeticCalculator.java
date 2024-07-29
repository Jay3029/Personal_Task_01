package calculator;

import calculator.Operator.*;

import java.util.List;

public class ArithmeticCalculator<T extends Number> extends Calculator {

    public Class<T> type;

    public ArithmeticCalculator(List<Double> result_Arith, Class<T> type) {
        super(result_Arith);
        this.type = type; //
    }

    public double calculate_Arith(char operator, T num1, T num2) {
        T result = convertOperator(operator).operate(num1, num2);
        return result.doubleValue();
    }


    private Operator<T> convertOperator(char operator) {
        OperatorType operatorType = OperatorType.returnOperatorType(operator);
        return switch (operatorType) {
            case ADD -> new AddOperator<>(type);
            case SUBTRACT -> new SubtractOperator<>(type);
            case MULTIPLY -> new MultiplyOperator<>(type);
            case DIVIDE -> new DivideOperator<>(type);
            case MOD -> new ModOperator<>(type);
        };
    }


    @Override
    public List<Double> getResult() {
        return super.getResult();
    }

    @Override
    public void setResult(double result) {
        super.setResult(result);
    }

    @Override
    public void removeResultList(int idx) {
        super.removeResultList(idx);
    }

    @Override
    public void inquiryResultList() {
        for (Double result_Arith : super.getResult()) {
            System.out.println("사칙연산 결과 = " + result_Arith);
        }
    }
}
