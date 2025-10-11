package section06_access.a;

public class Chapter05_PublicClassInnerMain {
    public static void main(String[] args) {
        // 같은 패키지에 존재하여 default 클래스를 사용할 수 있다.
        Chapter04_PublicClass publicClass = new Chapter04_PublicClass();
        DefaultClass1 class1 = new DefaultClass1();
        DefaultClass2 class2 = new DefaultClass2();
    }
}
