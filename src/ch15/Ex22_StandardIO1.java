package ch15;

import java.io.IOException;

public class Ex22_StandardIO1 {
    public static void main(String[] args) {
        try {
            int input = 0;

            while((input = System.in.read()) != -1) {
                System.out.println("input: " + input + ", (char)input: " + (char)input);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
