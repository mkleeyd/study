package design.pattern.study.behavioral.visitor;

import java.util.ArrayList;

/**
 * <방문자 패턴___행위>
 *   - 객체에게서 처리 분리하기
 *   - "방문자 패턴"을 이용하여 "객체(클래스)"에서 "처리(메서드)"를 "분리"해서 사용할 수 있다
 *
 * 예제 요구사항
 *   - 
 *
 * <관통되는 개념 요약>
 *    "기능 정의(추상 클래스)"와 "기능 사용(상속)" 확장 쌍 ||| "기능 선언(인터페이스)"와 "기능 구현(재정의 구현체)" 다형성 쌍
 *
 *    - "기능 선언(인터페이스)"과 "기능 구현(구현체)" 다형성 쌍을 기본 베이스로 시작
 *    - "방문 하는 객체", "방문을 받아 주고 알고리즘 수행하는 객체" 2개로 나눈 구조
 *
 *    - 이건 좀더 자세히 봐야 할듯!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 *    - 이건 좀더 자세히 봐야 할듯!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 *
 */
public class Main {

    public static void main(String[] args) {
        // 동작 : visitor --> visitable 방문 --> 알고리즘 수행
        // 방문 -> 방문 허락 -> 알고리즘 수행 ->
        ArrayList<Visitable> visitables = new ArrayList<Visitable>();
        visitables.add(new VisitableA(1));
        visitables.add(new VisitableA(2));
        visitables.add(new VisitableA(3));
        visitables.add(new VisitableA(4));
        visitables.add(new VisitableA(5));

        Visitor visitor = new VisitorA();
//        int ageSum = 0;
        for (Visitable visitable : visitables) {
            visitable.accept(visitor);
//            ageSum += ((VisitableA)visitable).getAge();
        }
        System.out.println(((VisitorA) visitor).getAgeSum());
//        System.out.println(ageSum);

        // VisitableA 클래스를 알고는 있지만 내가 직접 소스 변경은 할수가 없는 상황
        // 1. Visitable 인터페이스를 만들어서 방문자 수용자 로 만들어 사용하면 외부에서도 충분히 구현 가능


    }
}/////
