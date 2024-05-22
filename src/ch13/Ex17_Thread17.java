package ch13;

public class Ex17_Thread17 {
    public static void main(String[] args) {
        Thread17_1 th1 = new Thread17_1("*");
        Thread17_1 th2 = new Thread17_1("**");
        Thread17_1 th3 = new Thread17_1("***");
        th1.start();
        th2.start();
        th3.start();

        try {
            Thread.sleep(2000);
            th1.suspend();
            Thread.sleep(2000);
            th2.suspend();
            Thread.sleep(3000);
            th1.resume();
            Thread.sleep(3000);
            th1.stop();
            th2.stop();
            Thread.sleep(2000);
            th3.stop();
        } catch (InterruptedException e) {}
    }
}

class Thread17_1 implements Runnable {
    volatile boolean suspended = false;
    volatile boolean stopped = false;

    Thread th;

    Thread17_1(String name) {
        th = new Thread(this, name);
    }

    @Override
    public void run() {
        while(!stopped) {
            if(!suspended) {
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {}
            }
        }
        System.out.println(Thread.currentThread().getName() + " - stopped");
    }
    public void suspend() { suspended = true; }
    public void resume() { suspended = false; }
    public void stop() { stopped = true; }
    public void start() { th.start(); }
}