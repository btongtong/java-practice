package ch7;

public class Ex29_InterfaceTest3 {
    public static void main(String[] args) {
        A3 a = new A3();
        a.methodA();
    }
}

class A3 {
    void methodA() {
        I3 i = InstanceManager.getInstance();
        i.methodB();
        System.out.println(i.toString());
    }
}

interface I3 {
    public abstract void methodB();
}

class B3 implements I3 {

    @Override
    public void methodB() {
        System.out.println("methodB in B3 class");
    }

    public String toString() {
        return "class B3";
    }

}

class InstanceManager {
    public static I3 getInstance() {
        return new B3();
    }
}