package design.pattern.study.structural.facade.system;

/**
 * Facade 클래스를 도와주는 패키지(접근 키워드를 제거하면 default 키워드로 패키지에서만 접근 가능하게 됨)
 */
class HelpSystem03 {

    public HelpSystem03() {
        System.out.println("생성자 호출됨 : " + getClass().getSimpleName());
    }

    public void process() {
        System.out.println("프로세스 호출됨 : " + getClass().getSimpleName());
    }

}////
