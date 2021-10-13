package design.pattern.study.creational.factorymethod;

import design.pattern.study.creational.factorymethod.concrete.HpCreator;
import design.pattern.study.creational.factorymethod.concrete.MpCreator;
import design.pattern.study.creational.factorymethod.framework.Potion;
import design.pattern.study.creational.factorymethod.framework.PotionCreator;

/**
 * <팩토리 메서드 패턴___생성>
 *   - 이것의 완성본이 바로 "프레임워크"이다
 *   - 팩토리 메서드 패턴에서 "템플릿 메서드 패턴이 사용됨"을 안다
 *   - 팩토리 메서드 패턴에서의 "구조와 구현의 분리"를 이해하고 구조와 구현의 분리의 장점을 안다
 *   - 템플릿 메서드 패턴 + 사용 추상화 객체
 *   
 * 예제 요구사항
 *   - 게임 아이템과 아이템 생성을 구현해주세요
 *     - 아이템을 생성하기 전에 데이터베이스에서 아이템 정보를 요청합니다
 *     - 아이템을 생성 후 아이템 복제 등의 불법을 방지하기 위해 데이터베이스에 아이템 생성 정보를 넘깁니다
 *   - 아이템을 생성하는 주체를 PotionCreator 로 이름 짓습니다
 *   - 아이템은 Potion 이라는 interface 로 다룰 수 있도록 합니다
 *     - Potion 은 user 함수를 기본 함수로 가지고 있습니다.
 *   - 현재 아이템의 종류는 체력 회복 물약, 마력 회복 물약이 있습니다
 *
 * <관통되는 개념 요약>
 *    - 일정한 프로세스가 존재하면서 그 안에 객체를 생성도 같이 해야 하는 상황에 많이 사용
 *    - 구조 패키지, 구현 패키지 각각 만들어서 구조와 구현을 분리
 *      - 구조 == { 팩토리 메서드 추상 클래스, 인터페이스 }
 *      - 구현 == { 팩토리 메서드 추상 클래스를 재정의하는 구현 객체, 인터페이스를 재정의하는 구현 객체 }
 *      - 추가 요구사항이 들어올 경우 구조만 상속 받아서 각각의 구현 객체들만 만들면 됨
 *
 *    - 행위(기능) 추상화 객체 : Potion을 생성하는 일정한 프로세스 구조 역할 추상 클래스
 *    - 행위(기능) 추상화 객체 : 다양한 Potion에 대한 구현 객체들의 공통 분모
 *    - 행위(기능) 구현 객체 : "Potion 생성"을 구현한 구현 객체(몸통)
 *    - 행위(기능) 구현 객체 : 구체적인 Potion을 구현한 구현 객체(몸통)
 *    - 행위(기능) 사용 객체 : 완성본 호출하여 사용
 */
public class Main {

    public static void main(String[] args) {
        PotionCreator creator;
        Potion potion;

        creator = new HpCreator();
        potion = creator.create();
        potion.use();

        creator = new MpCreator();
        potion = creator.create();
        potion.use();
    }
}/////
