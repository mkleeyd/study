package design.pattern.study.creational.factorymethod.concrete;

import design.pattern.study.creational.factorymethod.framework.Potion;

public class HpPotion implements Potion {

    @Override
    public void use() {
        System.out.println("체력 회복");
    }
}/////
