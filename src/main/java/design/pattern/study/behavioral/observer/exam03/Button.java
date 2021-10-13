package design.pattern.study.behavioral.observer.exam03;

public class Button {

    // 델리게이트 : 위임할 객체 필드로 가져옴
    private Observable<String> observable;

    public Button() {
        observable = new Observable<String>();
    }

    public void addObserver(Observable.Observer<String> o) {
        observable.addObserver(o);
    }

    public void notifyObservers() {
        observable.notifyObservers(null);
    }

    public void onClick() {
        observable.setChanged();
        notifyObservers();
    }
}/////
