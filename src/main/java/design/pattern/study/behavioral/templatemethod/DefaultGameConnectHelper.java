package design.pattern.study.behavioral.templatemethod;

public class DefaultGameConnectHelper extends AbstGameConnectHelper {

    @Override
    protected String doSecurity(String string) {
        System.out.println("강화된 알고리즘을 이용한 디코딩 시작");
        System.out.println("디코드");
        return string;
    }

    @Override
    protected boolean authentication(String id, String password) {
        System.out.println("아이디/암호 확인 과정");
        return true;
    }

    @Override
    protected int authorization(String userName) {
        System.out.println("권한 확인");
        // 서버에서 유저이름을 가지고 유저 나이를 확인하고 현재 시간과 확인 후 제한하기
        return 0;
    }

    @Override
    protected String connection(String info) {
        System.out.println("마지막 접속 단계:: 스레드 생성하여 반환해줌");
        return info;
    }
}
