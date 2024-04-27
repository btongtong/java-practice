package ch7;

public class Ex34_Inner4 {
    public static void main(String[] args) {
        Outer oc = new Outer();
        Outer.InstanceInner4 ii = oc.new InstanceInner4();

        System.out.println("ii.iv : " + ii.iv);
        System.out.println("Outer.StaticInner.cv : " + Outer.StaticInner4.cv);

        Outer.StaticInner4 si = new Outer.StaticInner4();
        System.out.println("si.iv : " + si.iv);
    }
}

class Outer {
    class InstanceInner4 {
        int iv = 100;
    }

    static class StaticInner4 {
        int iv = 200;
        static int cv = 300;
    }

    void myMethod() {
        class LocalInner4 {
            int iv = 400;
        }
    }
}
