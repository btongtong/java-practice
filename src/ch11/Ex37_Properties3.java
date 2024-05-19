package ch11;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Ex37_Properties3 {
    public static void main(String[] args) {
        Properties prop = new Properties();

        prop.setProperty("timeout", "20");
        prop.setProperty("language", "한글");
        prop.setProperty("size", "10");
        prop.setProperty("capacity", "10");

        try {
            prop.store(new FileOutputStream("output.txt"), "Properties Examole");
            prop.storeToXML(new FileOutputStream("output.xml"), "Properties Example");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
