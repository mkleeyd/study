package design.pattern.study.structural.adapter;

public class AdapterImpl implements Adapter {

    @Override
    public Float twiceOf(Float f) {
//        return (float) Math.twiceOf(f.doubleValue());
        return Math.doubled(f.doubleValue()).floatValue(); // 구현체의 로직만 손봐서 기능 교체
    }

    @Override
    public Float halfOf(Float f) {
        // Math함수에 Log를 찍으면 다른 사람들도 찍히게 되므로 내가 구현한 여기에서 로그를 찍어줌
        System.out.println("절반 함수 호출");
        return (float) Math.halfOf(f.doubleValue());
    }
}
