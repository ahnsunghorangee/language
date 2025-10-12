package section08_final.ex;

public class Chapter06_MemberMain {

    public static void main(String[] args) {
        Member member = new Member("myId", "kim");
        member.print();
        member.changeData("myId2", "seo");
        member.print();
    }
}
