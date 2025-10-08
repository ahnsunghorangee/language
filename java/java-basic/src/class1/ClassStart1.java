package class1;

public class ClassStart1 {
    public static void main(String[] args) {
        // 변수는 참조값을 보관하는 역할
        Student student1 = new Student(); // student1은 x001이라는 참조값을 가지고 있다.
        student1.name = "홍길동";
        student1.age = 10;
        student1.grade = 80;
        System.out.println(student1);

        // students 또한 참조값을 보관한다.
        Student[] students = new Student[2]; // 새로운 참조값 x005 생성
        students[0] = student1; // x001 참조값을 students[0]에 넣어준다.
        System.out.println(students[0]);


    }
}
