package design.pattern.study.behavioral.visitor;

/**
 * 기능 구현 구현체 클래스
 */
public class VisitorA implements Visitor {

    private int ageSum;

    public VisitorA() {
        ageSum = 0;
    }

    @Override
    public void visit(Visitable visitable) {
        if (visitable instanceof VisitableA) { // visitable 이 VisitableA 구현체라면
            ageSum += ((VisitableA) visitable).getAge();
        } else {
            // 작업...
        }
    }

    public int getAgeSum() {
        return ageSum;
    }

    public void setAgeSum(int ageSum) {
        this.ageSum = ageSum;
    }
}
