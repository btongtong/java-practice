package ch15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex06_FileCopy {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("test1.txt");
        FileOutputStream fos = new FileOutputStream("test2.txt", true);

        int data = 0;
        while((data = fis.read()) != -1) {
            fos.write(data);
        }
        fis.close();
        fos.close();
    }
}
