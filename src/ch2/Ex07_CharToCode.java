package ch2;

public class Ex07_CharToCode {
    public static void main(String[] args) {
        char ch = 'A';
        int code = (int) ch;

        System.out.printf("%c = %d(%#X)%n", ch, code, code);

        char ch2 = '가';
        System.out.printf("%c = %d(%#X)%n", ch2, (int)ch2, (int)ch2);

        char ch3 = 0xAC00;
        System.out.printf("%c", ch3);
    }
}
