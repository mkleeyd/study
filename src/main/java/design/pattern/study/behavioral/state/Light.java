package design.pattern.study.behavioral.state;

public class Light {

    protected LightState lightState;
    private LightState offState = new LightState() {
        @Override
        public void on() {
            System.out.println("Light On");
            lightState = onState;
        }

        @Override
        public void off() {
            System.out.println("Noting");
        }
    };/////

    private LightState onState = new LightState() {
        @Override
        public void on() {
            System.out.println("Noting");
        }

        @Override
        public void off() {
            System.out.println("Light Off");
            lightState = offState;
        }
    };/////

    public Light() {
        lightState = offState;
    }
    
    public void on() {
        lightState.on();
    }

    public void off() {
        lightState.off();
    }

}/////

/**
 * 기능 선언 인터페이스
 *
 * 상태를 갖는 인터페이스
 */
interface LightState {
    void on();
    void off();
}/////