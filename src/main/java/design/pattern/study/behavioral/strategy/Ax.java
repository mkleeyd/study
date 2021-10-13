package design.pattern.study.behavioral.strategy;


/**
 * <행위(기능) 구현 객체>
 * "무기"라는 "추상적인 행위(기능)"를 "구체적인 행위(기능)로 작성한 구현 객체"
 *
 * 유지보수 사항이 추가되어도
 * 게임 캐릭터 객체도 수정하지 않고 호출하는 메인 부분도 수정하지 않고 "구체적인 행위(기능)를 구현한 구현체만 추가해주면 됨"
 */
public class Ax implements Weapon {

    @Override
    public void attack() {
        System.out.println("도끼 공격!!");
    }
}
