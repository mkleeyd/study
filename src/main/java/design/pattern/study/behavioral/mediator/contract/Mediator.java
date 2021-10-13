package design.pattern.study.behavioral.mediator.contract;

import java.util.ArrayList;
import java.util.List;

/**
 * 기능 정의 추상 클래스
 * 중자자 클래스
 */
public abstract class Mediator {

    // 외부에 노출은 하지 않지만 상속받아 사용할 수 있도록 protected 범위 지정
    protected List<Colleague> colleagues = new ArrayList<>();

    public boolean addColleague(Colleague colleague) {
        if (colleagues != null) {
            return colleagues.add(colleague);
        } else {
            return false;
        }
    }

    abstract public void mediate(String data);

}/////
