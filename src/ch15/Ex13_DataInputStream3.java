package ch15;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex13_DataInputStream3 {
    public static void main(String[] args) {
        int sum = 0;
        int score = 0;

        try (FileInputStream fis = new FileInputStream("test1.txt");
             DataInputStream dis = new DataInputStream(fis)){

            while(true) {
                score = dis.readInt();
                System.out.println(score);
                sum += score;
            }

        } catch (EOFException e) {
            System.out.println("점수의 총 합은 " + sum + "입니다.");
        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }
}
