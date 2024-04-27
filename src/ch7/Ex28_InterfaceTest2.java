package ch7;

public class Ex28_InterfaceTest2 {
    public static void main(String[] args) {
        A2 a1 = new A2();
        a1.autoPlay(new B2());
        a1.autoPlay(new C2());
    }
}

class A2 {
    void autoPlay(I2 i) {
        i.play();
    }
}

interface I2 {
    public abstract void play();
}

class B2 implements I2 {

    @Override
    public void play() {
        System.out.println("play in B1 class");
    }

}

class C2 implements I2 {

    @Override
    public void play() {
        System.out.println("play in C1 class");
    }

}
