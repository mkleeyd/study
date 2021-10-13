package design.pattern.study.structural.Proxy;

/**
 * 기능 구현 구현체 클래스
 *
 * 복잡한 업무 로직을 구현한 클래스
 */
public class RealSubject implements Subject {

    @Override
    public void action1() {
        System.out.println("간단한 업무 by 실제");
    }

    @Override
    public void action2() {
        System.out.println("복잡한 업무 by 실제");
    }
}/////
