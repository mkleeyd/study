package design.pattern.study.structural.flyweight;

/**
 * <플라이웨이트 패턴___구조>
 *   - 메모리 절약하기
 *   - 복싱에서 플라이급은 48kg < 플라이급 < 51kg 으로 메모리를 절약한다는 뜻
 *   - 플라이웨이트 패턴을 통해 "메모리 공간"을 "절약"할 수 있다
 *
 * 예제 요구사항
 *   - 이미지들만 대신 관리해주는 매니저 객체
 *
 * <관통되는 개념 요약>
 *    - "기능 정의(추상 클래스)"와 "기능 사용(상속)" 확장 쌍 ||| "기능 선언(인터페이스)"와 "기능 구현(재정의 구현체)" 다형성 쌍
 *
 *    - 무거운 이미지 데이터들을 관리해주는 클래스(팩토리)를 두어 클라이언트는 팩토리를 통해서만 접근하도록 한다
 *    - 하지만 클라이언트는 내부적으로 재사용을 하는지 않하는지는 알지도 못하고 관심도 없다
 *    - 이렇게 하면 내부 코드들을 외부에 노출하지 않을 수 있는 장점이 있음(외부에서 함부로 접근하지 못하게 함)
 *    - 또, 클라이언트와 구조 사이에서 핑퐁하는 데이터들을 받아 가공, 중재, 관리, null 처리, Exception 처리 등등 많은 것들을 할 수 있음
 *    
 *    - 이 구조를 이용한 것이 아마도 JPA의 "영속성 컨텍스트 1차 캐시"일 것이다 
 */
public class Main {

    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();

        Flyweight flyweight = factory.getFlyweight("A");
        System.out.println(flyweight);

        flyweight = factory.getFlyweight("A");
        System.out.println(flyweight);

        flyweight = factory.getFlyweight("B");
        System.out.println(flyweight);

    }
}/////
