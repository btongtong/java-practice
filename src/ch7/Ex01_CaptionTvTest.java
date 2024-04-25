package ch7;

public class Ex01_CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv ctv = new CaptionTv();
        ctv.channel = 10;
        ctv.channelUp();
        System.out.println(ctv.channel);
        ctv.displayCaption("Hello, World");
        ctv.caption = true;
        ctv.displayCaption("Hello, World");
    }
}

class CaptionTv extends Tv {
    boolean caption;
    void displayCaption (String text) {
        if (caption) {
            System.out.println(text);
        }
    }
}
