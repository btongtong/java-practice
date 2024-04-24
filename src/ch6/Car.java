package ch6;

public class Car {
    String color;
    String gearType;
    int door;

//    Car() {}

    Car() {
        this("white", "auto", 4);
    }

    Car(String color) {
        this(color, "auto", 4);
    }

    Car(Car c) {
        color = c.color;
        gearType = c.gearType;
        door = c.door;
    }

    Car(String c, String g, int d) {
        color = c;
        gearType = g;
        door = d;
    }
}
