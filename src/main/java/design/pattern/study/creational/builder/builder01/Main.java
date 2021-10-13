package design.pattern.study.creational.builder.builder01;

/**
 * <프로그샘 설계 순서___생성>
 *   - 생성할 객체 클래스 생성
 *   - 다형성 추상화 설계도 객체 생성
 *   - 다형성 구체화 설계도 객체 생성
 *   - 객체를 생성하는 설계도 객체 생성
 *   - 호출하여 사용
 *
 * <빌더 패턴01>
 *   - "복잡한 단계"가 있는 인스턴스 생성과정 단순화
 *   - "복잡한 단계"를 거쳐야 생성되는 객체의 구현을 "서브 클래스"에게 넘겨주고(위임) 호출만 하여 사용하는 패턴
 *
 * 예제 요구사항
 *   - 다양한 종류의 컴퓨터를 생산해주세요
 *
 * <관통되는 개념 요약>
 *    - 객체를 생성하는 설계도 객체, 다형성 설계도 객체 2가지로 구분해서 생성
 *
 *     - 다형성 추상화 설계도 객체
 *     - 다형성 구체화 설계도 객체
 *     - 객체를 생성하는 설계도 객체 생성
 *     - 호출 클라이언트 생성
 */
public class Main {

    public static void main(String[] args) {

        // 아래처럼 파라미터를 다 넘겨서 직접 생성하기 보다는 "설계도만 넘겨서 생성을 위임"하여 호출만 해서 간단하게 생성하고자 할 때
        // ComputerFactory가 객체를 만드는 디렉터 역할 
        ComputerFactory factory = new ComputerFactory();
        factory.setBlueprint(new LgGramBlueprint()); // 설계도를 파라미터로 넘겨줌
//        factory.setBlueprint(new MacBlueprint()); // 설계도를 파라미터로 넘겨줌
//        factory.setBlueprint(new SonyBlueprint()); // 설계도를 파라미터로 넘겨줌
//        Computer computer = factory.makeAndGet(); // 이렇게 하나의 메서드 안에서 다 구현하여 호출할 수도 있고
        factory.make();
        Computer computer = factory.getComputer();

//        Computer computer = new Computer("i7", "16g", "256g ssd");
        System.out.println(computer.toString());
    }

}/////
