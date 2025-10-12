package section07_03_static2;

public class Chapter07_DecoMain2 {

    public static void main(String[] args) {
        String s = "hello java";
        String deco = DecoUtil2.deco(s); // static 메서드 (=정적 메서드 또는 클래스 메서드)


        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
}
