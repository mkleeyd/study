package design.pattern.study.behavioral.state;

/**
 * <상태 패턴___행위>
 *   - 상태를 객체로 나타내기
 *   - 상태 패턴을 통해 "상태"를 "객체"로 나타내고 "행동"을 구현 한다
 *   - 전략 패턴(델리게이트 사용)과 구조가 완전 동일하지만, 전략 패턴은 "알고리즘을 변경"해주는 것이고 상태 패턴은 "이벤트로 발생된 상태를 변경"해주는 것
 *
 * 예제 요구사항
 *   -
 *
 * <관통되는 개념 요약>
 *    - "기능 정의(추상 클래스)"와 "기능 사용(상속)" 확장 쌍 ||| "기능 선언(인터페이스)"와 "기능 구현(재정의 구현체)" 다형성 쌍
 *
 *    - 옵저버 패턴처럼 내부에 인터페이스를 두고 이벤트에 의한 상태에 따라 인터페이스에 선언된 상태이 변경되도록 설계
 */
public class Main {

    public static void main(String[] args) {
        Light light = new Light();
        light.off();
        light.off();
        light.off();

        light.on();
        light.on();
        light.on();

        light.off();
        light.on();
        light.off();
        light.on();
        light.off();
        light.on();
    }
}/////
