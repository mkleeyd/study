## 모든 패턴 요약 정리
***
### 모든 패턴 관통 개념
```
- 확장(상속) 쌍을 사용할 때는 사용할 때는 "구현체 = new 구현체()"로 생성하여 사용해야 한다!!
- 실제로 내가 만지는 것은 현업에서 이미 만들어진 프로젝트에서 인터페이스가 선언되어 있고 나는 "구현체"를 생성해서 사용할 것임
- public, Protected, private 접근 제한자 키워드 수준급으로 사용 가능해야 함 
- 델리게이트(인터페이스), 여러가지 처리(제어)를 대신 해주는 미들 객체, 다형성 쌍, 추상(상속) 쌍 <== 거의 모든 패턴이 이것들을 단독으로 사용하거나 조합해서 사용
- 기본 구조는 위 3가지를 조합하여 사용하고 더 깊어지면 "추상화에서 추상화를 가지고 있고 반복" 이런 식으로 뎁스가 깊어짐
- 객체들간의 메시지 전달(파라미터)을 통한 유연한 프로그램을 작성하기 위한 설계를 지향
- 직접적으로 다루지 않고 팩토리 등 같은 관리해주는 매니저(클래스)를 통해 접근하여 사용하는 패턴 많음(JPA의 영속성 컨텍스트도 결국은 중간에 관리해주는 클래스로 이루어져 있을듯)
  - 또, 클라이언트와 구조 사이에서 핑퐁하는 데이터들을 받아 가공, 중재, 관리, null 처리, Exception 처리 등등 많은 것들을 할 수 있음 
- 가장 좋은 패턴은 호출부에서 수정이 거의 없이 객체를 갈아끼우는 것만으로도 기능이 바뀌는 것이 좋은 설계 구조

- 델리게이트(인터페이스) : 위임할 객체 필드로 가져와 호출하여 사용( 델리게이트를 사용하면 상속 없이도 가능 )
  - 내부적으로 완성된 위임 인터페이스(또는 클래스)를 필드로 갖고와서 사용한다
  - 델리게이트 할 때는 "인터페이스"를 필드로 갖는 것이다!!(당연히 인터페이스를 구현한 구현체가 있고 실제로는 구현체 기능을 사용)
  - 델리게이트(인터페이스)를 이용한다고 하면 반드시 미들 객체(중간 제어)가 필요함!!
- 책임 == 기능
```
```
* 패턴들 예제를 따라갈 때는 호출부(Main)부터 따라가면 좋음
	- 보니까 호출부를 최대한 동적으로 하기 위해 만들어진 것이 패턴이니까
	- 호출부에서 따라 들어가보면 호출부가 호출하는 그 녀석도 다른 녀석에게 위임해서 호출만 하는 녀석이 있고 자체가 구현체인 느셕도 있고 다양함
	- 호출부에서 따라 들어간 녀석도 위임한 호출부라면 또 그 안에 어떤 구조의 패턴으로 이루어진건지 이렇게 하나씩 따라가면 됨
```
***
## <객체 생성 패턴>
### 추상 팩토리
- 객체의 생성을 다형성 쌍으로 기능 선언과 기능 구현으로 분리
- 생성되는 각각의 객체들 역시 다형성 쌍으로 기능 선언과 기능 구현을 분리
- 요약 : 객체 생성 담당 다형성 쌍 + 객체 다형성 쌍
### 빌더
- 생성할 객체
- 객체 생성을 대신 해주는 미들 객체
  - 미들 객체에서 생성할 객체를 메서드 체인 형식으로 대신 생성
- 요약 : 객체 생성 담당 미들 객체 + 생성할 객체
### 팩토리 메서드 
- 객체의 생성을 담당하는 확장(상속) 쌍으로 기능 정의와 기능 구현으로 분리
  - 기능 정의 추상 클래스에서 기능 선언 및 선언한 기능들을 "일정한 절차"에 따라 실행되도록 하나로 묶어 실행하는 메서드 정의(템플릿 메서드 패턴 사용)
