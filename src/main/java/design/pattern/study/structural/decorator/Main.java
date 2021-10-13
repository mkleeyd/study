package design.pattern.study.structural.decorator;

import java.util.Scanner;

/**
 * <데코레이터 패턴___구조>
 *   - 동적(다형성)으로 책임(기능) 추가
 *   - "동적"으로 "책임 추가"가 필요할 때 "데코레이터 패턴"을 사용할 수 있다
 *
 * 예제 요구사항
 *   - 커피 제조
 *
 * <관통되는 개념 요약>
 *    - "기능 정의(추상 클래스)"와 "기능 사용(상속)" 확장 쌍 ||| "기능 선언(인터페이스)"와 "기능 구현(재정의 구현체)" 다형성 쌍
 *
 *    - "기능 선언"과 "기능 구현" 다형성 쌍을 기능 정의(추상 클래스)가 받아서 자신이 인터페이스처럼 행동하고 그걸 상속받아 구현체들 구현함
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // base
        IBeverage beverage = new Base();
        boolean done = false;
        while (!done) {
            System.out.println("음료 현재 가격 : "+beverage.getTotalPrice());
            System.out.print("선택 : 1:샷 추가 / 2:우유 추가");
            switch (sc.nextInt()) {
                case 0: done = true;
                    break;
                case 1:
                    beverage = new Espresso(beverage);
                    break;
                case 2:
                    beverage = new Milk(beverage);
                    break;
            }
        }

        System.out.println("음료 가격 : "+beverage.getTotalPrice());
        sc.close();
    }
}/////
