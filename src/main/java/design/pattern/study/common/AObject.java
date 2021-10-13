package design.pattern.study.common;

/**
 * 델리게이트 : 떠넘기다
 * 
 * 위임 : 어떤 기능을 구현하고 싶을 때 그 책임을 다른 객체에게 떠넘기고 우리는 호출만 해서 사용(다른 객체의 기능을 빌려서 사용하는 것)
 * 
 * <델리게이트 사용법>
 *     - 정의된 위임 인터페이스(또는 클래스)를 필드로 갖고와서 사용한다
 */
public class AObject {
    private Ainterface ainterface;

    // 이걸 이렇게 쓸 수 있는 이유는 프레임워크에서 제공해주는 DI 때문에 가능한 것이고 지금은 그런 환경 없으니 오류 남
    // 직접 new 생성자로 메모리 올려야 함
//    public AObject(Ainterface ainterface) {
//        this.ainterface = ainterface;
//    }
    public AObject() {
        this.ainterface = new AinterfaceImpl();
    }
    public void funcAA(){
        /**
         * 이렇게 같은 기능을 붙여넣어서 구현하는것이 아니라 "호출해서 사용"
         */
//        System.out.println("AAA");
//        System.out.println("AAA");
//        System.out.println("AAA");
        ainterface.funcA();
        ainterface.funcA();
        ainterface.funcA();
    }

}
