package design.pattern.study.structural.bridge;

/**
 * <브릿지 패턴___구조>
 *   - 기능 계층과 구현 계층의 분리
 *   - 어댑터 패턴과 브릿지 패턴을 연결하여 이해하기
 *
 * 예제 요구사항
 *   -
 *
 * <관통되는 개념 요약>
 *    "기능 정의(추상 클래스)"와 "기능 사용(상속)" 확장 쌍 ||| "기능 선언(인터페이스)"와 "기능 구현(재정의 구현체)" 다형성 쌍
 *    - 요구사항이 추가된다면 기능 구현(구현체)를 추가 생성
 *
 */
public class Main {

    public static void main(String[] args) {
//        PrintMorseCode code = new PrintMorseCode(); // 확장 한 것은 바로 사용하면 된다
        PrintMorseCode morse = new PrintMorseCode(new DefaultMCF());
        morse.g();morse.a();morse.r();morse.a();morse.m();
        System.out.println();
        morse.g().a().r().a().m(); // 체인 방식으로 바꿈(자기 자신을 반환해주면 반환 타입이 같으므로 메서드를 체인처럼 연결해줄 수 있음)

        System.out.println();

        PrintMorseCode sound = new PrintMorseCode(new SoundMCF());
        sound.g();sound.a();sound.r();sound.a();sound.m();
        System.out.println();
        sound.g().a().r().a().m(); // 체인 방식으로 바꿈(자기 자신을 반환해주면 반환 타입이 같으므로 메서드를 체인처럼 연결해줄 수 있음)
    }

}/////