- 생성되는 각각의 객체들 역시 다형성 쌍으로 기능 선언과 기능 구현을 분리
- 요약 : 객체 생성 담당 확장(상속) 쌍 + 템플릿 메서드 패턴(step) + 객체 다형성 쌍  
### 프로토 타입
- 자바에서 제공하는 Cloneable 인터페이스를 활용하여 중복 객체를 clone() 하여 객체 생성
- 높은 수준의 복사 제공받음(주소값이 아닌 데이터만 복사하는 것)
- 요약 : 자바 자체에서 제공하는 라이브러리를 통해 중복 객체 생성 시 객체 복사하여 생성
### 싱글톤
- 객체 필드에 static 키워드를 붙여 맨 처음 생성 이후에는 생성이 불가능하도록 1회만 객체 생성
- 요약 : static private 활용하여 객체 1회 생성
***
## <객체간 구조 패턴>
### 어댑터
- 다형성 쌍으로 기능 선언과 기능 구현으로 분리
- 요약 : 객체 다형성 쌍
### 브릿지
- 다형성 쌍으로 기능 선언과 기능 구현으로 분리
- 다형성 구현체에서 기능을 위임하여 사용하는 미들 객체
  - 미들 객체를 확장(상속)하여 클라이언트가 실제로 제어(사용)하는 객체
- 요약 : 객체 다형성 쌍(어댑터 패턴 활용) + 미들 객체(델리게이트 사용) + 확장(상속)하여 클라이언트가 제어하는 객체
### 컴포지트
- 확장(상속) 쌍으로 기능 정의와 기능 구현으로 분리
  - 구현체에서 List<추상 클래스>를 필드로 갖고 저장하는 기능을 갖는 메서드를 구현하여 동일한 레벨의 구현체들을 관리
  - 객체간의 동일한 뎁스를 가진 객체들을 트리구조처럼 저장 가능
- 요약 : 확장(상속) 쌍(부모를 리스트로 갖는 구현 객체)
### 데코레이터
- 기능 선언 인터페이스 객체
  - 인터페이스를 구현한 구현 객체
  - 인터페이스처럼 행동하는 인터페이스를 재정의한 추상 클래스
    - 추상 클래스를 확장(상속)받아 기능 구현한 구현 객체
- 요약(조합형) : 객체 다형성 쌍 + 확장(상속) 쌍
### 퍼사드
- 프로세스 흐름 순서대로 호출되어야 하는 객체들을 필드로 갖고 각각의 객체들을 생성하는 일반 클래스 객체
  - 클라이언트에게 제공되어 호출 시 각 객체들을 생성하고 메서드 호출 시 프로세스 흐름대로 객체들의 메서드들을 호출해줌
- 프로세스 흐름 객체 1, 객체 2, 객체 3
- 추상 클래스로 만들어서 기능 정의하여 해도 비슷할것 같지만 클라이언트에서 객체 생성할 때 추상 클래스는 생성할 수 없기 때문에 일반 클래스를 이용한 것 
- 요약 : 객체들을 필드로 갖는 일반 클래스(델리게이트 사용) + 흐름이 있는 객체들
### 플라이웨이트
- 제어할 객체 클래스
- 객체를 대신 제어해주는 미들 객체
- 미들 객체 클래스를 사용하여 중복 데이터 생성 시 "재사용"하도록 제어 가능(메모리 절약)
- 요약 : 제어할 객체 + 객체를 제어해주는 미들 객체
### 프록시
- 다형성 쌍으로 작업별 기능 선언과 기능 구현으로 분리
  - 델리게이트(인터페이스)를 이용하여 처리할 작업별로 구현체의 기능을 유동적으로 위임하여 호출
- 요약 : 객체 다형성 쌍 + 델리게이트(인터페이스)
***
## <행위(기능) 패턴>
### 책임 사슬
- 확장(상속) 쌍으로 기능 정의와 기능 구현으로 분리
  - 추상 클래스 안에 자기자신 델리게이트를 갖고 다른 구현체를 미리 set하는 메서드 정의
  - 구현체별로 정의한 기능이 호출되었을 때 동작 했는지의 여부에 따라 다음 구현체를 바꿔줌(바꾼다면 set한 구현체의 기능 호출)
- 사용할 객체
- 요약 : 확장(상속) 쌍 + 델리게이트(추상 클래스)
### 커맨드
- 다형성 쌍으로 기능 선언과 기능 구현으로 분리
- 일반적인 다형성 쌍 구조로 "명령어"를 통한 유동적인 구현체 기능 실행
요약 : 객체 다형성 쌍
### 중재자(미디에이터)
- 중재 역할을 하는 확장(상속) 쌍으로 기능 정의와 기능 구현으로 분리
  - 추상 클래스 안에서 중재자를 사용하는 객체들을 List에 저장하는 기능을 정의
  - 구현체에서 중재자가 저장하고 있는 사용 객체들을 제어하는 기능 구현
