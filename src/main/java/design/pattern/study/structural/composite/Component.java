package design.pattern.study.structural.composite;

/**
 * 인터페이스로 만들지 추상 클래스로 만들지는 해당 객체가 멤버가 필요하냐 필요하지 않냐에 따라서 결정됨
 *
 * 기능 선언 추상 클래스
 */
public abstract class Component {

    private String name;

    public Component(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
