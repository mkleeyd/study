package design.pattern.study.common;

/**
 * 전략 개념 : 구현체(선언한 기능들을 구현하는 역할)
 */
public class AinterfaceImpl implements Ainterface {

    // 기능 구현
    @Override
    public void funcA() {
        System.out.println("AAA");
    }
}
