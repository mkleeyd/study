package design.pattern.study.structural.decorator;

public class Espresso extends AbstAdding {
    
    static protected int espressoCnt = 0;

    public Espresso(IBeverage base) {
        super(base); // 부모의 생성자 기능 사용
    }

    /**
     * 에스프레소 추가 가격
     * @return
     */
    @Override
    public int getTotalPrice() {
        return super.getTotalPrice()+getAddPrice();
    }

    private static int getAddPrice() {
        espressoCnt +=1;
        int addPrice = 100;

        if (espressoCnt > 1) {
            addPrice = 70;
        }
        return addPrice;
    }


}
