package ch15;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex05_FileViewer {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("test1.txt");
        int data = 0;

        while((data = fis.read()) != -1) {
            char c = (char) data;
            System.out.print(c);
        }
    }
}
