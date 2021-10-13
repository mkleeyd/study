package design.pattern.study.creational.builder.builder01;

/**
 * 추상적인 설계도 객체
 */
public abstract class BluePrint {

    abstract public void setCpu();
    abstract public void setRam();
    abstract public void setStorage();
    abstract public Computer getComputer();
}
