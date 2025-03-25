package lang.object.poly;

public class ObjectPolyExample01 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        Object o = dog; // Object는 다 담을 수 있다.

        action(dog);
        action(car);
    }

    private static void action(Object obj) {
        // obj.sound(); // 컴파일 오류, Object는 sound()가 없다.

        // 객체에 맞는 다운캐스팅 필요
        // 다운캐스팅 방법1
        if (obj instanceof Dog) {
            ((Dog) obj).sound();
        }

        // 다운캐스팅 방법2
        if (obj instanceof Dog dog) {
            dog.sound();
        } else if (obj instanceof Car car) {
            car.move();
        }
    }
}
