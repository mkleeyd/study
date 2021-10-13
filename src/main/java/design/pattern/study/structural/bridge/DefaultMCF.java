package design.pattern.study.structural.bridge;

/**
 * 기능 구현 구현체 클래스
 */
public class DefaultMCF implements MorseCodeFunction {

    @Override
    public void dot() {
        System.out.print("·");
    }

    @Override
    public void dash() {
        System.out.print("-");
    }

    @Override
    public void space() {
        System.out.print(" ");
    }
}
