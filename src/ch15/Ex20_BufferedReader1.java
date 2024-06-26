package ch15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex20_BufferedReader1 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("test1.txt");
            BufferedReader br = new BufferedReader(fr);

            String line = "";
            for(int i = 1; (line = br.readLine()) != null; i++) {
                if(line.indexOf(";") != -1)
                    System.out.println(i +":" + line);
            }
        } catch (IOException e) {}
    }
}
