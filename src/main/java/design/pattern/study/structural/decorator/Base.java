package design.pattern.study.structural.decorator;

/**
 * 기능 구현 구현체 클래스(책임(기능)의 주체)
 */
public class Base implements IBeverage {

    @Override
    public int getTotalPrice() {
        return 0;
    }
}
