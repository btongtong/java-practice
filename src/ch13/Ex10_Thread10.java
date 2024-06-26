package ch13;

import com.sun.jdi.ThreadReference;

public class Ex10_Thread10 implements Runnable{
    static boolean autoSave = false;

    public static void main(String[] args) {
        Thread t = new Thread(new Ex10_Thread10());
        t.setDaemon(true);  // 데몬 쓰레드 설정을 안하면 종료 되지 않음 while(true)
        t.start();

        for(int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
            System.out.println(i);

            if(i == 5)
                autoSave = true;
        }

        System.out.println("프로그램을 종료합니다.");

    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(3 * 1000);
            } catch (InterruptedException e) {}

            if(autoSave) {
                autoSave();
            }
        }
    }

    public void autoSave() {
        System.out.println("작업파일이 저장되었습니다.");
    }
}
