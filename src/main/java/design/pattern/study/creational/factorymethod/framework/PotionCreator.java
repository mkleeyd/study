package design.pattern.study.creational.factorymethod.framework;

public abstract class PotionCreator {

    // DB에서 아이템 요청
    abstract protected void requestPotionsInfo();
    // DB에 Log 남김
    abstract protected void createPotionLog();
    // 아이템을 생성하는 알고리즘
    abstract protected Potion createPotion();

    // 팩토리 메서드 정의(템플릿 메서드와 같은 구조)
    public Potion create(){
        Potion potion;
        // step.1
        requestPotionsInfo();
        // step.2
        potion = createPotion();
        // step.3
        createPotionLog();
        return potion;
    }

}/////
