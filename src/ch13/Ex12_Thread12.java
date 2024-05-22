package ch13;

public class Ex12_Thread12 {
    public static void main(String[] args) {
        Thread12_1 th1 = new Thread12_1();
        Thread12_2 th2 = new Thread12_2();
        th1.start();
        th2.start();

        try {
            th1.sleep(2000);
        } catch (InterruptedException e) {}

        System.out.println("<< main 종료 >>");
    }
}

class Thread12_1 extends Thread{
    @Override
    public void run () {
        for(int i = 0; i < 300; i++) {
            System.out.print("-");
        }
        System.out.print("<< th1 종료 >>");
    }
}

class Thread12_2 extends Thread{
    @Override
    public void run () {
        for(int i = 0; i < 300; i++) {
            System.out.print("|");
        }
        System.out.print("<< th2 종료 >>");
    }
}
