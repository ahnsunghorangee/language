package section08_final;

public class Chapter05_FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data();
//        data = new Data(); // final로 선언하여 참조값을 변경할 수 없다.

        //참조 대상의 값은 변경 가능
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
    }
}
