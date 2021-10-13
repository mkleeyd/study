package design.pattern.study.creational.prototype;

/**
 * 명시적으로 인터페이스 역할을 담당
 * 
 * Cloneable 인터페이스의 clone()이라는 기능을 갖는 "인터페이스 역할" 담당
 */
public class Shape implements Cloneable {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}/////
