package ch13;

public class Ex03_Thread3 {
    public static void main(String[] args) throws Exception{
        Thread3_1 t1 = new Thread3_1();
        t1.run();
    }
}

class Thread3_1 extends Thread {
    @Override
    public void run() {
        throwException();
    }

    public void throwException() {
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}