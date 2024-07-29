package calculator;

import java.util.ArrayList;
import java.util.List;

public abstract class Calculator {

    private final List<Double> resultList;

    // 생성자
    public Calculator(List<Double> results) {
        this.resultList = results;
        ArrayList<Double> result_List = new ArrayList<Double>();
    }

    // 결과값 담을 리스트
    public List<Double> getResult() {
        return resultList;
    }

    // 리스트에 담기
    public void setResult(double result) {
        resultList.add(result);
        System.out.println("저장완료");
    }


    // 저장된 결과값 제거
    public void removeResultList(int idx) {
        this.resultList.remove(idx);
    }

    // 조회
    /*
    public void inquiryResultList() {
        String result_All = resultList.toString();
        System.out.println(result_All);
    }*/

    // 리스트 조회
    public abstract void inquiryResultList();

    // 람다 스트림


}
