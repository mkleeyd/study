package design.pattern.study.behavioral.mediator.contract;

public class ChatMediator extends Mediator {

    @Override
    public void mediate(String data) {
        for (Colleague colleague : colleagues) {
            // 중재 가능성이 있는 data(귓말 등)를 중재해줌
            colleague.handle(data);
        }
    }
}/////
