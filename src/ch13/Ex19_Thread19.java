package ch13;

public class Ex19_Thread19 {
    static long startTime = 0;
    public static void main(String[] args) {
        Thread19_1 th1 = new Thread19_1();
        Thread19_2 th2 = new Thread19_2();
        th1.start();
        th2.start();
        startTime = System.currentTimeMillis();

        try {
            th1.join();
            th2.join();
        } catch (InterruptedException e) {}

        System.out.println("소요시간: " + (System.currentTimeMillis() - startTime));
    }
}

class Thread19_1 extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 300; i++) {
            System.out.print(new String("-"));
        }
    }
}

class Thread19_2 extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 300; i++) {
            System.out.print(new String("|"));
        }
    }
}