package design.pattern.study.structural.bridge;

/**
 * 기능 정의 클래스
 */
public class MorseCode {

    // private : 다른대서 사용하면 안되니까 키워드
    private MorseCodeFunction function;

    public MorseCode(MorseCodeFunction function) { // function 파라미터에는 인터페이스의 구현체가 들어오고 그걸 필드값으로 받아 사용하는 동작 방식임
        this.function = function;
    }

    public void setMorseCodeFunction(MorseCodeFunction function) {
        this.function = function;
    }

    public void dot(){
        function.dot(); // 기능 정의와 기능 구현 다형성 쌍에게 위임
//        System.out.print("·");
    }
    public void dash(){
        function.dash(); // 기능 정의와 기능 구현 다형성 쌍에게 위임
//        System.out.print("-");
    }
    public void space(){
        function.space(); // 기능 정의와 기능 구현 다형성 쌍에게 위임
//        System.out.print(" ");
    }

}
