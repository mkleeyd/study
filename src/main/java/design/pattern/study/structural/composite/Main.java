package design.pattern.study.structural.composite;

/**
 * <컴포지트 패턴___구조>
 *   - 컨테이너(그릇)와 내용물(객체)을 같게 다루기
 *   - 컴포지트 패턴을 통해서 트리 구조 구현
 *
 * 예제 요구사항
 *   -
 *
 * <관통되는 개념 요약>
 *    - "기능 정의(추상 클래스)"과 "기능 사용(상속)" 쌍과 컨테이너 자체를 List로 만들어 컨테이너와 내용물을 같게 카테고리로 만들어 사용하는 것
 */
public class Main {

    public static void main(String[] args) {
        Folder
            root = new Folder("root"),
            home = new Folder("home"),
            garam = new Folder("garam"),
            music = new Folder("music"),
            picture = new Folder("picture"),
            doc = new Folder("doc"),
            usr = new Folder("usr");

        File
            track1 = new File("track1"),
            track2 = new File("track2"),
            pic1 = new File("pic1"),
            doc1 = new File("doc1"),
            java = new File("java");

        root.addComponent(home);
            home.addComponent(garam);
                garam.addComponent(music);
                    music.addComponent(track1);
                    music.addComponent(track2);
                garam.addComponent(picture);
                    picture.addComponent(pic1);
                garam.addComponent(doc);
                    doc.addComponent(doc1);

        root.addComponent(usr);
            usr.addComponent(java);

    }
}/////
