package section08_final;

public class Chapter02_FinalFieldMain {

    public static void main(String[] args) {
        // final 필드 - 생성자 초기화
        // final을 필드에 사용할 경우 해당 필드는 생성자를 통해서 한번만 초기화 될 수 있다. (초기값이 없는 경우)
        System.out.println("생성자 초기화");
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);
        System.out.println(constructInit1.value);
        System.out.println(constructInit2.value);

        // final 필드 - 필드 초기화
        // final 필드의 초기값이 있는 경우 생성자로 초기화가 불가능하다.
        System.out.println("필드 초기화");
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();
        System.out.println(fieldInit1.value);
        System.out.println(fieldInit2.value);
        System.out.println(fieldInit3.value);

        //상수
        // final로 선언하여 각 인스턴스 별로 값을 따로 관리하는 것보다 static final 공용으로 빼는 것이 더 효과적이다.
        System.out.println("상수");
        System.out.println(FieldInit.CONST_VALUE);
    }
}
