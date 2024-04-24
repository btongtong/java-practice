package ch6;

public class Ex27_BlockTest {
    static {
        System.out.println("static { }");
    }
    {
        System.out.println("{ }");
    }

    public Ex27_BlockTest() {
        System.out.println("생성자");
    }

    public static void main(String[] args) {
        System.out.println("Ex27_BlockTest bt = new Ex27_BlockTest();");
        Ex27_BlockTest bt = new Ex27_BlockTest();

        System.out.println("Ex27_BlockTest bt2 = new Ex27_BlockTest();");
        Ex27_BlockTest b2 = new Ex27_BlockTest();
    }
}
