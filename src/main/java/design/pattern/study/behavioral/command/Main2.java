package design.pattern.study.behavioral.command;

import java.util.PriorityQueue;

/**
 * <커맨드 패턴___행위>
 *   - 명령의 객체화
 *   - 커맨드 패턴을 통해 "명령"을 "객체화" 할 수 있다
 *
 * 예제 요구사항
 *   -
 *
 * <관통되는 개념 요약>
 *    - "기능 정의(추상 클래스)"와 "기능 사용(상속)" 확장 쌍 ||| "기능 선언(인터페이스)"와 "기능 구현(재정의 구현체)" 다형성 쌍
 *
 *    - 작업을 실행하는 접근점과 작업 수행 객체를 제공하여 호출하여 "특정 명령" 만으로 프로시져 처럼 일련의 작업이 수행되는 구조
 *    - 보통 마이그레이션을 할 때 do(), undo() 로 나누어 마이그레이션 시작, 취소 처럼 명령어 하나로 일련의 작업을 해줄 때 많이 사용
 */
public class Main2 {

    public static void main(String[] args) {
        PriorityQueue<Command> queue = new PriorityQueue<>();

        queue.add(new StringPrintCommand("ABCD"));
        queue.add(new StringPrintCommand("ABC"));
        queue.add(new StringPrintCommand("AB"));
        queue.add(new StringPrintCommand("A"));

        // 우선순위에 따라 길이가 짧은 것이 먼저 나옴
        for (Command command : queue) {
            command.execute();
        }

    }
}/////
