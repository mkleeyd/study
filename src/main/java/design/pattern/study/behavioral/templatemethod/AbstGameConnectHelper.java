package design.pattern.study.behavioral.templatemethod;

/**
 * 보안상 알고리즘의 단계이기 때문에 외부에 노출이 되면 안된다
 * 하지만 하위 클래스에서 "재정의"를 해줘야 하기 때문에 private 로 범위를 지정해서도 안된다
 * 외부에서는 호출을 하면 안되는데 하위 클래스에선 호출이 되도록 만들어야 한다
 *
 * 따라서, 동일 패키지 또는 상속 관계 범위인 protected 로 범위를 지정하여
 */
public abstract class AbstGameConnectHelper {

    // step.1 보안 단계
    protected abstract String doSecurity(String string);

    // step.2 인증 단계
    protected abstract boolean authentication(String id, String password);

    // step.3 권한 단계
    protected abstract int authorization(String userName);

    // step.4 접속 단계
    protected abstract String connection(String info);

    /**
     * 접속을 도와주는 "템플릿 메서드"
     *
     * 프로세스를 템플릿 메서드에 정의해주기
     */
    public String requestConnection(String encodedInfo){
        // 보안 작업 -> 암호화된 파라미터를 복호화
        String decodedInfo = doSecurity(encodedInfo);
        // 반환된 것을 가지고 아이디, 암호를 할당한다
        String id = "aaa";
        String password = "bbb";

        // 인증 작업
        if (!authentication(id, password)) {
            throw new Error("아이디 암호 불일치");
        }
        // 권한 작업
        String userNAme = "userNAme";
        int i = authorization(userNAme);

        switch (i) {
            case -1:
                throw new Error("10시 이후 제한");
            case 0:
                System.out.println("게임 매니저");
                break;
            case 1:
                System.out.println("유료 회원");
                break;
            case 2:
                System.out.println("무료 회원");
                break;
            case 3:
                System.out.println("권한 없음");
                break;
            default:
                System.out.println("기타 상황");
                break;
        }
        //
        return connection(decodedInfo);
    }

}/////
