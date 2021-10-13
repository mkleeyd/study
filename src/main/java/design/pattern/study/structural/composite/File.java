package design.pattern.study.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 추상 클래스 확장 클래스
 */
public class File extends Component {
    
    private Object data;

    public File(String name) {
        super(name);
    }

    public Object getData() {
        return data;
    }


    public void setData(Object data) {
        this.data = data;
    }
}
