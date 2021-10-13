package design.pattern.study.creational.builder.builder02;

/**
 * <프로그샘 설계 순서>
 *   -
 *
 * <빌더 패턴02_현업___생성>
 *   - "많은 변수를 가진 객체의 생성"을 "가독성"이 높도록 코딩할 수 있다
 *   - 많은 인자를 가진 객체 생성을 다른 객체의 도움으로 생성하는 패턴
 *
 * 예제 요구사항
 *   - 인자가 많은 객체를 생성하세요 
 *
 * <관통되는 개념 요약>
 *    - 인자가 많은 객체를 생성할 때 중간에 Builder를 두어 생성을 위임하고 builder 자기자신을 반환하여 메서드 체인 형식으로 만들어 가독성 높이는 것
 *
 *     - builder 설계도 객체를 객체 생성을 위임
 */
public class Main {

    public static void main(String[] args) {
        Computer computer = ComputerBuilder.builder()
                .setCpu("i7")
                .setRam("8g")
//                .setStorage("256g ssd")
                .build();

        System.out.println("computer = " + computer.toString());
    }
}/////
