package ch15;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex07_BufferedOutputStream1 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("test1.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos, 5);

            for(int i = '1'; i < '9'; i++) {
                bos.write(i);
            }

//            fos.close();
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
