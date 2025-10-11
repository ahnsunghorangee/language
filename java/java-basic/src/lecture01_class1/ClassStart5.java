package lecture01_class1;

public class ClassStart5 {

    public static void main(String[] args) {
        // 변수는 참조값을 보관하는 역할
        Student student1 = new Student(); // student1은 x001이라는 참조값을 가지고 있다.
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student(); //x002
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        // students 또한 참조값을 보관한다.
        Student[] students = new Student[]{student1, student2};

        for (int i = 0; i < students.length; i++) {
            System.out.println("이름:" + students[i].name + " 나이:" + students[i].age + " 성적:" + students[i].grade);
        }
    }
}
