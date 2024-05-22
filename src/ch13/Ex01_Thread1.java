package ch13;

public class Ex01_Thread1 {
    public static void main(String[] args) {
        Thread1_1 t1 = new Thread1_1();

        Runnable r = new Thread1_2();
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();
    }
}

class Thread1_1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName());
        }
    }
}

class Thread1_2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}