package design.pattern.study.structural.decorator;

/**
 * 데코레이터 클래스 : IBeverage 인터페이스 처럼 행동하는 "데코레이터" 클래스
 *   - 밖에서 보기에는 이 클래스가 IBeverage 인터페이스 처럼 보이게 해줌
 */
public abstract class AbstAdding implements IBeverage {
    
    private IBeverage base;

    public AbstAdding(IBeverage base) { // base 파라미터에는 인터페이스의 구현체가 들어오고 그걸 필드값으로 받아 사용하는 동작 방식임
        super();
        this.base = base;
    }

    @Override
    public int getTotalPrice() {
        return base.getTotalPrice();
    }

    protected IBeverage getBase() {
        return base;
    }
}/////
