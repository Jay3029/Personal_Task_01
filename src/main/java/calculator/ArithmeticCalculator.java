package calculator;

import java.util.List;

public class ArithmeticCalculator extends Calculator {

    public String type;

    public ArithmeticCalculator(List<Double> result_Arith, String operator) {
        super(result_Arith);
        this.type = operator;
    }
    
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

    public void calculate_Arith(String operator, double num1, double num2) {
        return callOperator(operator).;
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
