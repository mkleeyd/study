package design.pattern.study.structural.flyweight;

import java.util.Map;
import java.util.TreeMap;

/**
 * 매니저 객체 클래스
 */
public class FlyweightFactory {

    Map<String, Flyweight> pool;

    public FlyweightFactory() {
        this.pool = new TreeMap<>();
    }

    public Flyweight getFlyweight(String key) {

        Flyweight flyweight = pool.get(key);
        if (flyweight == null) {
            flyweight = new Flyweight(key);
            pool.put(key, flyweight);
            System.out.println("새로 생성" + key);
        } else {
            System.out.println("재사용" + key);
        }

        return flyweight;
    }

}/////
