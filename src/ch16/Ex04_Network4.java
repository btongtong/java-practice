package ch16;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class Ex04_Network4 {
    public static void main(String[] args) {
        URL url = null;
        BufferedReader input = null;
        String address = "https://github.com/dashboard";
        String line = "";

        try {
            url = new URL(address);
            input = new BufferedReader(new InputStreamReader(url.openStream()));

            while((line = input.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
