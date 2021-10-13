package design.pattern.study.creational.abstractfactory;

import design.pattern.study.creational.abstractfactory.abst01.BikeFactory;
import design.pattern.study.creational.abstractfactory.abst01.Body;
import design.pattern.study.creational.abstractfactory.abst01.Wheel;
import design.pattern.study.creational.abstractfactory.gt01.GtFactory;
import design.pattern.study.creational.abstractfactory.sam01.SamFactory;

/**
 * <추상 팩토리 패턴01___생성>
 *   - 객체 생성의 가상화
 *   - 관련 있는 객체의 생성을 가상황 할 수 있다
 *   - 생성 부분의 가상화/관련있는 객체
 *   - 생성하는 팩토리 부분을 가상화하여 구체화 부분을 가려 클라이언트는 가상화 부분만을 보고 위임받아 사용
 *
 * 예제 요구사항
 *   -
 *
 * <관통되는 개념 요약>
 *    - 관련 있는 객체들을 하나의 팩토리에서  동일한 방식으로 생성하도록 위임
 *    
 *    - 기능 추상화 인터페이스
 *    - 추상화된 기능들을 기준으로 동일한 방식으로 객체 생성
 */
public class Main01 {

    public static void main(String[] args) {
        BikeFactory samFactory = new SamFactory();
        BikeFactory gtFactory = new GtFactory();

        Body samBody = samFactory.createBody();
        Wheel samWheel = samFactory.createWheel();

        System.out.println(samBody.getClass());
        System.out.println(samWheel.getClass());

        Body gtFactoryBody = gtFactory.createBody();
        Wheel gtFactoryWheel = gtFactory.createWheel();

        System.out.println(gtFactoryBody.getClass());
        System.out.println(gtFactoryWheel.getClass());
    }
}/////
