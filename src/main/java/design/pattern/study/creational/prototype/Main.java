package design.pattern.study.creational.prototype;

/**
 * <프로토타입 패턴___생성>
 *   - 프로토타입 패턴을 통해서 "복잡한 인스턴스를 복사"할 수 있다
 *   - "생산 비용이 높은 인스턴스"를 복사를 통해서 쉽게 생성할 수 있도록 해주는 패턴
 *     - "종류가 너무 많아" 클래스로 정리되지 않는 경우
 *     - 클래스로부터 인스턴스 "생성이 어려운 경우"
 *
 *   - 낮은 수준의 복사 : 주소값을 그대로 복사하는 것
 *   - 높은 수준의 복사 : 주소값이 아닌 데이터만 복사하는 것 ( 자바에서 제공하는 Clone 인터페이스는 깊은 복사를 지원함 )
 *
 *
 * 예제 요구사항
 *   - 일러스트레이터와 같은 그림 그리기 툴을 개발 중입니다. 어떤 모양을 그릴 수 있도록 하고 복사 붙여넣기 기능을 구현해주세요
 *   - 복사 붙여넣기를 하면 두 도형이 겹치는데 안겹치도록 살짝 옆으로 이동하게 해주세요 
 * 
 * 
 * <관통되는 개념 요약>
 *    - 자바에서 제공하는 Clone 인터페이스를 상속받아 명시적인 인터페이스 역할을 담당하고 해당 클래스를 확장하여 구현 객체 생성
 *
 *    - 행위(기능) 추상화 객체 : 복제 Clone 인터페이스를 상속받아 명시적으로 인터페이스 역할을 하는 객체
 *    - 행위(기능) 확장 객체 : 명시적인 인터페이스 역할을 하는 클래스를 확장하여 객체 복사 수행하는 객체
 *    - 행위(기능) 사용 객체 : 완성본 호출하여 사용
 */
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Circle circle1 = new Circle(1,1,3);
        Circle circle2 = circle1.copy();
        System.out.println(circle1.getX()+", "+circle1.getY()+", "+circle1.getR());
        System.out.println(circle2.getX()+", "+circle2.getY()+", "+circle2.getR());

    }
}
