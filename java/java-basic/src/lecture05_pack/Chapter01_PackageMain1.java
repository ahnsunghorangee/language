package lecture05_pack;

public class Chapter01_PackageMain1 {

    public static void main(String[] args) {
        Data data = new Data(); // 사용자와 같은 위치: 패키지 경로 생략 가능
        lecture05_pack.a.User user = new lecture05_pack.a.User(); // 사용자와 다른 위치: 패키지 전체 경로를 포함해서 클래스를 적어줘야 한다.
    }
}
