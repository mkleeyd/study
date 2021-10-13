package design.pattern.study.behavioral.strategy;

/**
 * <스트레티지 패턴___행위>
 *   - 여러가지 알고리즘을 하나의 "추상적인 접근점( =통로, 인터페이스)"을 만들어 접근점에서 "서로 교환(구현체 교체)" 가능하도록 하는 패턴
 *   - 예제에서는 Weapon 인터페이스가 접근점이 되고 setWeapon() 메서드가 구체적인 행위(기능)를 교환 가능하도록 해줌
 * 
 * 예제 요구사항
 *   - 신작 게임에서 캐릭터와 무기를 구현하시오
 *   - 무기는 칼, 검 2가지 종류 아무거나 동적으로 바꿀 수 있음
 *   - 무기 중에 도끼를 추가해 주세요(유지보수 요구사항)
 *
 * <관통되는 개념 요약>
 *    - {"행위(기능) 추상화 객체", "행위(기능) 구현 객체"}, {"행위(기능) 교체 객체(몸통)", "행위(기능) 선택 객체(완성본 호출)"} 묶음으로 생각
 *
 *    - 행위(기능) 추상화 객체 : 몸통 객체중 특정 부분을 추상화 하여 언제든지 교체할 수 있도록 하는 "추상적인 접근점 객체"
 *    - 행위(기능) 구현 객체 : 몸통 객체중 특정 부분을 구체화 하여 구현한 "구체적인 기능(행위) 객체"
 *    - 행위(기능) 교체 객체(몸통) : 접근점을 통해 구현체들을 교체해가며 기능 개발을 하는 모든 부품들이 모여 사용되는 실질적인 "몸통 객체"
 *    - 행위(기능) 사용 객체(완성본 호출) : 부품들이 하나로 모여 만들어진 완성본 몸통 객체를 "호출"하여 직접 사용하는 객체
 */
public class Main {

    public static void main(String[] args) {
        GameCharacter gameCharacter = new GameCharacter();
        gameCharacter.attack(); // null == 맨손 공격
        
        // 칼 세팅
        gameCharacter.setWeapon(new Knife());
        gameCharacter.attack();

        // 검 세팅
        gameCharacter.setWeapon(new Sword());
        gameCharacter.attack();

        // 도끼 세팅
        gameCharacter.setWeapon(new Ax());
        gameCharacter.attack();
    }

}/////
