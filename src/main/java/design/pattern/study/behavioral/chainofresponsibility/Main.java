package design.pattern.study.behavioral.chainofresponsibility;

/**
 * <책임사슬 패턴___행위>
 *   - "다양한 처리" 방식을 "유연"하게 연결할 수 있다
 *   - 하나의 객체만 책임을 지지 않고 여러가지 객체가 책임을 다 같지 지어도 괜찮음
 *   - 동적으로도 책임 사슬에 책임을 추가할 수 있다
 *
 * 예제 요구사항
 *   - 사칙 연산을 하는 프로그램
 *
 * <관통되는 개념 요약>
 *    "기능 정의(추상 클래스)"와 "기능 사용(상속)" 확장 쌍 ||| "기능 선언(인터페이스)"와 "기능 구현(재정의 구현체)" 다형성 쌍
 *
 *    - 사용할 객체를 파라미터로 넘겨 기능 정의(추상 클래스)에서 책임질 객체를 선정하고 기능 사용(알고리즘 작성) 확장 객체에서 로직 실행
 *    - 구현체 2개를 생성 > 첫번째 구현체에서 처리 못할 시 다음에 처리할 객체 미리 set해놓음 > 먼저 처리할 객체에 파라미터 전달 > 연산이 성공했다면 true 반환하고 그대로 값 반환, 아니라면 set 해놓은 구현체의 기능에 파라미터 전달하여 다음 구현체에게 기능 넘김(기능 분리)
 *    - 구조 패턴 중 "프록시 패턴" 과 살짝 비슷한 느낌(자신이 처리할 것 기능과 아닌 기능 분리. 대신, 여긴 체인 형식으로 미리 셋팅 되어 있음)
 */
public class Main {

    public static void main(String[] args) {
        Calculator plus = new PlusCalculator(); // 플러스
        Calculator sub = new SubCalculator(); // 마이너스

        plus.setNextCalculator(sub);

        Request request1 = new Request(1, 2, "+");
        Request request2 = new Request(10, 2, "-");

        plus.process(request1); // + 라서 내가 처리가 가능하다면 내가 처리하고 안되면 다음으로 넘겨줌
        plus.process(request2);
    }
}/////

