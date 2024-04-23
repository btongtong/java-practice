package ch6;

public class Ex13_ReturnTest {
    public static void main(String[] args) {
        Ex13_ReturnTest r = new Ex13_ReturnTest();

        int result = r.add(3, 5);
        System.out.println(result);

        int[] result2 = {0};
        r.add(3, 5, result2);
        System.out.println(result2[0]);
    }

    int add(int a, int b) {
        return a + b;
    }

    void add(int a, int b, int[] result) {
        result[0] = a + b;
    }
}
