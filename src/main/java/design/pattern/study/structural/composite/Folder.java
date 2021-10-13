package design.pattern.study.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 추상 클래스 확장 클래스
 */
public class Folder extends Component {

    List<Component> children = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    public boolean addComponent(Component component) {
        return children.add(component);
    }

    public boolean removeComponent(Component component) {
        return children.remove(component);
    }

}