- 중재자를 사용할 객체들 확장(상속) 쌍으로 기능 정의와 기능 구현으로 분리
  - 중재자에게 join하는 기능 정의
  - 객체들별 기능 구현
- 요약 : 중재를 담당하는 확장(상속) 쌍 + 중재 받을 객체 확장(상속) 쌍 
### 메멘토
- 클라이언트로부터 값을 받아 제어(사용)하는 일반 클래스 객체
  - 제어(사용) 객체로부터 값을 전달받아 저장하고 있는 메멘토 일반 클래스 객체
  - 값을 불러올 때는 List<메멘토 객체>를 이용하여 저장해놓았던 값 불러와 사용 가능
  - 이렇게 하는 이유는 객체별로 생성해서 각각 값을 저장해 놓을 필요 없이 1개의 사용 객체와 1개의 값 저장 객체만으로 리소스 적게 저장 가능
  - 근데 솔직히, 내부적으로 메멘토 객체는 계속 생성되어 값을 저장하니 똑같은 걸수도...?
- 요약 : 1개의 클라이언트 제어(사용) 객체 + 1개의 값 저장해놓는 객체
### 옵저버
- 일반 기능구현 클래스
  - 일반 기능구현 클래스 내부에 inner 형태로 함수형 인터페이스 선언 및 델리게이트(인터페이스) 필드로 선언(클래스 멤버변수)
  - 구현체는 클라이언트쪽에서 어나니머스 함수 정의 방식으로 동적으로 구현체 구현
- 클라이언트에서 함수 호출 시 델리게이트로 인해 구현체에서 정의한 기능 실행
- 안드로이드에서 자주 사용하는 어나니머스 함수 방식처럼 동작하게 되는 패턴
- 요약 : 일반 기능구현 클래스(함수형 인터페이스, 델리게이트) + 클라이언트 객체
### 상태(스테이트)
- 일반 기능구현 클래스
  - 일반 기능구현 클래스에 동일한 레벨의 인터페이스 기능 선언 및 델리게이트(인터페이스) 필드로 선언(클래스 멤버변수)
  - 인터페이스의 구현체는 일반 기능구현 클래스 내부에 이벤트별 동작하는 어나니머스 함수 정의 방식으로 구현체 구현
- 클라이언트에서 일반 클래스의 함수 호출 시 델리게이트로 인해 구현체에서 정의한 기능 실행
- 전략 패턴(델리게이트 사용)과 구조가 완전 동일하지만, 전략 패턴은 "알고리즘을 변경"해주는 것이고 상태 패턴은 "이벤트로 발생된 상태를 변경"
- 요약 : 일반 기능구현 클래스(함수형 인터페이스, 델리게이트) + 클라이언트 객체
### 전략(스트레티지)
- 다형성 쌍으로 기능 선언과 기능 구현으로 분리
- 클라이언트에게 접점을 제공해주고 객체를 제어해주는 미들 객체 사용(다형성 구현체에게 기능을 위임(델리게이트)하여 사용)
- 가장 일반적인 구조(델리게이트를 사용한다고 하면 반드시 미들 객체가 존재함)
- 요약 : 객체 다형성 쌍 + 클라이언트에게 접점을 제공해주고 객체를 제어해주는 미들 객체(델리게이트 사용)
### 템플릿 메서드
- 확장(상속) 쌍으로 기능 정의와 기능 구현으로 분리
  - 기능 정의 추상 클래스에서 기능 선언 및 선언한 기능들을 "일정한 절차"에 따라 실행되도록 하나로 묶어 실행하는 메서드 정의
  - 구현 객체에서 구체적인 알고리즘 구현
- "일정한 절차"를 가진 요구사항을 묶어 하나의 기능에 정의하여 간결하게 사용
- 요약 : 확장(상속) 쌍
### 방문자(비지터)
- 방문을 처리하는 다형성 쌍으로 기능 선언과 기능 구현으로 분리
  - 방문 처리 구현체에 들어오는 방문 객체를 처리하는 기능 구현
- 방문 객체 다형성 쌍으로 기능 선언과 기능 구현으로 분리
  - 방문 객체 구현체는 고유의 기능 구현
- 예제에서는 방문 처리 구현체에서 방문 객체가 들어오면 방문 객체의 구현체 기능을 호출하여 기능을 수행하는데 이러면 책임 범위가 꼬이는거 아닌가?
- 요약 : 방문 처리 다형성 쌍 + 방문 객체 다형성 쌍