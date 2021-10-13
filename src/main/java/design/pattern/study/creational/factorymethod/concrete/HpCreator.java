package design.pattern.study.creational.factorymethod.concrete;

import design.pattern.study.creational.factorymethod.framework.Potion;
import design.pattern.study.creational.factorymethod.framework.PotionCreator;

import java.util.Date;

/**
 * 구현 객체를
 */
public class HpCreator extends PotionCreator {

    @Override
    protected void requestPotionsInfo() {
        System.out.println("데이터베이스에서 체력 회복 물약의 정보를 가져옵니다.");
    }

    @Override
    protected void createPotionLog() {
        System.out.println("체력 회복 물약을 새로 생성했습니다." + new Date());
    }

    @Override
    protected Potion createPotion() {
        return new HpPotion();
    }
}/////


