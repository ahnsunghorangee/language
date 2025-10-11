package section06_access.b;

//import access.a.DefaultClass1;

import section06_access.a.Chapter04_PublicClass;

public class Chapter06_PublicClassOuterMain {
    public static void main(String[] args) {
        Chapter04_PublicClass publicClass = new Chapter04_PublicClass();

        // default 클래스는 다른 패키지에서 접근 불가하다.
        //DefaultClass1 class1 = new DefaultClass1();
        //DefaultClass2 class2 = new DefaultClass2();
    }
}
