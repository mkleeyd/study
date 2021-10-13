package design.pattern.study.creational.singleton;

public class SystemSpeaker {

    /**
     * 외부에 접근 안되도록 private 범위 정하고 실행시 맨 처음 올라가도록 static 키워드 선언
     * (첨엔 static 이 아니라 final 인줄 알았음)
     */

    static private SystemSpeaker instance;
    private int volume;

    private SystemSpeaker() {
        volume = 5;
    }

    public static SystemSpeaker getInstance() {
        if (instance == null) {
            instance = new SystemSpeaker();
            System.out.println("객체 생성");
        } else {
            System.out.println("이미 생성");
        }
        return instance;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}/////
