package ch16;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class Ex05_Network5 {
    public static void main(String[] args) {
        URL url = null;
        InputStream in = null;
        FileOutputStream out = null;
        String address = "http://www.mypickebook.org/communication/data_view.html?page=5&sch_type=&sch_word=&idx=66/전자도서제작안내서_230831.pdf";

        int ch = 0;

        try {
            url = new URL(address);
            in = url.openStream();
            out = new FileOutputStream("전자도서제작안내서_230831.pdf");

            while((ch = in.read()) != -1) {
                out.write(ch);
            }
            in.close();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
