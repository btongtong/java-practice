package ch13;

import java.util.Iterator;
import java.util.Map;

public class Ex11_Thread11 {
    public static void main(String[] args) throws Exception {
        Thread11_1 t1 = new Thread11_1("Thread1");
        Thread11_2 t2 = new Thread11_2("Thread2");
        t1.start();
        t2.start();
    }
}
class Thread11_1 extends Thread {
    Thread11_1(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            sleep(5 * 1000);
        } catch (InterruptedException e) {}
    }
}
class Thread11_2 extends Thread {
    Thread11_2(String name) {
        super(name);
    }

    @Override
    public void run() {
        Map map = getAllStackTraces();
        Iterator it = map.keySet().iterator();

        int x = 0;
        while(it.hasNext()) {
            Object obj = it.next();
            Thread t = (Thread) obj;
            StackTraceElement[] ste = (StackTraceElement[]) (map.get(obj));

            System.out.println(
                    "[" + ++x + "] name : " + t.getName() +
                    ", group : " + t.getThreadGroup() +
                    ", daemon : " + t.isDaemon()
            );

            for(int i = 0; i < ste.length; i++) {
                System.out.println(ste[i]);
            }
            System.out.println();
        }
    }
}