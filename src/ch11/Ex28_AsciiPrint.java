package ch11;

public class Ex28_AsciiPrint {
    public static void main(String[] args) {
        char ch = ' ';
        for(int i = 0; i < 95; i++) {
            System.out.print(ch++);
        }
    }
}
