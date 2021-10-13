package design.pattern.study.behavioral.visitor;

/**
 * 기능 선언 인터페이스
 */
public interface Visitable {

    public void accept(Visitor visitor);

}
