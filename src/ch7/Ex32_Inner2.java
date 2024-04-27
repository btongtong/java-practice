package ch7;

public class Ex32_Inner2 {
    class InstanceInner2 {}
    static class StaticInner2 {}

    InstanceInner2 iv = new InstanceInner2();
    static StaticInner2 cv = new StaticInner2();

    static void staticMethod() {
//        InstanceInner2 obj1 = new InstanceInner2();   // static 멤버는 인스턴스 멤버에 직접 접근 불가
        StaticInner2 obj2 = new StaticInner2();

        Ex32_Inner2 outer = new Ex32_Inner2();
        InstanceInner2 obj1 = outer.new InstanceInner2();
    }

    void instanceMethod() {
        InstanceInner2 obj1 = new InstanceInner2();
        StaticInner2 obj2 = new StaticInner2();
//        LocalInner2 lv = new LocalInner();    // 메서드 내에 지역적으로 선언된 내부 클래스는 외부 접근 불가
    }

    void myMethod() {
        class LocalInner {}
        LocalInner lv = new LocalInner();
    }
}
