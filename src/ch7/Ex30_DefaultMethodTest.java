package ch7;

public class Ex30_DefaultMethodTest {
    public static void main(String[] args) {
        Ex30_Child c = new Ex30_Child();
        c.method1();
        c.method2();
        MyInterface.staticMethod();
        MyInterface2.staticMethod();
    }
}

class Ex30_Child extends Ex30_Parent implements MyInterface, MyInterface2 {
    public void method1() {
        System.out.println("method1() in Ex30_Child");
    }
}

class Ex30_Parent {
    public void method2() {
        System.out.println("method2() in Ex30_Parent");
    }
}

interface MyInterface {
    default void method1() {
        System.out.println("method1() in MyInterface");
    }
    default void method2() {
        System.out.println("method2() in MyInterface");
    }
    static void staticMethod() {
        System.out.println("staticMethod() in MyInterface");
    }
}

interface MyInterface2 {
    default void method1() {
        System.out.println("method1() in MyInterface2");
    }
    static void staticMethod() {
        System.out.println("staticMethod() in MyInterface2");
    }
}