package design.pattern.study.behavioral.strategy;

/**
 * <행위(기능) 추상화 객체>
 * 칼, 검 2가지의 공통된 공통된 주제를 추상화로 뽑아 하나의 "접근점"으로 만들기
 *  * 접근점 == 통로
 *  * 여기서부터는 칼, 검의 행위(기능)가 아닌 공통된 행위(기능)를 정의한다
 *   - 모든 무기는 "공격"이라는 "행위(기능)"를 할 수 있다
 */
public interface Weapon {

    //
    public void attack();


}
