package design.pattern.study.behavioral.visitor;

/**
 * 기능 구현 구현체 클래스
 *
 * Visitor가 들어오면 visit에 접근할 수 있도록 설정
 */
public class VisitableA implements Visitable {

    private int age;

    public VisitableA(int age) {
        super();
        this.age = age;
    }

    @Override
    public void accept(Visitor visitor) { // 해석 : visitor 객체가 들어오면~~ 이라고 해석
        visitor.visit(this);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
