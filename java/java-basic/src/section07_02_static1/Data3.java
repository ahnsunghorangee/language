package section07_02_static1;

public class Data3 {
    public String name; // 멤버변수 (인스턴스 변수)
    public static int count; // 멤버변수 (클래스 변수)

    public Data3(String name) {
        this.name = name;
        count++;
    }
}
