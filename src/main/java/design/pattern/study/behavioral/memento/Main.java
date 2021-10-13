package design.pattern.study.behavioral.memento;

import design.pattern.study.behavioral.memento.abc.Memento;
import design.pattern.study.behavioral.memento.abc.Originator;

import java.util.Stack;

/**
 * <메멘토 패턴___행위>
 *   - 상태 저장하기
 *   - 메멘토 패턴을 통해 객체의 "상태"를 "저장"하고 이전상태로 "복구"한다
 *   - 접근 제한자 protected의 사용을 이해한다
 *
 * 예제 요구사항
 *   -
 *
 * <관통되는 개념 요약>
 *    - "기능 정의(추상 클래스)"와 "기능 사용(상속)" 확장 쌍 ||| "기능 선언(인터페이스)"와 "기능 구현(재정의 구현체)" 다형성 쌍
 *
 *    - 상태값을 저장하는 객체를 만들고 그걸 컬렉션의 타입으로 지정하여 상태 저장, 불러오기 를 하는 단순한 패턴(그냥 객체를 이용한 자료구조)
 *    - 여기서 더 중요한 것은 패키지를 나누어 저장 객체를 Protected로 보호하여 아무대서나 값을 수정할 수 없도록 하는 것이 포인트!!
 */
public class Main {

    public static void main(String[] args) {
        Stack<Memento> mementos = new Stack<>();
        Originator originator = new Originator();

        // 이런 악의적인 수정을 막기 위해 Protected 제한자로 막아줌
//        Memento mementoTest = new Memento();
//        String stateTest = mementoTest.getState();
//        stateTest += "23";
        
        originator.setState("state1");
        mementos.push(originator.createMemento());
        originator.setState("state2");
        mementos.push(originator.createMemento());
        originator.setState("state3");
        mementos.push(originator.createMemento());
        originator.setState("finish");
        mementos.push(originator.createMemento());

        originator.restoreMemento(mementos.pop()); // 원래상태로 복구
        System.out.println(originator.getState()); // finish

        originator.restoreMemento(mementos.pop()); // 원래상태로 복구
        System.out.println(originator.getState()); // 3

        originator.restoreMemento(mementos.pop()); // 원래상태로 복구
        System.out.println(originator.getState()); // 2

        originator.restoreMemento(mementos.pop()); // 원래상태로 복구
        System.out.println(originator.getState()); // 1

    }
}/////
