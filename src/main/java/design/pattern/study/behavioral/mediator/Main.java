package design.pattern.study.behavioral.mediator;

import design.pattern.study.behavioral.mediator.contract.ChatColleague;
import design.pattern.study.behavioral.mediator.contract.ChatMediator;
import design.pattern.study.behavioral.mediator.contract.Colleague;
import design.pattern.study.behavioral.mediator.contract.Mediator;

/**
 * <중재자(미디에이터) 패턴___행위>
 *   - M:N 관계를 1:1로 변경하기
 *   - 마스터-슬레이브 관계 만들기
 *   - "미디에이터 패턴을 통해 "복잡한 관계"를 "간단한 관계"로 구현한다
 *
 * 예제 요구사항
 *   - 채팅 예제
 *
 * <관통되는 개념 요약>
 *    - "기능 정의(추상 클래스)"와 "기능 사용(상속)" 확장 쌍 ||| "기능 선언(인터페이스)"와 "기능 구현(재정의 구현체)" 다형성 쌍
 *
 *    - 기능 정의(추상 클래스)와 기능 사용(상속) 확장 쌍으로 "중자자", "이용자" 나눈 구조
 *    - 하나의 중재자에게 이용자들이 join을 하고 이용자들이 데이터들을 보내면 중재자가 받아서 중재하여 데이터를 재전송
 */
public class Main {

    public static void main(String[] args) {
        Mediator mediator = new ChatMediator();

        Colleague colleague1 = new ChatColleague();
        Colleague colleague2 = new ChatColleague();
        Colleague colleague3 = new ChatColleague();

        colleague1.join(mediator);
        colleague2.join(mediator);
        colleague3.join(mediator);

        colleague1.sendData("AAA");
        colleague2.sendData("BBB");
        colleague3.sendData("CCC");
    }
}/////
