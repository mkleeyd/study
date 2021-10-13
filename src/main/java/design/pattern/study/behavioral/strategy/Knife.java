package design.pattern.study.behavioral.strategy;

/**
 * <행위(기능) 구현 객체>
 * "무기"라는 "추상적인 행위(기능)"를 "구체적인 행위(기능)로 작성한 구현 객체"
 */
public class Knife implements Weapon {

    @Override
    public void attack() {
        System.out.println("칼 공격!!");
    }
}
