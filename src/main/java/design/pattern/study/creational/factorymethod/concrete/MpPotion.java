package design.pattern.study.creational.factorymethod.concrete;

import design.pattern.study.creational.factorymethod.framework.Potion;

public class MpPotion implements Potion {

    @Override
    public void use() {
        System.out.println("마력 회복");
    }
}/////
