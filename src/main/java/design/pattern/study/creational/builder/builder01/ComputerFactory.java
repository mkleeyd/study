package design.pattern.study.creational.builder.builder01;

/**
 * 객체를 생성하는 설계도 객체
 */
public class ComputerFactory {

    private BluePrint bluePrint; // 컴퓨터라는 설계도를 가짐

    public void setBlueprint(BluePrint blueprint) { // blueprint 파라미터에는 객체가 들어오고 그걸 필드값으로 받아 사용하는 동작 방식임
        this.bluePrint = blueprint;
    }

    /**
     * 템플릿 메서드 패턴과 유사
     * 
     * 설계도를 바탕으로 제품 생성
     */
    public void make() {
        bluePrint.setCpu();
        bluePrint.setRam();
        bluePrint.setStorage();
    }

    /**
     * 설계도로 만들어진 결과물 가지고옴
     */
    public Computer getComputer() {
        return bluePrint.getComputer();
    }
}/////
