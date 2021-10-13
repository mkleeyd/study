package design.pattern.study.behavioral.mediator.contract;

/**
 * 기능 정의 추상 클래스
 * 중자재 클래스에 붙어 사용하는 사용자 역할 클래스
 */
public abstract class Colleague {

    private Mediator mediator; // 자기가 어떤 중재자에 속해있는지 확인용

    public boolean join(Mediator mediator) {
        if (mediator == null) return false;
        this.mediator = mediator;
        return mediator.addColleague(this);
    }

    public void sendData(String data) {
        if (mediator != null) {
            mediator.mediate(data);
        }
    }

    abstract public void handle(String data);

}/////
