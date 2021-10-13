package design.pattern.study.behavioral.observer.exam01;

public class Button {
    /**
     * 클릭 이벤트가 발생하게 되면 자기 인터페이스에 자신을 파라미터로 넘기고 인터페이스를 구현한 구현체가 받아서 처리
     */
    public void onClick() {
        // 이벤트 처리
        if (onClickListener != null)
            onClickListener.onClick(this);
    }
    /**
     * 옵저버 인터페이스 : 내부에 정의되어 사용
     */
    public interface OnClickListener {
        public void onClick(Button button);
    }

    /**
     * 정의한 인터페이스 사용
     */
    private OnClickListener onClickListener;

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }
}/////
