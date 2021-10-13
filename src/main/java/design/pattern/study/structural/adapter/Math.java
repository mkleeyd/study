package design.pattern.study.structural.adapter;

/**
 * 이미 구현되어 있는 기능
 */
public class Math {

    // 두배
    public static double twiceOf(Double num){
        return  num * 2;
    }

    // 절반
    public static double halfOf(Double num) {
        if(num == 0) return 0;
        else return num / 2;

    }

    // 추가 요구사항 알고리즘
    public static Double doubled(Double d){
        return d * 2;
    }


}
