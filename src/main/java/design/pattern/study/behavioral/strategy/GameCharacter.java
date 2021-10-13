package design.pattern.study.behavioral.strategy;

/**
 * <행위(기능) 교체 객체>
 * 다형성 구현체에게 기능을 위임하여 실제로 행위(기능)들을 사용하는 객체
 */
public class GameCharacter {

    /**
     * 통로(접근점) 개설
     */
    private Weapon weapon;

    /**
     * 구체적인 행위는 교환 가능
     */
    public void setWeapon(Weapon weapon) { // weapon 파라미터에는 인터페이스의 구현체가 들어오고 그걸 필드값으로 받아 사용하는 동작 방식임
        this.weapon = weapon;
    }

    /**
     * 델리게이트 : 다형성 구현체에게 기능을 위임하여 사용
     * 
     * 공격이라는 기능을 여기서 구현하는 것이 아닌 들고있는 무기 종류에 따라서 변경되는 것
     */
    public void attack(){
        if (weapon == null) {
            System.out.println("맨손 공격");
        } else {
            weapon.attack();
        }


    }


}/////
