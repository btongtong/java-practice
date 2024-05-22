package ch13;

public class Ex02_Thread2 {
    public static void main(String[] args) throws Exception {
        Thread2_1 t1 = new Thread2_1();
        t1.start();
    }
}

class Thread2_1 extends Thread {
    @Override
    public void run() {
        throwException();
    }
    public void throwException() {
        try{
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}