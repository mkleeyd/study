package design.pattern.study.common;

/**
 * 기본적으로 모든 패턴들은 최소한 4가지의 객체를 포함한다
 *   0. 팩토리 객체(구조를 외부(클라이언트)에 노출하지 않도록 해주어 직접 접근을 막아 보호해주고 내부 동작을 중간에서 대신 제어 및 관리해줌)
 *               또, 클라이언트와 구조 사이에서 핑퐁하는 데이터들을 받아 가공, 중재, 관리, null 처리, Exception 처리 등등 여러가지 처리를 미들 객체에서 해줄 수 있음
 *   1. 기능 선언 인터페이스 객체
 *   1. 기능 재정의 구현체 객체
 *   2. 기능 정의 추상 클래스 객체
 *   2. 기능 상속(확장) 구현체 객체
 *   3. 호출(클라이언트) 객체
 *
 * 위임 : 보통 위임은 기능 선언(인터페이스)와 기능 구현(구현체) 다형성 쌍에게 위임 한다고 생각하면 됨
 *
 *
 * <좋은 설계>
 *   - 가장 좋은 패턴은 호출부에서 수정이 거의 없이 객체를 갈아끼우는 것만으로도 기능이 바뀌는 것이 좋은 설계 구조
 *   - 또는, 클라이언트가 코드 내부 동작을 모르게 추상화하고 호출만으로 유연하게 동작하는 구조가 좋은 설계 구조
 *     - 추상화 내부적으로는 각각의 객체가 가진 "책임(기능)"으로 쪼개져서 설계됨
 *     - 그리고 인터페이스에 너무 모든 책임을 주는건 안좋은 설계이다. 인터페이스를 여러개로 쪼개더라도 "맡은 책임"만 수행하도록 하는게 좋은 설계
 */
public class Main {

    public static void main(String[] args) {
        AObject aObject = new AObject();
        aObject.funcAA();
        
    }
}
