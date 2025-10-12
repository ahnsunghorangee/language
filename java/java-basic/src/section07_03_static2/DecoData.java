package section07_03_static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        // instanceValue++; // 인스턴스 변수 접근, compile error
        // instanceMethod(); // 인스턴스 메서드 접근, compile error
        // Why? 인스턴스 기능을 사용하기 위해서는 인스턴스 참조값을 알아야 하는데, 정적 메서드는 참조값 없이 호출이 가능하기 때문.

        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메서드 접근
    }

    public void instanceCall() {
        instanceValue++; //인스턴스 변수 접근
        instanceMethod(); //인스턴스 메서드 접근

        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메서드 접근
    }


    private void instanceMethod() {
        System.out.println("instanceValue=" + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue=" + staticValue);
    }
}
