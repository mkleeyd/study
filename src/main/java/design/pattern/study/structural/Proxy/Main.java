package design.pattern.study.structural.Proxy;

/**
 * <프록시 패턴___구조>
 *   - 대리인 내새우기
 *   - 프록시 패턴을 통해 "작업"을 "나누어" 구현 할 수 있다
 *   - 프록시에서 처리 가능한 업무를 제외한 다른 업무는 다른 객체에게 작업을 위임
 *
 * 예제 요구사항
 *   -
 *
 * <관통되는 개념 요약>
 *    - "기능 정의(추상 클래스)"와 "기능 사용(상속)" 확장 쌍 ||| "기능 선언(인터페이스)"와 "기능 구현(재정의 구현체)" 다형성 쌍
 *
 *    - 프록시에 작업을 시키면 리소스가 적게 드는 작업은 프록시 객체가 처리하고 리소스가 많이 드는 작업은 다른 객체에게 위임하여 처리하는 구조 
 */
public class Main {

    public static void main(String[] args) {
        Subject real = new RealSubject();
        Subject proxy1 = new Proxy(real);
        Subject proxy2 = new Proxy(real);

        proxy1.action1();
        proxy2.action1();

        proxy1.action2();
        proxy2.action2();
    }
}/////
