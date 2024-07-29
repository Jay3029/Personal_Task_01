package calculator.Operator;

public enum OperatorType {
    ADD('+'),
    SUBTRACT('-'),
    MULTIPLY('*'),
    DIVIDE('/'),
    MOD('%');

    private final char operator;

    OperatorType(char operatorType) {
        this.operator = operatorType;
    }

    public static OperatorType returnOperatorType(char operator) {
        try {
            // 미리 지정해둔 OperatorType 전체 순회 (.values()는 enum 에 선언된 모든 객체들을 순번대로 배열을 만든다. 주로 순회할 때 사용)
            for (OperatorType operatorType : OperatorType.values()) {
                // 입력받은 operator 와 일치한다면 해당 enum 을 반환함
                if (operatorType.operator == operator) {
                    return operatorType;
                }
            }
        } catch (Exception e) {
            // 일치하는게 없을 때 에러메시지 출력인데 정확히 어떤식의 처리를 할지 모르겠음
            System.out.println(e.getMessage());
        }
        return null; // ???
    }
}
