package section07_03_static2.ex;

import static section07_03_static2.ex.MathArrayUtils.*;

public class Chapter10_MathArrayUtilsMain {

    public static void main(String[] args) {
//        MathArrayUtils mathArrayUtils = new MathArrayUtils(); // 생성자를 private으로 만들어, 객체를 생성하지 못하도록 막음.

        int[] values = {1, 2, 3, 4, 5};
        System.out.println("sum=" + sum(values));
        System.out.println("average=" + average(values));
        System.out.println("min=" + min(values));
        System.out.println("max=" + max(values));
    }
}
