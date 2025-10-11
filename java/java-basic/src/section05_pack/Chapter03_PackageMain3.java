package section05_pack;

import section05_pack.a.User;

public class Chapter03_PackageMain3 {

    public static void main(String[] args) {
        // 같은 이름의 클래스를 사용해야 하는 경우, 자주 사용하는 클래스를 import하고 다른 하나는 경로로 불러온다.
        User userA = new User();
        section05_pack.b.User userB = new section05_pack.b.User();
    }
}
