package design.pattern.study.creational.abstractfactory;

import design.pattern.study.creational.abstractfactory.abst02.Button;
import design.pattern.study.creational.abstractfactory.abst02.GuiFactory;
import design.pattern.study.creational.abstractfactory.abst02.TextArea;
import design.pattern.study.creational.abstractfactory.concreate.FactoryInstance;

/**
 * <추상 팩토리 패턴02___생성>
 *   - 객체 생성의 가상화
 *   - 관련 있는 객체의 생성을 가상황 할 수 있다
 *   - 생성 부분의 가상화/관련있는 객체
 *   - 생성하는 팩토리 부분을 가상화하여 구체화 부분을 가려 클라이언트는 가상화 부분만을 보고 위임받아 사용
 *
 * 예제 요구사항
 *   -
 *
 * <관통되는 개념 요약>
 *    - 관련 있는 객체들을 하나의 팩토리에서  동일한 방식으로 생성하도록 위임
 *
 *    - 기능 추상화 인터페이스
 *    - 추상화된 기능들을 기준으로 동일한 방식으로 객체 생성
 *    - 팩토리마저 추상화하여 호출부 소스 수정 없이 팩토리 자체를 교체
 */
public class Main02 {

    public static void main(String[] args) {
//        GuiFactory factory = new LinuxGuiFactory(); // 이 부분만 갈아껴주면 원하는 객체 생성됨
//        GuiFactory factory = new MacGuiFactory(); // 이 부분만 갈아껴주면 원하는 객체 생성됨
        System.out.println("내가 사용하는 PC의 OS 정보 받기 ===> " + System.getProperty("os.name"));
        // 위에서 받은 OS 정보를 가공하여 파라미터로 넘겨 호출부 소스 수정 아예 없이 Factory 자체를 자동으로 선택하도록 함 
        GuiFactory factory = FactoryInstance.getGuiFactory();
        Button button = factory.createButton();
        TextArea textArea = factory.createTextArea();

        button.click();
        System.out.println(textArea.getText());
    }

}
