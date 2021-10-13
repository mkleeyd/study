package design.pattern.study.creational.abstractfactory.gt01;

import design.pattern.study.creational.abstractfactory.abst01.BikeFactory;
import design.pattern.study.creational.abstractfactory.abst01.Body;
import design.pattern.study.creational.abstractfactory.abst01.Wheel;

public class GtFactory implements BikeFactory {

    @Override
    public Body createBody() {
        return new GtBody();
    }

    @Override
    public Wheel createWheel() {
        return new GtWheel();
    }
}
