package design.pattern.study.structural.Proxy;

/**
 * 기능 구현 구현체 클래스
 *
 * 간단한 업무 로직을 구현한 클래스
 */
public class Proxy implements Subject{

    private Subject real;

    public Proxy(Subject real) {
        this.real = real;
    }

    @Override
    public void action1() {
        System.out.println("간단한 업무 by 프록시");
    }

    @Override
    public void action2() {
        this.real.action2();
    }
}/////
