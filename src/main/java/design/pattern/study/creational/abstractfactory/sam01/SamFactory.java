package design.pattern.study.creational.abstractfactory.sam01;

import design.pattern.study.creational.abstractfactory.abst01.BikeFactory;
import design.pattern.study.creational.abstractfactory.abst01.Body;
import design.pattern.study.creational.abstractfactory.abst01.Wheel;

public class SamFactory implements BikeFactory {

    @Override
    public Body createBody() {
        return new SamBody();
    }

    @Override
    public Wheel createWheel() {
        return new SamWheel();
    }
}
