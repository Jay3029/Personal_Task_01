package calculator;

import java.util.List;

public class ArithmeticCalculator extends Calculator {

    public ArithmeticCalculator(List<Double> result_Arith) {
        super(result_Arith);
    }

    /*
    // 연산기호에 맞는 Operator 생성
    private void callOperator(String operator) {

        OperatorType operatorType = OperatorType.returnOperatorType(operator);

        switch (operatorType) {
            case ADD: new AddOperator(operator);
            case SUBSTRACT: new SubstractOperator(operator);
            case MULTIPLY: new MultiplyOperator(operator);
            case DIVIDE: new DivideOperator(operator);
            case MOD: new ModOperator(operator);
            default: System.out.println();
        };
    }
    */
    public double calculate_Arith(char operator, int num1, int num2) {
        OperatorType operatorType = OperatorType.returnOperatorType(operator);

        switch (operatorType) {
            case ADD: {
                AddOperator addop = new AddOperator(operator);
                return addop.operate(num1, num2);
            }
            case SUBSTRACT: {
                SubstractOperator subop = new SubstractOperator(operator);
                return subop.operate(num1, num2);
            }
            case MULTIPLY: {
                MultiplyOperator mulop = new MultiplyOperator(operator);
                return mulop.operate(num1, num2);
            }
            case DIVIDE: {
                DivideOperator divop = new DivideOperator(operator);
                return divop.operate(num1, num2);
            }
            case MOD: {
                ModOperator modop = new ModOperator(operator);
                return modop.operate(num1, num2);
            }
        };
        return 0;
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
