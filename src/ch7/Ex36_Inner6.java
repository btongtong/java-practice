package ch7;

public class Ex36_Inner6 {
    Object iv = new Object() { void method(){} };
    static Object cv = new Object() { void method(){} };

    void myMethod() {
        Object lv = new Object() { void method(){} };
    }
}
