package ch7;

public class Ex31_Inner1 {
    class InstanceInner1 {
        int iv = 100;
//        static int cv = 100;  // static 클래스가 아니면 static 멤버 정의 불가능
        final static int CONST = 100;
    }

    static class StaticInner1 {
        int iv = 200;
        static int cv = 200;
    }

    void myMethod() {
        class LocalInner {
            int iv = 300;
//            static int cv = 300;
            final static int CONST = 300;
        }
    }

    public static void main(String[] args) {
        System.out.println(InstanceInner1.CONST);
        System.out.println(StaticInner1.cv);
    }
}
