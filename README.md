# Personal_Task_01
계산기 제작

<Level 1>

1-1 Scanner를 사용하여 양의 정수 2개(0 포함)를 전달

1-2 Scanner를 사용하여 사칙연산 기호를 전달
1-3 입력받은 양의 정수 2개와 사칙연산 기호를 사용하여 연산을 진행한 후 결과값을 출력 (if, switch 사용, 나눗셈의 경우 분모가 0이 될 경우를 미리 예외로 해둠)
1-4 반복문을 사용하여 반복의 종료를 알려주는 “exit” 문자열을 입력하기 전까지 무한으로 계산을 진행할 수 있어야 함
1-5 연산 결과 10개를 저장할 수 있는 배열을 선언 및 생성하고 연산의 결과를 저장 (Array 사용)
1-6 연산 결과가 10개를 초과하는 경우 가장 먼저 저장된 결과를 삭제하고 새로운 연산 결과가 저장될 수 있도록 소스 코드를 수정
1-7 연산 결과가 10개로 고정되지 않고 무한이 저장될 수 있도록 소스 코드를 수정 (Array -> List)
1-8 “inquiry”라는 문자열이 입력되면 저장된 연산 결과 전부를 출력 (for each문 사용)

<Level 2>
2-1 Calculator 클래스를 생성 (메서드: 양의 정수 2개(0 포함)와 연산 기호를 매개변수로 받아 사칙연산(+,-,*,/) 기능을 수행한 후 결과 값을 반환 / 컬렉션 타입 필드: 연산 결과를 저장)
    이떄 나눗셈을 Exception 클래스를 활용해 예외처리를 진행함
2-2 App 클래스의 main 메서드에 Calculator 클래스가 활용될 수 있도록 수정 (연산 수행, 연산 결과 저장은 Calculator에서 이루어 짐)
2-3 Calculator 클래스를 캡슐화함 (Getter, Setter 메서드 구현)
2-4 Calculator 클래스에 저장된 연산 결과들 중  가장 먼저 저장된 데이터를 삭제하는 기능을 가진 메서드를 구현
2-5 Calculator 클래스에 저장된 연산 결과들을 조회하는 기능을 가진 메서드를 구현
2-6 Calculator 인스턴스를 생성(new)할 때 생성자를 통해 연산 결과를 저장하고 있는 컬렉션 필드 초기화
2-7 Calculator 클래스에 반지름을 매개변수로 전달받아 원의 넓이를 계산하여 반환해주는 메서드를 구현
    App의 main에서 사칙연산을 할지, 원의 넓이를 구할지 결정 후 진행되도록 변경, static final PI값을 설정, 이하 메서드와 필드는 사칙연산과 유사하게 작성
2-8 사칙연산을 수행하는 계산기 ArithmeticCalculator 클래스와 원과 관련된 연산을 수행하는 계산기 CircleCalculator 클래스 2개를 구현
    상속을 통해 자식클래스로 구성함
2-9 사칙연산 각각의 기능을 담당하는 AddOperator, SubtractOperator, MultiplyOperator, DivideOperator 클래스를 만들어 연산 메서드의 책임을 분리함 (Single Responsibility Principle)
2-10 ArithmeticCalculator 클래스에 추가로 나머지 연산(%) 기능을 추가하기 위해 ModOperator 클래스를 만들어 추가
    interface를 만들어 클래스 추가를 용이하게 함
