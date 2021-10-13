package design.pattern.study.creational.builder.builder01;

/**
 * 다형성 구체화 설계도 객체
 */
public class LgGramBlueprint extends BluePrint {

    private Computer computer; // 구체적인 다형성 설계도에서 완성본을 반환해줄 것이냐 아니면 객체 생성 설계도에서 반환해줄 것이냐는 선택

    // 여기서 직접 인자를 갖고 getComputer() 호출 시 new로 결과 객체 생성해서 반환해주는 것도 가능함
//    private String cpu;
//    private String ram;
//    private String storage;

    public LgGramBlueprint() {
        this.computer = new Computer("default","default", "default");
    }

    // 생성된 결과물 객체 반환해줌
    @Override
    public Computer getComputer() {
        return computer;
    }

    @Override
    public void setCpu() {
        computer.setCpu("i7");
    }

    @Override
    public void setRam() {
        computer.setRam("8g");
    }

    @Override
    public void setStorage() {
        computer.setStorage("256g ssd");
    }
}
