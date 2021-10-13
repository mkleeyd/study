package design.pattern.study.creational.singleton;

/**
 * <싱글톤 패턴___생성>
 *   - 싱글톤 패턴을 통해서 "하나의 인스턴스"만 생성하도록 구현할 수 있다
 *   - 하나만 생성해야 할 객체를 위한 패턴
 *
 * 예제 요구사항
 *   - 개발 중에 시스템에서 스피커에 접근 할 수 있는 클래스를 만들어 주세요
 *
 * <관통되는 개념 요약>
 *    - static, private 키워드들로 객체가 한번만 메모리에 올라가고 이후에는 해당 객체 공유하도록 만드는 것
 */
public class Main {

    public static void main(String[] args) {
        SystemSpeaker speaker1 = SystemSpeaker.getInstance();
        // 정말 한번만 만들어져서 해당 객체만 계속 사용하는지 테스트 하기 위해 하나 더 할당
        SystemSpeaker speaker2 = SystemSpeaker.getInstance();

        /**
         * 하나의 객체를 공유하므로 speaker1을 변경하나 speaker2를 변경하나 값이 다 동일하게 변경되어야 한다
         */
        System.out.println(speaker1.getVolume());
        System.out.println(speaker2.getVolume());

        speaker1.setVolume(11);
        System.out.println(speaker1.getVolume());
        System.out.println(speaker2.getVolume());

        speaker2.setVolume(22);
        System.out.println(speaker1.getVolume());
        System.out.println(speaker2.getVolume());

    }

}
