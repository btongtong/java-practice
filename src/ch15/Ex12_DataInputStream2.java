package ch15;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex12_DataInputStream2 {
    public static void main(String[] args) {
        int sum = 0;
        int score = 0;

        FileInputStream fis = null;
        DataInputStream dis = null;

        try {
            fis = new FileInputStream("test1.txt");
            dis = new DataInputStream(fis);

            while(true) {
                score = dis.readInt();
                System.out.println(score);
                sum += score;
            }
        } catch (EOFException e) {
            System.out.println("점수의 총 합은 " + sum + "입니다.");
        } catch (IOException ie) {
            ie.printStackTrace();
        } finally {
            try {
                if(dis != null)
                    dis.close();
            } catch (IOException ie) {
                ie.printStackTrace();
            }
        }
    }
}
