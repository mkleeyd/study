package design.pattern.study.creational.builder.builder02;

public class ComputerBuilder {

    private Computer computer;

    private ComputerBuilder(){
        computer = new Computer("default", "default", "default");
    };

    public static ComputerBuilder builder() {
        return new ComputerBuilder();
    }
    public ComputerBuilder setCpu(String cpu) {
        computer.setCpu(cpu);
        return this;
    }

    public ComputerBuilder setRam(String ram) {
        computer.setRam(ram);
        return this;
    }

    public ComputerBuilder setStorage(String storage) {
        computer.setStorage(storage);
        return this;
    }

    public Computer build() {
        return computer;
    }

    @Override
    public String toString() {
        return "ComputerBuilder{" +
                "computer=" + computer +
                '}';
    }
}/////
