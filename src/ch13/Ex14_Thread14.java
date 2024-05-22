package ch13;

import javax.swing.*;

public class Ex14_Thread14 {
    public static void main(String[] args) throws Exception {
        Thread14_1 th1 = new Thread14_1();
        th1.start();

        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
        System.out.println("입력하신 값은 " + input + "입니다.");
        th1.interrupt();
        System.out.println("isInterrupted() : " + th1.isInterrupted());
    }
}
class Thread14_1 extends Thread {
    public void run () {
        int i = 10;

        while(i != 0 && !isInterrupted()) {
            System.out.println(i--);
            try {
                sleep(1000);
            } catch (InterruptedException e) { /* interrupt(); */ }
        }
        System.out.println("카운트가 종료되었습니다.");
    }
}
