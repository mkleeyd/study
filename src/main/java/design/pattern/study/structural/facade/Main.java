package design.pattern.study.structural.facade;

import design.pattern.study.structural.facade.system.Facade;

/**
 * <퍼사드 패턴___구조>
 *   - 복잡한 과정을 간단하게 제공
 *   - "복잡한 과정"을 "간단"하게 표현하는 퍼사드 패턴을 이해한다
 *   - 단순한 접근
 *
 * 예제 요구사항
 *   -
 *
 * <관통되는 개념 요약>
 *    - "기능 정의(추상 클래스)"와 "기능 사용(상속)" 확장 쌍 ||| "기능 선언(인터페이스)"와 "기능 구현(재정의 구현체)" 다형성 쌍
 *
 *    - 서브 시스템을 하나로 묶어서 한번에 호출만으로 처리하는 일반적인 구조 패턴
 *    - 추상 클래스로 만들어서 기능 정의하여 해도 비슷할것 같지만 클라이언트에서 객체 생성할 때 추상 클래스는 생성할 수 없기 때문에 일반 클래스를 이용한 것
 */
public class Main {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.process();

        // HelpSystem01 클래스는 default 접근 제한자로 되어 있기 었어서 패키지가 다르면 접근이 안되게 됨(보안 좋음)
//        HelpSystem01.process();
    }
}/////
