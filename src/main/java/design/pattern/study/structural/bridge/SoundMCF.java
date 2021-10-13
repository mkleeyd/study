package design.pattern.study.structural.bridge;

/**
 * 기능 구현 구현체 클래스
 */
public class SoundMCF implements MorseCodeFunction {

    @Override
    public void dot() {
        System.out.print("삣");
    }

    @Override
    public void dash() {
        System.out.print("삐");
    }

    @Override
    public void space() {
        System.out.print("음");
    }
}
