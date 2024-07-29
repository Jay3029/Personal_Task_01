package calculator;

import java.util.List;

public class CircleCalculator extends Calculator {

    private static final double PI = 3.141592;

    public CircleCalculator(List<Double> result_Circle) {
        super(result_Circle);
    }

    public double calculate_Circle(int radius) {
        return PI * radius * radius;
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
        for (Double circleResult : super.getResult()) {
            System.out.println("원의 넚이 = " + circleResult);
        }
    }

}
