package design.pattern.study.creational.abstractfactory.abst01;

/**
 * 생성을 담당하는 설계도 객체
 */
public interface BikeFactory {

    public Body createBody();
    public Wheel createWheel();

}/////
