package ch7;

public class Ex16_CastingTest2 {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = null;
        FireEngine fe = null;

        car.drive();
        fe = (FireEngine) car;
        fe.drive(); // casting error!
        car2 = fe;
        car2.drive();
    }
}
