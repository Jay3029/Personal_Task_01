package calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("계산기!");

        Scanner sc = new Scanner(System.in);


        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(new ArrayList<>());
        CircleCalculator circleCalculator = new CircleCalculator(new ArrayList<>());

        // 1회 시행 후 반복할지 안할지 결정하기 위해 do-while 문 사용
        do {

            System.out.println("수행할 연산: 1.사칙연산  2.원의넓이");
            int choice = sc.nextInt();

            if (choice == 1) {

                // Scanner를 사용해서 입력값 받기
                System.out.print("첫 번째 숫자(양의 정수)를 입력하세요: ");
                int num1 = sc.nextInt();
                System.out.print("두 번째 숫자(양의 정수)를 입력하세요: ");
                int num2 = sc.nextInt();
                System.out.print("사칙연산 기호(+,-,*,/,%)를 입력하세요: ");
                char operator = sc.next().charAt(0);

                // 사칙연산 수행
                double result = arithmeticCalculator.calculate_Arith(operator, num1, num2);
                System.out.println("사칙 연산의 결과는 " + result + " 입니다.");

                // 계산 결과 저장
                arithmeticCalculator.getResult().add(result);


                // 가장 먼저 저장된 연산 결과값 제거
                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                if (Objects.equals(sc.next(), "remove")) {
                    arithmeticCalculator.removeResultList(0);
                }

                // 연산 결과 조회
                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                if (Objects.equals(sc.next(), "inquiry")) {
                    arithmeticCalculator.inquiryResultList();
                }

                // 이십라샠키
                System.out.println("저장된 연산결과 중 입력한 값보다 큰 값들을 조회하시겠습니까? (lambda 입력시 조회)");
                if (Objects.equals(sc.next(), "lambda")) {
                    System.out.println("기준 값을 입력하세요: ");
                    double standardNum = sc.nextDouble();
                }




            } else if (choice == 2) {

                System.out.println("구하고자 하는 원의 반지름을 입력하세요: ");
                int radius = sc.nextInt();

                // 반지름을 통해 원의 넓이 구하기
                double circleArea = circleCalculator.calculate_Circle(radius);

                // 원의 넓이 저장
                circleCalculator.getResult().add(circleArea);

                // 원의 넓이 결과값 출력
                System.out.println("원의 넓이는 " + circleArea + " 입니다.");

                // 저장되어있는 원의 넓이 결과값 조회
                circleCalculator.inquiryResultList();

            }



            System.out.println("더 계산하시겠습니까? (exit 입력시 종료)");

        } while (!sc.next().equals("exit"));

    }
}
