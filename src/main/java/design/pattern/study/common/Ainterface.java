package design.pattern.study.common;

/**
 * 인터페이스 개념 : 추상적인 접근점(기능을 선언만 하는 역할)
 *
 * 인터페이스 : 어떤 행위(기능)의 선언과 구현을 분리해주고 접근점을 제공해줌
 * 
 * 기능적인 부분을 각각의 인터페이스로 생성 ==> 기능들을 선언하고 기능들을 구체적으로 구현하는 것은 구현체에서 담당
 * 
 * 확장 가능성이 열려 있는 "기능"이라면 추상화로 뽑아서 재정의 해가며 유연하게 만드는게 좋음
 */
public interface Ainterface {

    // 기능 선언
    public void funcA();

}
