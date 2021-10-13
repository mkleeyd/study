package design.pattern.study.structural.decorator;

public class Milk extends AbstAdding {

    public Milk(IBeverage base) {
        super(base); // 부모의 생성자 기능 사용
    }

    @Override
    public int getTotalPrice() {
        return super.getTotalPrice()+50; // 부모의 getTotalPrice() 메서드 값 + 50
    }
}
