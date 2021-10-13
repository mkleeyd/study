package design.pattern.study.behavioral.observer.exam02;

import java.util.Observable;
import java.util.Observer;

/**
 * <옵저버 패턴___행위>
 *   - 상태 변화 관찰하기
 *   - 옵저버 패턴을 통해 "이벤트 발생" 후 "객체 외부에서 처리" 할 수 있다
 *   - 실상은 이벤트 책임 클래스에 옵저버 인터페이스를 내부에 정의하여 두 객체가 관계가 있다는 것을 명시적으로 해주는 경우가 더 많음
 *
 * 예제 요구사항
 *   -
 *
 * <관통되는 개념 요약>
 *    "기능 정의(추상 클래스)"와 "기능 사용(상속)" 확장 쌍 ||| "기능 선언(인터페이스)"와 "기능 구현(재정의 구현체)" 다형성 쌍
 *
 *    - Java 자체에서 제공하는 옵저버 인터페이스, 클래스 사용해보기
 */
public class Main {

    public static void main(String[] args) {
        Button button = new Button();
        button.addObserver(new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                System.out.println(o + " is Clicked");
            }
        });
        button.onClick();
        button.onClick();
        button.onClick();
    }
}/////
