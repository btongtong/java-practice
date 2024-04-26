package ch7;

public class Child extends Parent {
    int x = 20; // Ex05 에서는 없게, Ex06 에서는 있게 해서 실행
    void method() {
        System.out.println("x = " + x);
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = " + super.x);
    }
}
